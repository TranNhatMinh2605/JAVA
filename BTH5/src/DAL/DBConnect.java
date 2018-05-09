/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author NhatMinh
 */
public class DBConnect {
    static String dbURL = "jdbc:sqlserver://NHATMINH-PC;databaseName=QuanLyBanHang;user=sa;password=nhatminh1";
    public static void main(String[] args) {        
        try {           
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                JOptionPane.showMessageDialog(null, "Success!!!","Connect",JOptionPane.INFORMATION_MESSAGE);
            }            
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Fail!!!","Connect",JOptionPane.ERROR_MESSAGE);
        }
    }
}