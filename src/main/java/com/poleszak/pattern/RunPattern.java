package com.poleszak.pattern;

import com.poleszak.pattern.structural.adapter.Student;
import com.poleszak.pattern.structural.adapter.StudentClient;

import java.util.List;

public class RunPattern {

    public static void main(String[] args) {
        System.out.println("PATTERN -> STRUCTURAL -> ADAPTER");
        adapterPattern();
    }


    private static void adapterPattern() {

        /*
            Example of adapter pattern in Java: Arrays.asList(array)
        */
        StudentClient client = new StudentClient();
        List<Student> studentList = client.getStudentList();
        System.out.println(studentList);
    }

    private static void proxyPattern() {
    }
}