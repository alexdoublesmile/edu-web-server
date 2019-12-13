package edu.javacourse.register.dao;

import edu.javacourse.register.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PersonDAO {

    private EntityManager entityManager;

    public PersonDAO() {
        System.out.print("creating Factory...");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        System.out.println(" OK");
        System.out.print("creating Manager...");
        entityManager = factory.createEntityManager();
        System.out.println(" OK");
    }

    public List<Person> findPersons() {

        return entityManager.createQuery("SELECT p FROM Person p").getResultList();
    }
}
