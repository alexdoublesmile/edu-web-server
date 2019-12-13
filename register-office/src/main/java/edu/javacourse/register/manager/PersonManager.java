package edu.javacourse.register.manager;

import edu.javacourse.register.domain.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PersonManager {

    public static void main(String[] args) {

        sessionHibernateExample();

        jpaHibernateExample();
    }

    private static void sessionHibernateExample() {
        SessionFactory sf = buildSessionHibernateFactory();
        System.out.println();
        System.out.println();
        System.out.println();

        Session session = sf.openSession();

        session.getTransaction().begin();

        Person person = new Person();
        person.setFirstName("Василий");
        person.setLastName("Сидоров");

        Long id = (Long) session.save(person);
        System.out.println(id);


        session.getTransaction().commit();
        session.close();

        session = sf.openSession();
        Person person1 = session.get(Person.class, id);
        System.out.println(person1);
        session.close();

        session = sf.openSession();

        List<Person> list = session.createQuery("FROM Person", Person.class).list();
        list.forEach(p -> System.out.println(p));

        session.close();
    }

    private static void jpaHibernateExample() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Person person = new Person();
        person.setFirstName("Алексей");
        person.setLastName("Федоров");
        em.persist(person);
        System.out.println(person.getPersonId());

        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        List list = em.createQuery("FROM Person").getResultList();
        list.forEach(p -> System.out.println(p));

        em.close();
    }

    private static SessionFactory buildSessionHibernateFactory() {
        try {
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build();
            Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

            return metadata.getSessionFactoryBuilder().build();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
