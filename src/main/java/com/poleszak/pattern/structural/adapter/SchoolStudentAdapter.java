package com.poleszak.pattern.structural.adapter;

public class SchoolStudentAdapter implements Student{

    private final SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return this.schoolStudent.getFirstName();
    }

    @Override
    public String getSurname() {
        return this.schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return this.schoolStudent.getEmailAddress();
    }

    @Override
    public String toString() {
        return "SchoolStudentAdapter{" +
                "schoolStudent=" + schoolStudent +
                '}';
    }
}
