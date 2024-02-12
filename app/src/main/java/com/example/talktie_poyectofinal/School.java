package com.example.talktie_poyectofinal;

public class School {
    private String schoolCode;
    private String institutionType;
    //constructor
    public School(String schoolCode, String institutionType) {
        this.schoolCode = schoolCode;
        this.institutionType = institutionType;
    }
    //getters y setters
    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(String institutionType) {
        this.institutionType = institutionType;
    }
}
