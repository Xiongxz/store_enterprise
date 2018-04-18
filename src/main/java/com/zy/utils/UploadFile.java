package com.zy.utils;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class UploadFile {
    /**
     * 文件上传
     *
     * @param file     文件
     * @param filePath 文件路径
     * @param fileName 文件名称
     * @throws IOException
     */
    public static void uploadFile(byte[] file, String filePath, String fileName) throws IOException {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(filePath + fileName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        out.write(file);
        out.flush();
        out.close();

    }
}
