package com.zy.service;

import com.zy.model.Test;
import com.zy.model.Tests;
import com.zy.model.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xxz on 2018/4/6 0006.
 */
@Service
public interface CommodityHelpService {

    int save(UserInfo userInfo);

    int saveTest(Test test);

    int saveTests(Tests tests);

    Integer getMaxEPId();

    List<UserInfo> getAll();

    UserInfo getById(Long Id);
}
