package com.poleszak.designPattern.structural.facade.helper;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getOracleDBConnection() {
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        System.out.println(tableName);
        System.out.println(con);
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        System.out.println(tableName);
        System.out.println(con);
    }

}