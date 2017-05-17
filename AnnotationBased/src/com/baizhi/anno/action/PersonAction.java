package com.baizhi.anno.action;

import com.baizhi.anno.entity.Person;
import com.baizhi.anno.service.PersonService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * 123
 * Created by gjp06 on 17.5.17.
 */
@Controller("personAction")
@Scope("prototype")
public class PersonAction extends ActionSupport {
    @Resource(name = "personService")
    private PersonService service;

    private List<Person> people;

    public String queryAll() {
        people = service.queryPerson();
        System.out.println(people);
        return Action.SUCCESS;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
