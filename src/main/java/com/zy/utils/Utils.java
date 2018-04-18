package com.zy.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xxz on 2018/4/6 0006.
 * 常用工具
 */
public class Utils {

    public static void main(String[] args) {
        //String m = "ER-";
        for (int i = 0; i < 2; i++) {
            String format = String.format("ER-%05d", i);
            System.out.println(format);
        }
        final AtomicInteger counter = new AtomicInteger(0);
        String l = "6";
        String s = String.format("C%0" + l + "d", counter.incrementAndGet());
        System.out.println(s);
    }


    private static int sequence = 0;

    private static int length = 6;

    /**
     * YYYYMMDDHHMMSS+6位自增长码(20位)
     *
     * @return
     */
    public static synchronized String getLocalTrmSeqNum() {
        sequence = sequence >= 999999 ? 1 : sequence + 1;
        String datetime = new SimpleDateFormat("yyyyMMddHHmmss")
                .format(new Date());
        String s = Integer.toString(sequence);
        return datetime + addLeftZero(s, length);
    }

    /**
     * 左填0
     *
     * @param s
     * @param length
     * @return
     */
    public static String addLeftZero(String s, int length) {
        // StringBuilder sb=new StringBuilder();
        int old = s.length();
        if (length > old) {
            char[] c = new char[length];
            char[] x = s.toCharArray();
            if (x.length > length) {
                throw new IllegalArgumentException(
                        "Numeric value is larger than intended length: " + s
                                + " LEN " + length);
            }
            int lim = c.length - x.length;
            for (int i = 0; i < lim; i++) {
                c[i] = '0';
            }
            System.arraycopy(x, 0, c, lim, x.length);
            return new String(c);
        }
        return s.substring(0, length);

    }

    /**
     * 文件上传
     *
     * @param file     文件
     * @param filePath 文件路径
     * @param fileName 文件名称
     * @throws Exception
     */
    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }

    /**
     * uuid生成ID
     *
     * @return
     */
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString().toLowerCase();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }
}
