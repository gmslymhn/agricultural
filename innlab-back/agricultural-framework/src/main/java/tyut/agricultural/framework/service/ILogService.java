package tyut.agricultural.framework.service;

import tyut.agricultural.common.domain.R;
import tyut.agricultural.framework.domain.dto.param.LogParam;

/**
 * @ClassName: ILogService
 * @Description:
 * @Author: gmslymhn
 * @CreateTime: 2024-07-23 10:23
 * @Version: 1.0
 **/
public interface ILogService {
    R getLoginLogList(LogParam logParam);

    R getSysLogList(LogParam logParam);

    R getAccessLogList(LogParam logParam);
}
