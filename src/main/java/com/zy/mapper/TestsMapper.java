package com.zy.mapper;

import com.zy.model.Tests;
import com.zy.utils.MyMapper;

public interface TestsMapper extends MyMapper<Tests> {
   Integer getMaxEPId();
}