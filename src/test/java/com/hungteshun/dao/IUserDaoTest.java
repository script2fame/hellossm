package com.hungteshun.dao;

import com.hungteshun.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author hungteshun
 * @description:
 * @date 2018/9/24 13:20
 */

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserDao dao;

    @Test
    public void selectUser() {
        long id = 1;
        User user = dao.selectUser(id);
        System.out.println(user.getUsername());
    }
}