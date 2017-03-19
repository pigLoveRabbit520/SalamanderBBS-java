package com.nazi.bbs.dao;

import com.nazi.bbs.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int deleteById(Integer uid);

    int insert(User record);

    User selectById(Integer uid);
}