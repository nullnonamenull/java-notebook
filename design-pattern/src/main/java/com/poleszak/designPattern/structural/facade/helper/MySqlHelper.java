package com.poleszak.designPattern.structural.facade.helper;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        System.out.println(tableName);
        System.out.println(con);
    }

    public void generateMySqlHTMLReport(String tableName, Connection con) {
        System.out.println(tableName);
        System.out.println(con);
    }
}
