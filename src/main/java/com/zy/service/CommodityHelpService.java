package com.zy.service;

import com.zy.model.UserInfo;

import java.util.List;

/**
 * Created by xxz on 2018/4/6 0006.
 */
public interface CommodityHelpService {

    int save(UserInfo userInfo);

    List<UserInfo> selectAll();

}
