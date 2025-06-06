package tyut.agricultural.framework.web.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import tyut.agricultural.framework.domain.model.LoginUser;
import tyut.agricultural.common.utils.ObjectUtils;
import tyut.agricultural.common.utils.StringUtils;
import tyut.agricultural.framework.web.SecurityUtils;

/**
 * @ClassName: PermissionService
 * @Description:
 * @Author: gmslymhn
 * @CreateTime: 2024-05-21 03:28
 * @Version: 1.0
 **/
@Service("ss")
@Slf4j
public class PermissionService {
    @Autowired
    WebApplicationContext applicationContext;
    /**
     * 判断角色是否具有某角色
     * @param permission
     * @return
     */

    public boolean hasPermission(String permission){
        if (StringUtils.isEmpty(permission)) {
            return false;
        }
        LoginUser loginUser = SecurityUtils.getLoginUser();
        if (ObjectUtils.isNull(loginUser) ||ObjectUtils.isNull(loginUser.getPermission())) {
            return false;
        }
        if (loginUser.getPermission().equals(permission)){
            return true;
        }
        return false;
    }
    public boolean hasPort(String port){
        if (StringUtils.isEmpty( port)) {
            return false;
        }
        LoginUser loginUser = SecurityUtils.getLoginUser();
        if (ObjectUtils.isNull(loginUser) ||ObjectUtils.isNull(loginUser.getPermission())) {
            return false;
        }
        if (loginUser.getPermission().equals("admin")){
            return true;
        }
        if (loginUser.getPort().contains(port)){
            return true;
        }
        return false;
    }

}
