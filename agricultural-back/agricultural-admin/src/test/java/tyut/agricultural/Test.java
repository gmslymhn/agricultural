package tyut.selab;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tyut.agricultural.framework.domain.PageParam;
import tyut.agricultural.framework.domain.entity.AccessLogEntity;
import tyut.agricultural.framework.domain.entity.ResourceEntity;
import tyut.agricultural.framework.mapper.AccessLogMapper;
import tyut.agricultural.framework.mapper.ResourceMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: Test
 * @Description:
 * @Author: gmslymhn
 * @CreateTime: 2024-08-08 23:22
 * @Version: 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    private SubTitleMapper subTitleMapper;

    @Autowired
    private ResourceMapper resourceMapper;
    @Autowired
    private ActivityMapper activityMapper;

    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private AccessLogMapper accessLogMapper;

    @org.junit.Test
    public void test1(){
        PageParam param = new PageParam(1,1);
        Page<SubTitleEntity> page = new Page<>(param.getPageNum(),param.getPageSize());
        QueryWrapper<SubTitleEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("activity_id",99)
                .orderByDesc("subtitle_sort");
        IPage<SubTitleEntity> subTitleEntityIPage = subTitleMapper.selectPage(page, queryWrapper);
        List<SubTitleEntity> subTitleEntityList = subTitleEntityIPage.getRecords();
        if (subTitleEntityList.size()==0){
            System.out.println("3211321");
        }
        System.out.println(subTitleEntityList);
    }


    public static List<String> extractHttpsUrls(String input) {
        List<String> httpsUrls = new ArrayList<>();
        String regex = "\"https_url\": \"(.*?)\"";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String url = matcher.group(1);
            httpsUrls.add(url);
        }

        return httpsUrls;
    }

    @org.junit.Test
    public void test2(){
        String abc = "\"thumb_url\": \"http://picabstract.preview.ftn.qq.com/ftn_pic_abs_v3/8b6c0a4a3aabfd726f8ec1b178a1d8320530ec0ab182ca3a60957693fb1f73fa480b3626af11c8b2ed0a0e2a2f2a19dc?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-16IiPYD.jpg\",\n" +
                "                                    \"https_url\": \"https://picabstract-preview-ftn.weiyun.com/ftn_pic_abs_v3/8b6c0a4a3aabfd726f8ec1b178a1d8320530ec0ab182ca3a60957693fb1f73fa480b3626af11c8b2ed0a0e2a2f2a19dc?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-16IiPYD.jpg\",\n" +
                "                                    \"thumb_url\": \"http://picabstract.preview.ftn.qq.com/ftn_pic_abs_v3/d664bba3ecf824fa7e80643b8157650894d5b009bc1e4db7592c6695b2afa82dc7d4b673cc38099b5227595d2ded0ad0?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-16Phgoo.jpg\",\n" +
                "                                    \"https_url\": \"https://picabstract-preview-ftn.weiyun.com/ftn_pic_abs_v3/d664bba3ecf824fa7e80643b8157650894d5b009bc1e4db7592c6695b2afa82dc7d4b673cc38099b5227595d2ded0ad0?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-16Phgoo.jpg\",\n" +
                "                                    \"thumb_url\": \"http://picabstract.preview.ftn.qq.com/ftn_pic_abs_v3/2537b1e13aa8b7a6386d26cc3301dfa455026a6d9df1a77f83c0d8100aa5a8246fc65da4ff5394f439390dac63944127?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-16e061W.jpg\",\n" +
                "                                    \"https_url\": \"https://picabstract-preview-ftn.weiyun.com/ftn_pic_abs_v3/2537b1e13aa8b7a6386d26cc3301dfa455026a6d9df1a77f83c0d8100aa5a8246fc65da4ff5394f439390dac63944127?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-16e061W.jpg\",\n" +
                "                                    \"thumb_url\": \"http://picabstract.preview.ftn.qq.com/ftn_pic_abs_v3/fffe455302618513e36fbcb9311a9449e3521aad7be1ef4ca910964e9555cb5ae91b1395a23e5237f77161ae22b4f2c5?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-16wmfqw.jpg\",\n" +
                "                                    \"https_url\": \"https://picabstract-preview-ftn.weiyun.com/ftn_pic_abs_v3/fffe455302618513e36fbcb9311a9449e3521aad7be1ef4ca910964e9555cb5ae91b1395a23e5237f77161ae22b4f2c5?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-16wmfqw.jpg\",\n" +
                "                                    \"thumb_url\": \"http://picabstract.preview.ftn.qq.com/ftn_pic_abs_v3/8dabc865b79ba199dca2cf936ec197ca1fee62196f60cbd6733a5bcadb4a065010d38184bbfbb6a624a782755b44a870?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-17E4AxW.jpg\",\n" +
                "                                    \"https_url\": \"https://picabstract-preview-ftn.weiyun.com/ftn_pic_abs_v3/8dabc865b79ba199dca2cf936ec197ca1fee62196f60cbd6733a5bcadb4a065010d38184bbfbb6a624a782755b44a870?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-17E4AxW.jpg\",\n" +
                "                                    \"thumb_url\": \"http://picabstract.preview.ftn.qq.com/ftn_pic_abs_v3/370581070de83514d273043652f3cec52a826cf8299243b867ef4fc1fcd1d4461eac723cc3b37bcd1bcd80c98327c735?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-17ZDVy6.jpg\",\n" +
                "                                    \"https_url\": \"https://picabstract-preview-ftn.weiyun.com/ftn_pic_abs_v3/370581070de83514d273043652f3cec52a826cf8299243b867ef4fc1fcd1d4461eac723cc3b37bcd1bcd80c98327c735?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-17ZDVy6.jpg\",\n" +
                "                                    \"thumb_url\": \"http://picabstract.preview.ftn.qq.com/ftn_pic_abs_v3/b3d4a9f3cc55b706c38fb80958e5a697143fa630cae3f8fa3c10da0912b70f1660ad6fcf03d80ffd2491c8f084bb0504?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-17fExOj.jpg\",\n" +
                "                                    \"https_url\": \"https://picabstract-preview-ftn.weiyun.com/ftn_pic_abs_v3/b3d4a9f3cc55b706c38fb80958e5a697143fa630cae3f8fa3c10da0912b70f1660ad6fcf03d80ffd2491c8f084bb0504?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-17fExOj.jpg\",\n" +
                "                                    \"thumb_url\": \"http://picabstract.preview.ftn.qq.com/ftn_pic_abs_v3/5b3a57856312afa603de466735a501b8d75b9b93b4b54934e7aa23a3dcd52900f2dad2cab78ea598233a47127af8f4fd?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-17ocAXL.jpg\",\n" +
                "                                    \"https_url\": \"https://picabstract-preview-ftn.weiyun.com/ftn_pic_abs_v3/5b3a57856312afa603de466735a501b8d75b9b93b4b54934e7aa23a3dcd52900f2dad2cab78ea598233a47127af8f4fd?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-17ocAXL.jpg\",\n" +
                "                                    \"thumb_url\": \"http://picabstract.preview.ftn.qq.com/ftn_pic_abs_v3/c9235910ac3518aecca3fecd05d2f3f8d6933690ab771ef9c50a9de61ceb45c11718b756728c4ca2f55d4fa2e89c6252?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-173itB3.jpg\",\n" +
                "                                    \"https_url\": \"https://picabstract-preview-ftn.weiyun.com/ftn_pic_abs_v3/c9235910ac3518aecca3fecd05d2f3f8d6933690ab771ef9c50a9de61ceb45c11718b756728c4ca2f55d4fa2e89c6252?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-173itB3.jpg\",\n" +
                "                                    \"thumb_url\": \"http://picabstract.preview.ftn.qq.com/ftn_pic_abs_v3/d421a620379fafbc89d253f4821aa6e96d8dc486373c5898bf4adc7d7b10f5168f37164a5b63191346b928e9c5af376c?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-173z61m.jpg\",\n" +
                "                                    \"https_url\": \"https://picabstract-preview-ftn.weiyun.com/ftn_pic_abs_v3/d421a620379fafbc89d253f4821aa6e96d8dc486373c5898bf4adc7d7b10f5168f37164a5b63191346b928e9c5af376c?pictype=scale&from=30013&version=3.3.3.3&fname=2025-05-173z61m.jpg\",\n";
        List<String> urls = extractHttpsUrls(abc);
        System.out.println("提取到的https_url列表如下：");
        ResourceEntity resourceEntity = new ResourceEntity();
        for (String url : urls) {
            resourceEntity.setResourceUrl(url+"&size=750");
            String name = url.substring(202,217);
            System.out.println(name);
            QueryWrapper<ResourceEntity> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("resource_name",name);
            resourceMapper.update(resourceEntity,queryWrapper);
            System.out.println(url);
        }
    }
    public static void main(String[] args) {
//        String arr[] = ".321.321.321".split("\\.");
//        for (String abc:arr){
//            System.out.println(abc);
//        }


    }

    @org.junit.Test
    public void test3(){
        int id = 125;
        System.out.println(id);
        ActivityEntity activityEntity = activityMapper.selectById(id);
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setDepartmentId(activityEntity.getActivityDepartment());
        itemEntity.setHeaderImage(activityEntity.getHeaderImage());
        itemEntity.setItemTitle(activityEntity.getActivityTitle());
        itemEntity.setItemIntroduction(activityEntity.getActivityIntroduction());
        QueryWrapper<SubTitleEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("activity_id",id);
        SubTitleEntity subTitleEntity = subTitleMapper.selectOne(queryWrapper);
        itemEntity.setContentMarkdown(subTitleEntity.getSubtitleContent());
        itemEntity.setCreateTime(activityEntity.getCreateTime());
        itemEntity.setState(true);
        itemEntity.setDelFlag(0);
        itemEntity.setCreateUser(activityEntity.getCreateUser());
        itemMapper.insert(itemEntity);
    }

    @org.junit.Test
    public void test4(){
        for (int i=33;i<=642;i++){
            ResourceEntity resourceEntity = resourceMapper.selectById(i);
            if (resourceEntity == null){
                continue;
            }
            if (resourceEntity.getResourceType()==1&&resourceEntity.getResourceUrl()==null){
                System.out.println(i);
                resourceMapper.deleteById(i);
            }
        }
    }

    @org.junit.Test
    public void test5(){

        Random rand = new Random();
        for (int i = 0;i<10000;i++){
            AccessLogEntity accessLogEntity = accessLogMapper.selectById(rand.nextInt(10000)+200);
            accessLogEntity.setLogId(null);
            accessLogEntity.setAccessTime(null);
            accessLogMapper.insert(accessLogEntity);
        }
    }
    public static int[] stringToIntegerArray(String s) {
        String[] parts = s.split("\\."); // 使用正则表达式分割，因为点号是特殊字符
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].isBlank()){
                continue;
            }
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
}
