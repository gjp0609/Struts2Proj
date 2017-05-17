package com.baizhi.service;

import com.baizhi.entity.Page;
import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by gjp06 on 17.5.17.
 */
public interface UserService {

    public List<User> queryUser(User user, Page page);

    public int addUser(User user);

    public int removeUser(User user);

    public int modifyUser(User user);
}
