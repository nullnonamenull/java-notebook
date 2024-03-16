package com.poleszak.designPattern.creational.singleton;

import com.poleszak.designPattern.creational.singleton.logger.EagerLoadingLogger;
import com.poleszak.designPattern.creational.singleton.logger.LazyLoadingLogger;

public class Main {

    public static void main(String[] args) {
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
}
