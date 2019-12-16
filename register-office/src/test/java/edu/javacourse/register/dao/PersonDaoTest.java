package edu.javacourse.register.dao;

import edu.javacourse.register.domain.Person;
import edu.javacourse.register.domain.PersonFemale;
import edu.javacourse.register.domain.PersonMale;
import org.junit.Test;

import java.util.List;

public class PersonDaoTest {

    @Test
    public void findPersons() {
        PersonDao dao = new PersonDao();
        List<Person> persons = dao.findPersons();

        persons.forEach(p -> {
            System.out.println("");
            System.out.println(String.format("Name: %s", p.getFirstName()));
            System.out.println(String.format("Class for sex: %s", p.getClass().getSimpleName()));
            System.out.println(String.format("Passports: %s", p.getPassports().size()));
            System.out.println(String.format("Birth: %s", p.getBirthCertificate()));
            if (p instanceof PersonMale) {
                System.out.println(String.format("Birth Certs: %s", ((PersonMale) p).getBirthCertificates().size()));
                System.out.println(String.format("Marriage Certs: %s", ((PersonMale) p).getMarriageCertificates().size()));
            } else {
                System.out.println(String.format("Birth Certs: %s", ((PersonFemale) p).getBirthCertificates().size()));
                System.out.println(String.format("Marriage Certs: %s", ((PersonFemale) p).getMarriageCertificates().size()));
            }
            System.out.println("");
        });
    }
}