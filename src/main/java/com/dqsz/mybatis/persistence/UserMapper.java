package com.dqsz.mybatis.persistence;

import com.dqsz.mybatis.domain.User;

import java.util.List;

/**
 * Created by chensong on 15/11/30.
 */

public interface UserMapper {
    int save(User user);
    User getById(int id);

    List<User> getUsers();
}
