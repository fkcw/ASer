package com.aser.dao;

import javax.print.DocFlavor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by PeterZhang on 2015/2/12.
 */
public class DBQDao {
    private static ResultSet rs;
    private static PreparedStatement pstmt;
    public ResultSet queryRs(Connection connection,String db_name) throws SQLException {
        String sql = "SELECT * FROM "+db_name;
        pstmt = connection.prepareStatement(sql);
        rs = pstmt.executeQuery();
        return rs;
    }

}
