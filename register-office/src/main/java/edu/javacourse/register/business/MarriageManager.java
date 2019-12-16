package edu.javacourse.register.business;

import edu.javacourse.register.dao.MarriageDao;
import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.view.MarriageRequest;
import edu.javacourse.register.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarriageManager {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageDao.class);

    private MarriageDao marriageDao = new MarriageDao();

    public MarriageResponse findMarriageCertificate(MarriageRequest request) {
        LOGGER.info("MarriageManager findMarriageCertificate is called..");
        MarriageCertificate cert = marriageDao.findMarriageCertificate(request);

        MarriageResponse response = new MarriageResponse();
        if (cert != null) {
            if (cert.isActive()) {
                response.setStatus(MarriageResponse.getExists());
            } else {
                response.setStatus(MarriageResponse.getNotActive());
            }
        } else {
            response.setStatus(MarriageResponse.getNotExists());
        }

        return response;
    }
}
