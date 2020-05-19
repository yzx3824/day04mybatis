package com.yzx.dao;

import com.yzx.domain.User;

import java.util.List;

/**
 * @program: day02mybatis
 * @description: 用户的持久层接口
 * @author: yanzhixian
 * @create: 2020-03-22 19:00
 */
public interface IUserDao {
    /**
     * 查询所有用户，同时获取到用户下所有账户的信息
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    User findById(Integer userId);
}
