package com.zy.test.mapper;

import com.zy.test.model.Tests;
import com.zy.utils.MyMapper;

public interface TestsMapper extends MyMapper<Tests> {
   Integer getMaxEPId();
}