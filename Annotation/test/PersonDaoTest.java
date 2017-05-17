import com.baizhi.dao.PersonDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * dao
 * Created by gjp06 on 17.5.17.
 */
class PersonDaoTest {
    private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    void selectPerson() {
        Object personDao = ctx.getBean("personDao");
        PersonDao dao = (PersonDao) personDao;
        System.out.println(dao);
    }
}
