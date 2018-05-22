/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author NhatMinh
 */
public class Connect {
    static String dbURL = "jdbc:sqlserver://NHATMINH-PC;databaseName=QuanLyBanHang;user=sa;password=nhatminh1";
    static Connection conn = null;
    public static Connection OpenConnection(){
        try {
            conn=DriverManager.getConnection(dbURL);
            return conn;
                    } 
        catch (SQLException ex) {
            return null;
        }
    }
 /*   public static void main(String[] args) {
        Connection con = OpenConnection();
        if (conn != null) {
                JOptionPane.showMessageDialog(null, "Success!!!","Connect",JOptionPane.INFORMATION_MESSAGE);
            }
        else
            JOptionPane.showMessageDialog(null, "Fail!!!","Connect",JOptionPane.ERROR_MESSAGE);
    }*/
}

