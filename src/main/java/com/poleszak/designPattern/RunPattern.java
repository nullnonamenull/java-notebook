package com.poleszak.designPattern;

import com.poleszak.designPattern.creational.singleton.EagerLoadingLogger;
import com.poleszak.designPattern.creational.singleton.LazyLoadingLogger;
import com.poleszak.designPattern.structural.adapter.Student;
import com.poleszak.designPattern.structural.adapter.StudentClient;
import com.poleszak.designPattern.structural.bridge.absttraction.AbstractionClient;
import com.poleszak.designPattern.structural.bridge.car.CarClient;
import com.poleszak.designPattern.structural.proxy.internet.Internet;
import com.poleszak.designPattern.structural.proxy.internet.ProxyInternet;
import com.poleszak.designPattern.structural.proxy.subject.Proxy;
import com.poleszak.designPattern.structural.proxy.subject.Subject;
import com.poleszak.designPattern.structural.proxy.video.ProxyVideoDownloader;
import com.poleszak.designPattern.structural.proxy.video.VideoDownloader;

import java.util.List;

public class RunPattern {

    public static void main(String[] args) {
        System.out.println("PATTERN -> STRUCTURAL -> ADAPTER");
        adapterPattern();
        System.out.println("\n\nPATTERN -> STRUCTURAL -> PROXY");
        proxyPattern();
        System.out.println("\n\nCREATIONAL -> STRUCTURAL -> PROXY");
        singletonLearn();
        System.out.println("\n\nCREATIONAL -> STRUCTURAL -> BRIDGE");
        bridgePattern();
        System.out.println("\n\nCREATIONAL -> CREATIONAL -> BUILDER");
        builderPattern();
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
        proxy.request();
    }

    private static void singletonLearn() {
        EagerLoadingLogger eagerLogger = EagerLoadingLogger.getInstance();
        System.out.println("EagerLoadingLogger instance: " + eagerLogger);

        EagerLoadingLogger anotherEagerLogger = EagerLoadingLogger.getInstance();
        System.out.println("Another EagerLoadingLogger instance: " + anotherEagerLogger);

        LazyLoadingLogger lazyLogger = LazyLoadingLogger.getInstance();
        System.out.println("LazyLoadingLogger instance: " + lazyLogger);

        LazyLoadingLogger anotherLazyLogger = LazyLoadingLogger.getInstance();
        System.out.println("Another LazyLoadingLogger instance: " + anotherLazyLogger);

        System.out.println("Are both EagerLoadingLogger instances the same? " + (eagerLogger == anotherEagerLogger));
        System.out.println("Are both LazyLoadingLogger instances the same? " + (lazyLogger == anotherLazyLogger));
    }

    private static void bridgePattern() {
        /*
        *   Splits a large class into two
        *   separate hierarchies which can
        *   be developed independently
        * */
        AbstractionClient.client();
        CarClient.client();
    }

    private static void builderPattern() {

    }
}