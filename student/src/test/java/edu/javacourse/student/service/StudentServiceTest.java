package edu.javacourse.student.service;

import edu.javacourse.student.rest.StudentController;
import edu.javacourse.student.view.StudentRequest;
import edu.javacourse.student.view.StudentResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class StudentServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceTest.class);

    @Autowired
    private StudentController studentController;

    @Test
    public void studentInfo() {
        StudentRequest request = new StudentRequest();
        request.setLastName("Last");
        request.setFirstName("First");
        request.setMiddleName("Middle");
        request.setDateOfBirth(LocalDate.of(2000, 4, 12));
        request.setPassportSeria("1111");
        request.setPassportNumber("222222");
        request.setPassportDate(LocalDate.of(2016, 4, 30));

        List<StudentResponse> info = studentController.getStudentInfo(request);
        Assert.assertTrue(info.size() > 0);
    }

}