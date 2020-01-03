package edu.javacourse.register.dao;

import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.domain.Person;
import edu.javacourse.register.domain.PersonFemale;
import edu.javacourse.register.rest.MarriageController;
import edu.javacourse.register.view.MarriageRequest;
import edu.javacourse.register.view.MarriageResponse;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Persistence;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class MarriageDaoTest {

    private MarriageRequest request;
    private MarriageResponse response;

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageDaoTest.class);

//    @Test
//    public void testMarriageCertificate() {
//        findMarriageCertificate();
//        showMarriageCertificate();
//    }

    @Test
    public void findMarriageCertificate() {
//        request = new MarriageRequest();
//        request.setMarriageCertificateNumber("123 Marriage");
//        request.setMarriageCertificateIssueDate(LocalDate.parse("2017-2-2", DateTimeFormatter.ofPattern("yyyy-M-d")));
//        LOGGER.info(request.toString());
//
//
//        MarriageController controller = new MarriageController();
//        response = controller.findMarriageCertificate(request);
//        System.out.println(String.format("The certificate №%s %s", request.getMarriageCertificateNumber(), response.getStatus()));
//        System.out.println("");

    }

//    @Test
//    public void showMarriageCertificate() {
//        if (!response.getStatus().equals(MarriageResponse.getNotExists())) {
//
//            MarriageDao dao = new MarriageDao();
//            MarriageCertificate cert = dao.findMarriageCertificate(request);
//            System.out.println(String.format("Number: %s", cert.getNumber()));
//            System.out.println(String.format("Issue Date: %s", cert.getIssueDate()));
//            System.out.println(String.format("Expired Date: %s", cert.getEndDate()));
//            Person husband = cert.getHusband();
//            Person wife = cert.getWife();
//            System.out.println(String.format("Husband: %s %s", husband.getLastName(), husband.getFirstName()));
//            System.out.println(String.format("Wife: %s %s", wife.getLastName(), wife.getFirstName()));
//
//        }
//    }
}