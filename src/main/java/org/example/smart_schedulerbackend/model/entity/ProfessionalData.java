package org.example.smart_schedulerbackend.model.entity;

import lombok.Data;

@Data
public class ProfessionalData {
    private String professionAbbreviation;
    private String academic;
    private String englishName;
    private String startUpStatus;
    private String affiliation;
    private String professionalName;
    private String professionalNumber;
    private String cultivationLevel;

    public String getProfessionAbbreviation() {
        return professionAbbreviation;
    }

    public void setProfessionAbbreviation(String professionAbbreviation) {
        this.professionAbbreviation = professionAbbreviation;
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getStartUpStatus() {
        return startUpStatus;
    }

    public void setStartUpStatus(String startUpStatus) {
        this.startUpStatus = startUpStatus;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getProfessionalName() {
        return professionalName;
    }

    public void setProfessionalName(String professionalName) {
        this.professionalName = professionalName;
    }

    public String getProfessionalNumber() {
        return professionalNumber;
    }

    public void setProfessionalNumber(String professionalNumber) {
        this.professionalNumber = professionalNumber;
    }

    public String getCultivationLevel() {
        return cultivationLevel;
    }

    public void setCultivationLevel(String cultivationLevel) {
        this.cultivationLevel = cultivationLevel;
    }
}