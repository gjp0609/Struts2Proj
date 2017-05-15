package action;

import com.alibaba.fastjson.JSON;
import entity.Person;
import org.apache.struts2.ServletActionContext;
import service.impl.PersonServiceImpl;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by gjp06 on 17.5.14.
 */
public class PersonAction extends BaseAction {
    private Person person = new Person();

    public String findPerson() throws IOException {
        List<Person> people = new PersonServiceImpl().findPerson(person);
        String s = JSON.toJSONString(people);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print(s);
        return null;
    }

    public String removePerson() throws Exception {
        int i = new PersonServiceImpl().removePerson(person);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print(i);
        return null;
    }

    public String modifyPerson() throws Exception {
        int i = new PersonServiceImpl().modifyPerson(person);
        System.out.println(person);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print(i);
        return null;
    }

    public String addPerson() {


        return null;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
