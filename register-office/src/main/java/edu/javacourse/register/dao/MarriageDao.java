package edu.javacourse.register.dao;

import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.view.MarriageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MarriageDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageDao.class);

    private EntityManager entityManager;

    public MarriageDao() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        this.entityManager = factory.createEntityManager();
    }

    public MarriageCertificate findMarriageCertificate(MarriageRequest request) {
        LOGGER.info("MarriageDao findMarriageCertificate is called..");

        Query query = entityManager.createNamedQuery("MarriageCertificate.findCertificates");
        query.setParameter("number", request.getMarriageCertificateNumber());
        query.setParameter("issueDate", request.getMarriageCertificateIssueDate());
        if (query.getResultList().size() > 0) {
            return (MarriageCertificate) query.getResultList().get(0);
        } else {
            return null;
        }
    }
}
