package test;

import dao.PersonDao;
import entity.Person;
import org.junit.jupiter.api.Test;
import utils.MyBatisUtils;

import java.util.List;

/**
 * PersonDaoTest
 * Created by gjp06 on 17.5.14.
 */
class PersonDaoTest {
    private PersonDao dao = MyBatisUtils.getMapper(PersonDao.class);

    @Test
    void selectPerson() {
        System.out.println(dao);
        List<Person> people = dao.selectPerson(null);
        for (Person p : people) {
            System.out.println(p);
        }
    }

    @Test
    void insertPerson() {
        Person person = new Person();
        person.setName("123");
        person.setEmail("123@123.123");
        person.setMobile("123");
        person.setTelPhone("1234");
        person.setCity("1234");
        int i = dao.insertPerson(person);
        System.out.println(i);
        MyBatisUtils.commit();
    }

    @Test
    void deletePerson() {
        Person person = new Person();
        person.setId(1011);
        int i = dao.deletePerson(person);
        System.out.println(i);
        MyBatisUtils.commit();
    }

    @Test
    void updatePerson() {
        Person person = new Person();
        person.setId(1003);
        person.setName("诺诺");
        int i = dao.updatePerson(person);
        System.out.println(i);
        MyBatisUtils.commit();
    }

}
