package com.darksoul.controller;

import ch.qos.logback.core.util.FileUtil;
import com.darksoul.Entity.UploadInfo;
import com.darksoul.service.UploadService;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;



@RestController

//@RequestMapping("/UpLoadfile")
public class PictureHandler {

    private UploadService uploadService;
    private final static String UPLOAD_PATH = "C:file";

    @ApiOperation(value = "上传文件测试",notes = "请记得上传时加上参数 file !")
    @PostMapping(value = "/uploadFile",consumes= MediaType.MULTIPART_FORM_DATA_VALUE)
    public UploadInfo uploadTest(@RequestParam("file") MultipartFile file){
        System.out.println(file);
        System.out.println(UPLOAD_PATH);
        UploadInfo uploadInfo1 = null;
        try{
            //System.out.println("1111111111111111111111");
            uploadInfo1 = uploadService.upload(file,UPLOAD_PATH);
            System.out.println("1111111111111111111111");
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return uploadInfo1;
    }





        /**
         * 上传图片
         * @param file
         * @param request
         * @throws IOException
         */
        @RequestMapping( value = "/uploadPic")
        @ResponseBody
        public String uploadPic(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) throws IOException {
            //目前这里是配置服务器路径
            //String path = "E:/img";
            String path = "/home/chai/picture/";
            //logger.info("path:" + path);
            System.out.println("path:" + path);
            //获取文件名称
            String fileName = file.getOriginalFilename();
            //获取文件名后缀
            Calendar currTime = Calendar.getInstance();
            String time = String.valueOf(currTime.get(Calendar.YEAR))+String.valueOf((currTime.get(Calendar.MONTH)+1));
            //获取文件名后缀
            String suffix = fileName.substring(file.getOriginalFilename().lastIndexOf("."));
            suffix = suffix.toLowerCase();
            if(suffix.equals(".jpg") || suffix.equals(".jpeg") || suffix.equals(".png")/* || suffix.equals(".gif")*/){
                fileName = UUID.randomUUID().toString()+suffix;
                File targetFile = new File(path, fileName);
                if(!targetFile.getParentFile().exists()){    //注意，判断父级路径是否存在
                    targetFile.getParentFile().mkdirs();
                }
                long size = 0;
                //保存
                try {
                    file.transferTo(targetFile);
                    size = file.getSize();
                } catch (Exception e) {
                    e.printStackTrace();
                    return "上传失败！";
                }
                //项目url，这里可以使用常量或者去数据字典获取相应的url前缀；
                String fileUrl="http://chai233.cn:8080";
                //文件获取路径

                fileUrl = fileUrl + request.getContextPath() + "/pictures/" + fileName;
                System.out.println("fileUrl:\"" + fileUrl);
                //logger.info("fileUrl:" + fileUrl);
                return  fileUrl;
            }else{
                return "图片格式有误，请上传.jpg、.png、.jpeg格式的文件";
            }

        }





}
