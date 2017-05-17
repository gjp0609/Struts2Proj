package com.baizhi.dao;

import com.baizhi.entity.Page;
import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    public List<User> selectUser(@Param("user") User user, @Param("page") Page page);

    public int insertUser(User user);

    public int updateUser(User user);

    public int deleteUser(User user);

    public int selectTotalRows();

}
