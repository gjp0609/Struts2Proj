import com.baizhi.entity.Person;
import com.baizhi.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * service
 * Created by gjp06 on 17.5.17.
 */
class PersonServiceTest {
    private ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring.xml");

    @Test
    void findPerson() {
        PersonService service = (PersonService) ctx.getBean("personService");
        List<Person> people = service.findPerson(new Person());
        for (Person p : people) {
            System.out.println(p);
        }

    }
}
