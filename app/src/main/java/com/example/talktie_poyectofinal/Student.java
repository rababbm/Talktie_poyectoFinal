package com.example.talktie_poyectofinal;

import java.util.Date;
import java.util.List;

public class Student {
    private String gender;
    private Date dateOfBirth;
    private String schoolOrEducation;
    private String degree;
    private Date educationStartDate;
    private Date educationEndDate;
    private String jobTitle;
    private String company;
    private String location;
    private Date experienceStartDate;
    private Date experienceEndDate;
    private boolean currentlyWorking;
    private List<String> jobCategories; //parece que lista es mejor

    // Constructor
    public Student(String gender, Date dateOfBirth, String schoolOrEducation, String degree, Date educationStartDate, Date educationEndDate, String jobTitle, String company, String location, Date experienceStartDate, Date experienceEndDate, boolean currentlyWorking, List<String> jobCategories) {
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.schoolOrEducation = schoolOrEducation;
        this.degree = degree;
        this.educationStartDate = educationStartDate;
        this.educationEndDate = educationEndDate;
        this.jobTitle = jobTitle;
        this.company = company;
        this.location = location;
        this.experienceStartDate = experienceStartDate;
        this.experienceEndDate = experienceEndDate;
        this.currentlyWorking = currentlyWorking;
        this.jobCategories = jobCategories;
    }

    // Getters and Setters
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSchoolOrEducation() {
        return schoolOrEducation;
    }

    public void setSchoolOrEducation(String schoolOrEducation) {
        this.schoolOrEducation = schoolOrEducation;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getEducationStartDate() {
        return educationStartDate;
    }

    public void setEducationStartDate(Date educationStartDate) {
        this.educationStartDate = educationStartDate;
    }

    public Date getEducationEndDate() {
        return educationEndDate;
    }

    public void setEducationEndDate(Date educationEndDate) {
        this.educationEndDate = educationEndDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getExperienceStartDate() {
        return experienceStartDate;
    }

    public void setExperienceStartDate(Date experienceStartDate) {
        this.experienceStartDate = experienceStartDate;
    }

    public Date getExperienceEndDate() {
        return experienceEndDate;
    }

    public void setExperienceEndDate(Date experienceEndDate) {
        this.experienceEndDate = experienceEndDate;
    }

    public boolean isCurrentlyWorking() {
        return currentlyWorking;
    }

    public void setCurrentlyWorking(boolean currentlyWorking) {
        this.currentlyWorking = currentlyWorking;
    }

    public List<String> getJobCategories() {
        return jobCategories;
    }

    public void setJobCategories(List<String> jobCategories) {
        this.jobCategories = jobCategories;
    }
}
