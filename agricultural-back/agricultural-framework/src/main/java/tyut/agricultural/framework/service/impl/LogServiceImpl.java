package tyut.agricultural.framework.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tyut.agricultural.common.domain.R;
import tyut.agricultural.common.utils.StringUtils;
import tyut.agricultural.framework.domain.dto.param.LogParam;
import tyut.agricultural.framework.domain.entity.AccessLogEntity;
import tyut.agricultural.framework.domain.entity.LoginLogEntity;
import tyut.agricultural.framework.domain.entity.SysLogEntity;
import tyut.agricultural.framework.mapper.AccessLogMapper;
import tyut.agricultural.framework.mapper.LoginLogMapper;
import tyut.agricultural.framework.mapper.SysLogMapper;
import tyut.agricultural.framework.service.ILogService;

/**
 * @ClassName: LogServiceimpl
 * @Description:
 * @Author: gmslymhn
 * @CreateTime: 2024-07-23 10:22
 * @Version: 1.0
 **/
@Service
public class LogServiceImpl implements ILogService {
    @Autowired
    private LoginLogMapper loginLogMapper;
    @Autowired
    private SysLogMapper sysLogMapper;
    @Autowired
    private AccessLogMapper accessLogMapper;

    @Override
    public R getLoginLogList(LogParam logParam){
        Page<LoginLogEntity> page = new Page<>(logParam.getPageNum(),logParam.getPageSize());
        QueryWrapper<LoginLogEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(StringUtils.isNotEmpty(logParam.getUserAccount()),"user_account",logParam.getUserAccount())
                .eq(StringUtils.isNotEmpty(logParam.getIp()),"login_ip",logParam.getIp());
        IPage<LoginLogEntity> loginLogEntityIPage = loginLogMapper.selectPage(page, queryWrapper);
        return R.success(loginLogEntityIPage);
    }

    @Override
    public R getSysLogList(LogParam logParam){
        Page<SysLogEntity> page = new Page<>(logParam.getPageNum(),logParam.getPageSize());
        QueryWrapper<SysLogEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(StringUtils.isNotEmpty(logParam.getUserAccount()),"user_account",logParam.getUserAccount())
                .eq(StringUtils.isNotEmpty(logParam.getIp()),"ip",logParam.getIp());
        IPage<SysLogEntity> sysLogEntityIPage = sysLogMapper.selectPage(page, queryWrapper);
        return R.success(sysLogEntityIPage);
    }


    @Override
    public R getAccessLogList(LogParam logParam){
        Page<AccessLogEntity> page = new Page<>(logParam.getPageNum(),logParam.getPageSize());
        QueryWrapper<AccessLogEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(StringUtils.isNotEmpty(logParam.getIp()),"access_ip",logParam.getIp());
        IPage<AccessLogEntity> accessLogEntityIPage = accessLogMapper.selectPage(page, queryWrapper);
        return R.success(accessLogEntityIPage);
    }
}
