package com.zy.utils;

/**
 * Created by xxz on 2018/4/17 0017
 */
public class CustomIDGenerator {

    public static void main(String[] args) {
        System.out.println(getNextID("EP-", "6", 6589));
    }

    /**
     * 自定义ID生成器
     * %06d
     * %是格式化输入接受参数的标记
     * 0格式化命令：结果将用零来填充
     * 6：填充位数
     * d：代表十进制 数据
     * @param prefix ID前缀 例如EP-
     * @param digit 位数 6位 000001 开始
     * @param suffix 递增的数
     * @return
     */
    public static synchronized String getNextID(String prefix,String digit,Integer suffix){
        int suffixs = suffix.toString().length();
        if(suffixs <= Integer.valueOf(digit)){
            String format = String.format(prefix+"%0"+digit+"d", suffix);
            return format;
        }
        return "ID实际长度大于指定位数，请调整位数大小!";
    }
}
