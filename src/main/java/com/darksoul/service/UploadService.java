package com.darksoul.service;

import com.darksoul.Entity.UploadInfo;
import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    /**
     * 上传文件接口
     *
     * @param file  上传的文件
     * @param uploadFilePath 上传到服务器的路径
     * @return 上传并处理后的信息
     * @throws Exception 上传异常
     */
    UploadInfo upload(MultipartFile file, String uploadFilePath);
}
