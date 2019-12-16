package edu.javacourse.register.dao;

import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.view.MarriageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;

public class MarriageDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageDao.class);

    private EntityManager entityManager;
    private String test;


    public void setTest(String test) {
        this.test = test;
    }

//    public MarriageDao(EntityManager entityManager) {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
//        this.entityManager = factory.createEntityManager();
//    }

    public MarriageCertificate findMarriageCertificate(MarriageRequest request) {
        LOGGER.info("findMarriageCertificate called: {}", test);
        // TODO: 16.12.2019

        return null;
    }
}
