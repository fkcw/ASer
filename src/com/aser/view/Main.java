package com.aser.view;

import com.aser.dao.DBQDao;
import com.aser.util.DBUtil;
import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;

import javax.sound.midi.Soundbank;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

/**
 * Created by PeterZhang on 2015/2/12.
 */
public class Main {
    static DBQDao dbqDao = new DBQDao();
    static DBUtil dbUtil = new DBUtil();

    public static void main(String[] args) {

        Connection con = null;
        try {
            con = dbUtil.getCon();
            ResultSet rs = dbqDao.queryRs(con, "ORIONFILEP.NAMADRPF");
            ResultSetMetaData rsmd = rs.getMetaData();
            Vector<Object> nameOfcolumns = new Vector<Object>();
            for (int i=1; i <=rsmd.getColumnCount();i++){
                nameOfcolumns.addElement(rsmd.getColumnName(i));
            }
            while (rs.next()){

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                dbUtil.CloseCon(con);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}