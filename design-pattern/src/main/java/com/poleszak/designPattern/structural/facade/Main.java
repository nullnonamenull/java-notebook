package com.poleszak.designPattern.structural.facade;

import com.poleszak.designPattern.structural.facade.helper.HelperFacade;
import com.poleszak.designPattern.structural.facade.helper.MySqlHelper;
import com.poleszak.designPattern.structural.facade.helper.OracleHelper;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        String tableName = "Employee";

        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
