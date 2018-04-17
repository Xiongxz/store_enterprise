package com.zy.service;

import com.zy.mapper.TestMapper;
import com.zy.mapper.TestsMapper;
import com.zy.mapper.UserInfoMapper;
import com.zy.model.Test;
import com.zy.model.Tests;
import com.zy.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xxz on 2018/4/6 0006.
 */
@Service
public class CommodityHelpImpl implements CommodityHelpService{

    @Autowired
    private UserInfoMapper uim;

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TestsMapper testsMapper;


    @Override
    public int save(UserInfo userInfo) {
        return uim.insert(userInfo);
    }

    @Override
    public int saveTest(Test test) {
        return testMapper.insert(test);
    }

    @Override
    public int saveTests(Tests tests) {
        return testsMapper.insert(tests);
    }

    @Override
    public Integer getMaxEPId() {
        return testsMapper.getMaxEPId();
    }

    @Override
    public List<UserInfo> getAll() {
        return uim.selectAll();
    }

    @Override
    public UserInfo getById(Long Id) {
        return uim.getById(Id);
    }


}
