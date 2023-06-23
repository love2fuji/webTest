package com.wen.demo3.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wen.demo3.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {

}
