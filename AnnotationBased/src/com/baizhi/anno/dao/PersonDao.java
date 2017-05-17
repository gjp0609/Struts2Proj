package com.baizhi.anno.dao;

import com.baizhi.anno.entity.Person;

import java.util.List;

/**
 * Created by gjp06 on 17.5.17.
 */
public interface PersonDao {
    public List<Person> selectPerson();
}
