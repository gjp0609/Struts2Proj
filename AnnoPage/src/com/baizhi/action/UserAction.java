package com.baizhi.action;

import com.baizhi.entity.Page;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.opensymphony.xwork2.Action;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by gjp06 on 17.5.17.
 */
@Controller("userAction")
public class UserAction {
    @Resource(name = "userService")
    private UserService service;
    private User user = new User();
    private Page page = new Page();
    private List<User> users;

    private Integer status = 0;


    public String queryAll() {
        users = service.queryUser(new User(), page);
        return Action.SUCCESS;
    }

    public String removeUser() {
        status = service.removeUser(user);
        return Action.SUCCESS;
    }

    public String toUpdate() {
        List<User> users = service.queryUser(user, new Page());
        user = users.get(0);
        return Action.SUCCESS;
    }

    public String modifyUser() {
        status = service.modifyUser(user);
        return Action.SUCCESS;
    }

    public String addUser() {
        status = service.addUser(user);
        return Action.SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
