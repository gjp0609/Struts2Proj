import com.baizhi.anno.dao.PersonDao;
import com.baizhi.anno.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by gjp06 on 17.5.17.
 */
public class PersonDaoTest {

    private ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    void test() {
        Object personDao = ctx.getBean("personDao");
        PersonDao dao = (PersonDao) personDao;
        List<Person> people = dao.selectPerson();
        for (Person p : people) {
            System.out.println(p);
        }
    }

    @Test
    void test2() {
        Object dao = ctx.getBean("personDao");
        System.out.println(dao);
    }
}
