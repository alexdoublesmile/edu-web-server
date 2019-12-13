package edu.javacourse.register.domain;

import java.util.List;

public class PersonMale {

    private List<MarriageCertificate> marriageCertificates;

    public List<MarriageCertificate> getMarriageCertificates() {
        return marriageCertificates;
    }

    public void setMarriageCertificates(List<MarriageCertificate> marriageCertificates) {
        this.marriageCertificates = marriageCertificates;
    }
}
