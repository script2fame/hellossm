package com.hungteshun.service;

import com.hungteshun.model.User;

/**
 * @author hungteshun
 * @description:
 * @date 2018/9/24 13:28
 */
public interface IUserService {
    public User selectUser(long userId);
}
