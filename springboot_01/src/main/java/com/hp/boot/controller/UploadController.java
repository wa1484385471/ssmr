package com.hp.boot.controller;


import com.hp.boot.bean.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadController {

    //原来代码上传图片位置在当前工程的 image中
    //String filePath = "D:\\idea_project_1912\\springboot_01\\src\\main\\resources\\static\\image\\";
    //现在 代码打包发布后 ，将图片上传到 服务器的某个盘符
    String filePath = "C:\\";

    @RequestMapping("/upload")
    public JsonData upload(MultipartFile upload, HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println("当前上传人是："+name);
        //1. 获取文件上传的 文件名
        String filename = upload.getOriginalFilename();
        System.out.println("被上传的文件名"+filename);
        //2. 获取文件的后缀
        String suffixName = filename.substring(filename.lastIndexOf("."));
        System.out.println("后缀名："+suffixName);
        //3. 获取文件上传后的路径
        filename = UUID.randomUUID()+suffixName;    //通过uuid随机字符串产生文件名，避免同名文件覆盖
        File path = new File(filePath+filename);
        //4. 开始上传
        try {
            upload.transferTo(path);
            return new JsonData(0,filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JsonData(-1,"上传失败",null);
    }
}
