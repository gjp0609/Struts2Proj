import com.baizhi.dao.UserDao;
import com.baizhi.entity.Page;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

class Test2134 {
    private ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    void testEnv() {
        Object object = ctx.getBean("userDao");
        UserDao dao = (UserDao) object;
        List<User> user = dao.selectUser(new User(), new Page());
        for (User u : user)
            System.out.println(u);
    }

    @Test
    void testSER() {
        Object userService = ctx.getBean("userService");
        UserService service = (UserService) userService;
        List<User> users = service.queryUser(new User(), new Page());
        for (User u : users) {
            System.out.println(u);
        }
    }

    @Test
    void testEnv123() {
        Object object = ctx.getBean("userDao");
        UserDao dao = (UserDao) object;
        User u = new User();
        u.setId(8);
        u.setName("牛顿23");
        u.setMobile("16758697857");
        u.setBirthday(new Date());
        int i = dao.updateUser(u);
        System.out.println(i);
    }
}
