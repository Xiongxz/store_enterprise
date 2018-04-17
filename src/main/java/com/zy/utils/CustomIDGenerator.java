package com.zy.utils;

/**
 * Created by xxz on 2018/4/17 0017
 */
public class CustomIDGenerator {

    public static void main(String[] args) {
        System.out.println(getNextID("EP-", "6", 12));
    }

    /**
     * 自定义ID生成器
     * @param headId
     * @param digit
     * @param suffix
     * @return
     */
    public static synchronized String getNextID(String headId,String digit,Integer suffix){
        String format = String.format(headId+"%0"+digit+"d", suffix);
        return format;
    }


}
