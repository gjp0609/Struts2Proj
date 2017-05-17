package com.baizhi.service.impl;


import com.baizhi.dao.PersonDao;
import com.baizhi.entity.Person;
import com.baizhi.service.PersonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * PersonServiceImpl
 * Created by gjp06 on 17.5.14.
 */
@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService {
    @Resource(name = "personDao")
    private PersonDao dao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Person> findPerson(Person person) {
        return dao.selectPerson(person);
    }

    @Override
    public int addPerson(Person person) {
        return dao.insertPerson(person);
    }

    @Override
    public int removePerson(Person person) {
        return dao.deletePerson(person);
    }

    @Override
    public int modifyPerson(Person person) {
        return dao.updatePerson(person);
    }

}
