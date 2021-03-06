package com.hungteshun.service;

import com.hungteshun.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author hungteshun
 * @description:
 * @date 2018/9/24 13:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    @Test
    public void selectUser() {
        long id = 1;
        User user = userService.selectUser(id);
        System.out.println(user.getUsername());
    }
}