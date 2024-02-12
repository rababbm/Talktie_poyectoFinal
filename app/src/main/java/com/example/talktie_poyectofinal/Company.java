package com.example.talktie_poyectofinal;

import java.util.Date;

public class Company {
    private String sector;
    private String companyType;
    private String summary;
    private Date foundationDate;
    private String specialties;

    // Constructor
    public Company(String sector, String companyType, String summary, Date foundationDate, String specialties) {
        this.sector = sector;
        this.companyType = companyType;
        this.summary = summary;
        this.foundationDate = foundationDate;
        this.specialties = specialties;
    }

    // Getters and Setters
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }
}

