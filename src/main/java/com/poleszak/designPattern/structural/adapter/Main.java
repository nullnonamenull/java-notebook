package com.poleszak.designPattern.structural.adapter;

import com.poleszak.designPattern.structural.adapter.model.Student;
import com.poleszak.designPattern.structural.adapter.model.StudentClient;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
            Example of adapter pattern in Java: Arrays.asList(array)
        */
        StudentClient client = new StudentClient();
        List<Student> studentList = client.getStudentList();
        System.out.println(studentList);
    }
}
