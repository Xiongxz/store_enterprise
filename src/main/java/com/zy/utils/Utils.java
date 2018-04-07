package com.zy.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/**
 * Created by xxz on 2018/4/6 0006.
 * 常用工具
 */
public class Utils {
    /**
     * 文件上传
     * @param file 文件
     * @param filePath 文件路径
     * @param fileName 文件名称
     * @throws Exception
     */
    public static void uploadFile(byte[] file,String filePath,String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }

    /**
     * uuid生成ID
     * @return
     */
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().toLowerCase();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }
}
