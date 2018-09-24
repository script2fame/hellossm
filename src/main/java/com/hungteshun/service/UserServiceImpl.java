package com.hungteshun.service;

import com.hungteshun.dao.IUserDao;
import com.hungteshun.model.User;
import com.hungteshun.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hungteshun
 * @description:
 * @date 2018/9/24 13:29
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}
