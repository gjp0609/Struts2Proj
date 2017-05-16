package test;

import dao.PersonDao;
import org.junit.jupiter.api.Test;
import utils.MyBatisUtils;

/**
 * Created by gjp06 on 17.5.16.
 */
public class PersonDaoTest {
    @Test
    void selectPerson() {
        PersonDao dao = MyBatisUtils.getMapper(PersonDao.class);
        System.out.println(dao);
    }
}
