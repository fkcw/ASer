package com.aser.util;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by PeterZhang on 2015/2/12.
 */
public class DBUtil {
    private static String db_username;
    private static String db_userpassword;
    private static final String jdbcname = "com.ibm.as400.access.AS400JDBCDriver";

    public Connection getCon() throws SQLException, ClassNotFoundException {
        Class.forName(jdbcname);
        DriverManager.registerDriver(new com.ibm.as400.access.AS400JDBCDriver());
        String db_url = "jdbc:as400://10.0.1.111/orionfilep";
        return DriverManager.getConnection(db_url,db_username,db_userpassword);
    }

    public void CloseCon(Connection connection) throws SQLException {
        if (connection !=null){
            connection.close();
        }
    }

    public static void main(String[] args) {
        DBUtil dbUtil = new DBUtil();
        try {
            Connection con = dbUtil.getCon();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
