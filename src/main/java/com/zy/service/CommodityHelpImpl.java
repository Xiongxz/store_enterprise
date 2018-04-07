package com.zy.service;

import com.zy.mapper.UserInfoMapper;
import com.zy.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by xxz on 2018/4/6 0006.
 */
public class CommodityHelpImpl implements CommodityHelpService{

    @Autowired
    private UserInfoMapper uim;

    @Override
    public int save(UserInfo userInfo) {
        return uim.insert(userInfo);
    }

    @Override
    public List<UserInfo> selectAll() {
        return null;
    }
}
