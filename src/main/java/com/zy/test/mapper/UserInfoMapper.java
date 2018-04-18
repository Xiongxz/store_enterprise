package com.zy.test.mapper;

import com.zy.test.model.UserInfo;
import com.zy.utils.MyMapper;

public interface UserInfoMapper extends MyMapper<UserInfo> {
     UserInfo getById(Long id);
}