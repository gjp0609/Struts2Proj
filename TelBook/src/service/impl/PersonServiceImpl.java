package service.impl;

import dao.PersonDao;
import entity.Person;
import service.PersonService;
import utils.MyBatisUtils;

import java.util.List;

/**
 * PersonServiceImpl
 * Created by gjp06 on 17.5.14.
 */
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> findPerson(Person person) {
        PersonDao dao = MyBatisUtils.getMapper(PersonDao.class);
        return dao.selectPerson(person);
    }

    @Override
    public int addPerson(Person person) {
        PersonDao dao = MyBatisUtils.getMapper(PersonDao.class);
        int result = dao.insertPerson(person);
        MyBatisUtils.commit();
        return result;
    }

    @Override
    public int removePerson(Person person) {
        PersonDao dao = MyBatisUtils.getMapper(PersonDao.class);
        int result = dao.deletePerson(person);
        MyBatisUtils.commit();
        return result;
    }

    @Override
    public int modifyPerson(Person person) {
        PersonDao dao = MyBatisUtils.getMapper(PersonDao.class);
        int result = dao.updatePerson(person);
        MyBatisUtils.commit();
        return result;
    }

}
