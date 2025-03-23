package org.example.smart_schedulerbackend.model.entity;

import lombok.Data;

@Data
public class DepartmentInformation {
    private String departmentNumber;
    private String departmentName;
    private String departmentSerialNumber;
    private String englishName;
    private String departmentAbbreviation;
    private String departmentAddress;
    private String entity;
    private String headOfAdministration;
    private String headOfThePartyCommittee;
    private String establishmentYear;
    private String expirationDate;
    private String organizationType;
    private String unitType;
    private String superiorDepartment;
    private String fixedSchoolBuilding;
    private String facultiesAndDepartments;
    private String facultyOfClasses;
    private String landline;
    private String noteDescription;
    private String statu; // 注意：原表中为Statu，这里修正为statu以符合Java命名规范
    private String courseDevelopment;

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentSerialNumber() {
        return departmentSerialNumber;
    }

    public void setDepartmentSerialNumber(String departmentSerialNumber) {
        this.departmentSerialNumber = departmentSerialNumber;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getDepartmentAbbreviation() {
        return departmentAbbreviation;
    }

    public void setDepartmentAbbreviation(String departmentAbbreviation) {
        this.departmentAbbreviation = departmentAbbreviation;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getHeadOfAdministration() {
        return headOfAdministration;
    }

    public void setHeadOfAdministration(String headOfAdministration) {
        this.headOfAdministration = headOfAdministration;
    }

    public String getHeadOfThePartyCommittee() {
        return headOfThePartyCommittee;
    }

    public void setHeadOfThePartyCommittee(String headOfThePartyCommittee) {
        this.headOfThePartyCommittee = headOfThePartyCommittee;
    }

    public String getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(String establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getSuperiorDepartment() {
        return superiorDepartment;
    }

    public void setSuperiorDepartment(String superiorDepartment) {
        this.superiorDepartment = superiorDepartment;
    }

    public String getFixedSchoolBuilding() {
        return fixedSchoolBuilding;
    }

    public void setFixedSchoolBuilding(String fixedSchoolBuilding) {
        this.fixedSchoolBuilding = fixedSchoolBuilding;
    }

    public String getFacultiesAndDepartments() {
        return facultiesAndDepartments;
    }

    public void setFacultiesAndDepartments(String facultiesAndDepartments) {
        this.facultiesAndDepartments = facultiesAndDepartments;
    }

    public String getFacultyOfClasses() {
        return facultyOfClasses;
    }

    public void setFacultyOfClasses(String facultyOfClasses) {
        this.facultyOfClasses = facultyOfClasses;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public String getCourseDevelopment() {
        return courseDevelopment;
    }

    public void setCourseDevelopment(String courseDevelopment) {
        this.courseDevelopment = courseDevelopment;
    }
}