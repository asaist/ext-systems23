package edu.javacourse.register.dao;

import edu.javacourse.register.domain.Person;
import org.junit.Test;

import java.util.List;

public class PersonDaoTest {

    @Test
    public void findPersons(){
        PersonDao dao = new PersonDao();
        List<Person> personList = dao.findPersons();

        personList.forEach(person -> {
            System.out.println(person.getFirstName());
            System.out.println(person.getClass().getName());
            System.out.println(person.getPassports().size());
        });
    }

}
