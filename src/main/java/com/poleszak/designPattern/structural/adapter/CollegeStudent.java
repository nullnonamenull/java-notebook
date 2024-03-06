package com.poleszak.designPattern.structural.adapter;

public class CollegeStudent implements Student {
    private final String name;
    private final String surname;
    private final String email;

    public CollegeStudent(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
