package pl.coderslab.utils;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DbUtil {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?" +
            "useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab";


    /**To już jest zastąpione kodem w linii 27*/
//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
//    }


    private static DataSource dataSource;

    public static Connection getConnection() throws SQLException {

        return getInstance().getConnection();   }

    private static DataSource getInstance() {

        if (dataSource == null) {

            try {
                Context initContext = new InitialContext();
                Context envContext = (Context)initContext.lookup("java:/comp/env");
                dataSource = (DataSource)envContext.lookup("jdbc/users");
            } catch (NamingException e) { e.printStackTrace(); }
        }

        return dataSource;

    }

}
