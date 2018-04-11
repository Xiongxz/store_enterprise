package com.zy.mapper;

import com.zy.model.UserInfo;
import com.zy.utils.MyMapper;

import java.util.List;

public interface UserInfoMapper extends MyMapper<UserInfo> {

    UserInfo getById(Long Id);
}