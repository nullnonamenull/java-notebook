package com.poleszak.pattern;

import com.poleszak.pattern.structural.adapter.Student;
import com.poleszak.pattern.structural.adapter.StudentClient;
import com.poleszak.pattern.structural.proxy.internet.Internet;
import com.poleszak.pattern.structural.proxy.internet.ProxyInternet;
import com.poleszak.pattern.structural.proxy.subject.Proxy;
import com.poleszak.pattern.structural.proxy.subject.Subject;
import com.poleszak.pattern.structural.proxy.video.ProxyVideoDownloader;
import com.poleszak.pattern.structural.proxy.video.VideoDownloader;

import java.util.List;

public class RunPattern {

    public static void main(String[] args) {
        System.out.println("PATTERN -> STRUCTURAL -> ADAPTER");
        adapterPattern();
        System.out.println("\n\nPATTERN -> STRUCTURAL -> PROXY");
        proxyPattern();
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
        System.out.println("\n\nINTERNET PROXY");
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");


        System.out.println("\n\nVIDEO PROXY");
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("kaszana");
        videoDownloader.getVideo("maszana");
        videoDownloader.getVideo("maszana");
        videoDownloader.getVideo("kaszana");
        videoDownloader.getVideo("waclawa");


        System.out.println("\n\nSUBJECT PROXY");
        Subject proxy = new Proxy();
        proxy.request();
    }
}