package com.zy.utils;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * https://github.com/abel533/MyBatis-Spring-Boot
 * 通用Mapper接口
 *
 * @param <T>
 */
@Repository
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
