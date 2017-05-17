package com.baizhi.anno.service.impl;

import com.baizhi.anno.dao.PersonDao;
import com.baizhi.anno.entity.Person;
import com.baizhi.anno.service.PersonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by gjp06 on 17.5.17.
 */
@Service("personService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PersonServiceImpl implements PersonService {
    @Resource(name = "personDao")
    private PersonDao dao;

    @Override
    public List<Person> queryPerson() {
        return dao.selectPerson();
    }
}
