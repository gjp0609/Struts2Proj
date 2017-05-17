package com.baizhi.service.impl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.Page;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by gjp06 on 17.5.17.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao dao;

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<User> queryUser(User user, Page page) {
        int i = dao.selectTotalRows();
        if (i < 1) throw new RuntimeException("没有数据");
        page.setTotalRows(i);
        return dao.selectUser(user, page);
    }

    @Override
    public int addUser(User user) {
        return dao.insertUser(user);
    }

    @Override
    public int removeUser(User user) {
        return dao.deleteUser(user);
    }

    @Override
    public int modifyUser(User user) {
        return dao.updateUser(user);
    }
}
