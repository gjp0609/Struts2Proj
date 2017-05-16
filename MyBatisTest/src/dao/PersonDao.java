package dao;

import entity.Person;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by gjp06 on 17.5.16.
 */
public interface PersonDao {

    @Select("select SELECT id, name, email, mobile, telphone telPhone, city FROM telbook.person")
    public List<Person> selectPerson();

}
