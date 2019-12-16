package edu.javacourse.register.business;

import edu.javacourse.register.dao.MarriageDao;
import edu.javacourse.register.dao.PersonDao;
import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.view.MarriageRequest;
import edu.javacourse.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarriageManager {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageDao.class);
//    @Autowired
    private MarriageDao marriageDao;
//    @Autowired
    private PersonDao personDao;

    @Autowired
    public void setMarriageDao(MarriageDao marriageDao) {

        this.marriageDao = marriageDao;
    }

//    @Autowired
//    public MarriageManager(PersonDao personDao) {
//        this.personDao = personDao;
//    }

    public MarriageResponse findMarriageCertificate(MarriageRequest request) {
        LOGGER.info("findMarriageCertificate is called..");
        MarriageCertificate cert = marriageDao.findMarriageCertificate(request);
        // TODO: 16.12.2019


        return new MarriageResponse();
    }
}
