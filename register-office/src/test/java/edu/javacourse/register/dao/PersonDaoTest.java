package edu.javacourse.register.dao;

import edu.javacourse.register.domain.Person;
import edu.javacourse.register.domain.PersonFemale;
import edu.javacourse.register.domain.PersonMale;
import org.junit.Test;

import java.util.List;

public class PersonDaoTest {

    @Test
    public void findPersons(){
        PersonDao dao = new PersonDao();
        List<Person> personList = dao.findPersons();

        personList.forEach(person -> {
            System.out.println("Name:" + person.getFirstName());
            System.out.println("Class for sex:" + person.getClass().getName());
            System.out.println("Passports:" + person.getPassports().size());
            System.out.println("Birth:" + person.getBirthCertificate());
            if (person instanceof PersonMale){
                System.out.println( "Birth Cert:" + ((PersonMale) person).getBirthCertificates().size() );
                System.out.println( "Marriage Cert" + ((PersonMale) person).getMarriageCertificates().size() );
            } else {
                System.out.println( "Birth Cert:" + ((PersonFemale) person).getBirthCertificates().size() );
                System.out.println(  "Marriage Cert" + ((PersonFemale) person).getMarriageCertificates().size() );
            }
        });
    }

}
