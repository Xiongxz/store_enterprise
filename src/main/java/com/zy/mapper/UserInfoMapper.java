package com.zy.mapper;

import com.zy.model.UserInfo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

@Repository
public interface UserInfoMapper extends Mapper<UserInfo>,MySqlMapper<UserInfo> {


}