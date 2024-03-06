package com.poleszak.designPattern.structural.adapter;

public class SchoolStudent {

    private final String firstName;
    private final String lastName;
    private final String emailAddress;

    public SchoolStudent(String name, String surname, String email) {
        this.firstName = name;
        this.lastName = surname;
        this.emailAddress = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "SchoolStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
