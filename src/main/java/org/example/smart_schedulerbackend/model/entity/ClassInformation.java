package org.example.smart_schedulerbackend.model.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ClassInformation {
    private String classNumber;
    private String className;
    private String classAbbreviation;
    private String academic;
    private String cultivationLevel;
    private String classCategory;
    private String counsellor;
    private String headteacher;
    private String monitor;
    private String bansuke;
    private String graduationYear;
    private String graduationOrNot;
    private String classSize;
    private String maleFemale;
    private String maximumClassSize;
    private String admissionYear;
    private String faculties;
    private String professionalNumber;
    private String major;
    private String professionalDirection;
    private String schoolDistricts;
    private String fixedClassroom;
    private String remark;
    private String headteacherPhoneNumber;
    private String headteacherHeadteacher;
    private String finalAcademicYear;
    private String expandTheEnrollment;
    private String academicTutor;
    private String classSchedulingType;
    private LocalDateTime classSchedulingTime;
    private String isDelete;

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassAbbreviation() {
        return classAbbreviation;
    }

    public void setClassAbbreviation(String classAbbreviation) {
        this.classAbbreviation = classAbbreviation;
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic;
    }

    public String getCultivationLevel() {
        return cultivationLevel;
    }

    public void setCultivationLevel(String cultivationLevel) {
        this.cultivationLevel = cultivationLevel;
    }

    public String getClassCategory() {
        return classCategory;
    }

    public void setClassCategory(String classCategory) {
        this.classCategory = classCategory;
    }

    public String getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(String counsellor) {
        this.counsellor = counsellor;
    }

    public String getHeadteacher() {
        return headteacher;
    }

    public void setHeadteacher(String headteacher) {
        this.headteacher = headteacher;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getBansuke() {
        return bansuke;
    }

    public void setBansuke(String bansuke) {
        this.bansuke = bansuke;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getGraduationOrNot() {
        return graduationOrNot;
    }

    public void setGraduationOrNot(String graduationOrNot) {
        this.graduationOrNot = graduationOrNot;
    }

    public String getClassSize() {
        return classSize;
    }

    public void setClassSize(String classSize) {
        this.classSize = classSize;
    }

    public String getMaleFemale() {
        return maleFemale;
    }

    public void setMaleFemale(String maleFemale) {
        this.maleFemale = maleFemale;
    }

    public String getMaximumClassSize() {
        return maximumClassSize;
    }

    public void setMaximumClassSize(String maximumClassSize) {
        this.maximumClassSize = maximumClassSize;
    }

    public String getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(String admissionYear) {
        this.admissionYear = admissionYear;
    }

    public String getFaculties() {
        return faculties;
    }

    public void setFaculties(String faculties) {
        this.faculties = faculties;
    }

    public String getProfessionalNumber() {
        return professionalNumber;
    }

    public void setProfessionalNumber(String professionalNumber) {
        this.professionalNumber = professionalNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getProfessionalDirection() {
        return professionalDirection;
    }

    public void setProfessionalDirection(String professionalDirection) {
        this.professionalDirection = professionalDirection;
    }

    public String getSchoolDistricts() {
        return schoolDistricts;
    }

    public void setSchoolDistricts(String schoolDistricts) {
        this.schoolDistricts = schoolDistricts;
    }

    public String getFixedClassroom() {
        return fixedClassroom;
    }

    public void setFixedClassroom(String fixedClassroom) {
        this.fixedClassroom = fixedClassroom;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHeadteacherPhoneNumber() {
        return headteacherPhoneNumber;
    }

    public void setHeadteacherPhoneNumber(String headteacherPhoneNumber) {
        this.headteacherPhoneNumber = headteacherPhoneNumber;
    }

    public String getHeadteacherHeadteacher() {
        return headteacherHeadteacher;
    }

    public void setHeadteacherHeadteacher(String headteacherHeadteacher) {
        this.headteacherHeadteacher = headteacherHeadteacher;
    }

    public String getFinalAcademicYear() {
        return finalAcademicYear;
    }

    public void setFinalAcademicYear(String finalAcademicYear) {
        this.finalAcademicYear = finalAcademicYear;
    }

    public String getExpandTheEnrollment() {
        return expandTheEnrollment;
    }

    public void setExpandTheEnrollment(String expandTheEnrollment) {
        this.expandTheEnrollment = expandTheEnrollment;
    }

    public String getAcademicTutor() {
        return academicTutor;
    }

    public void setAcademicTutor(String academicTutor) {
        this.academicTutor = academicTutor;
    }

    public String getClassSchedulingType() {
        return classSchedulingType;
    }

    public void setClassSchedulingType(String classSchedulingType) {
        this.classSchedulingType = classSchedulingType;
    }

    public LocalDateTime getClassSchedulingTime() {
        return classSchedulingTime;
    }

    public void setClassSchedulingTime(LocalDateTime classSchedulingTime) {
        this.classSchedulingTime = classSchedulingTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
}