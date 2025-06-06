package tyut.agricultural.framework.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.multipart.MultipartFile;
import tyut.agricultural.common.domain.Lz;
import tyut.agricultural.common.domain.R;
import tyut.agricultural.framework.domain.dto.param.ResourceParam;
import tyut.agricultural.framework.domain.vo.CookieVo;

import java.util.concurrent.CompletableFuture;

/**
 * @ClassName: IResourceService
 * @Description:
 * @Author: gmslymhn
 * @CreateTime: 2024-05-23 16:05
 * @Version: 1.0
 **/
public interface IResourceService {
    R addResource(MultipartFile file, String fileDescription,Integer type);

    R addResource2(MultipartFile file, String fileDescription, Integer type);

    R addResourceForCloud(Integer resourceId);

    R addResourceForCloud2(Integer resourceId);

    R cacheCookie(CookieVo cookieVo);

    R getResourceLz(Integer resourceId);

    R getResourcelist(ResourceParam resourceParam);

    @Async
    CompletableFuture<String> getResourceByLz(Lz lz);

    R getResourceByLz2(Lz lz);
}
