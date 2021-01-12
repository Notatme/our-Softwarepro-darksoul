package com.darksoul.service.impl;

import com.darksoul.Entity.UploadInfo;
import com.darksoul.service.UploadService;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class UploadService_impl implements UploadService {

    @Override
    public UploadInfo upload(MultipartFile file, String uploadFilePath) {

        if (file.isEmpty()) {
            //System.out.println("11111111111111111111111111111");
            return null;
        }
        System.out.println("222222222222222222222222222222222222");
        UploadInfo uploadInfo = new UploadInfo();
        String originalFilename;
        String fileName;
        originalFilename = file.getOriginalFilename();
        fileName = UUID.randomUUID().toString() + file.getOriginalFilename();
        String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
        long fileSize = file.getSize();
        File packageFile = new File(uploadFilePath);
        if (!packageFile.exists()) {
            packageFile.mkdir();
        }
        File targetFile = new File(uploadFilePath + "/" + fileName);
        try {
            file.transferTo(targetFile);
            //FileUtils.copyInputStreamToFile(file.getInputStream(), targetFile);
        } catch (IOException e) {
            e.printStackTrace();
            //log.error("文件上传失败", e);
            //throw new AppException("500", "文件上传失败, 请重试");
        }
        uploadInfo.setBeginFileName(originalFilename);
        uploadInfo.setLastFileName(fileName);
        uploadInfo.setFileType(fileType);
        uploadInfo.setFileSize(Long.toString(fileSize));
        uploadInfo.setUploadUrl(targetFile.toString());
        uploadInfo.setResult("上传成功");
        return uploadInfo;
    }

}
