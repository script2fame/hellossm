package com.hungteshun.dao;

import com.hungteshun.model.User;

/**
 * @author hungteshun
 * @description:
 * @date 2018/9/24 13:08
 */
public interface IUserDao {
    User selectUser(long id);
}
