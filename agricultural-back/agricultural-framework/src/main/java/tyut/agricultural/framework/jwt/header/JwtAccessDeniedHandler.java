package tyut.agricultural.framework.jwt.header;

import com.alibaba.fastjson2.JSON;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;
import tyut.agricultural.common.domain.R;
import tyut.agricultural.common.utils.http.ServletUtils;

import java.io.IOException;

/**
 * @ClassName: JwtAccessDeniedHandler
 * @Description:
 * @Author: gmslymhn
 * @CreateTime: 2024-05-19 18:54
 * @Version: 1.0
 **/
@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        response.setContentType("application/json;charset=UTF-8");
        String msg = "未授权！";

        ServletUtils.renderString(response, JSON.toJSONString(R.error(msg)));
    }
}
