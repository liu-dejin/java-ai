package cn.kis2.controller;

import cn.kis2.pojo.Result;
import cn.kis2.utils.AliyunOSSOperator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
public class UploadController {

    /**
     * 上传文件 - 参数名file
     */
    // @PostMapping("/upload")
    // 本地存储  不推荐
    // public Result upload(String username, Integer age, MultipartFile file) throws Exception {
    //     log.info("接收参数：{}，{}，{}", username, age, file);
    //     // 获取原始文件名
    //     String originalFilename = file.getOriginalFilename();
    //
    //     String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
    //     String newFileName = UUID.randomUUID().toString() + extension;
    //     // 保存文件
    //     file.transferTo(new File("C:/develop/java_project/WEB_temp/" + newFileName));
    //     return Result.success();
    // }

    @Autowired
    private AliyunOSSOperator aliyunOSSOperator;

    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws Exception {
        log.info("文件上传:{}",file.getOriginalFilename());
        // 文件交给oss
        String url = aliyunOSSOperator.upload(file.getBytes(), file.getOriginalFilename());
        log.info("文件上传的url:{}",url);
        return Result.success(url);
    }

}
