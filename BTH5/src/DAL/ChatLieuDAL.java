/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChatLieu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author NhatMinh
 */
public class ChatLieuDAL {
    public static ArrayList<ChatLieu> getALL() {
        Connection con = Connect.OpenConnection();
        if(con != null){
        try {
            Statement stm = con.createStatement();
            String sqlSelect = "select * from ChatLieu";
            ResultSet rs=stm.executeQuery(sqlSelect);
            ArrayList<ChatLieu> chat = new ArrayList<>();
        while (true) {            
            if(!rs.next()) break;
            String MaChatLieu=rs.getString("MaChatLieu");
            String TenChatLieu=rs.getString("TenChatLieu");
            DTO.ChatLieu Chatlieu= new DTO.ChatLieu(MaChatLieu, TenChatLieu);
            chat.add(Chatlieu);
        }
        return chat;
        } catch (SQLException ex) {
            System.out.println("Fail");
            return null;
        }
        }
        return null;
    }
    public static int Insert(String MaChatLieu, String TenChatLieu){
            Connection con = Connect.OpenConnection();
            if(con != null){
                try{
                    Statement stmt = con.createStatement();
                    String sql = "insert into ChatLieu(MaChatLieu,TenChatLieu) values ('"+ MaChatLieu +"',N'"+ TenChatLieu +"')";
                    int rs = stmt.executeUpdate(sql);
                    if(rs < 1){
                        con.close();
                        return 0;
                    } else {
                        con.close();
                        return 1;
                    }
                } catch (SQLException ex){
                    return 0;
                }
            }
            return 0;
        }
    public static int Update(String MaChatLieu, String TenChatLieu){
            Connection con = Connect.OpenConnection();
            if(con != null){
                try{
                    Statement stmt = con.createStatement();
                    String sql = "update ChatLieu set TenChatLieu = N'"+ TenChatLieu +"' where MaChatLieu = '"+ MaChatLieu +"'";
                    int rs = stmt.executeUpdate(sql);
                    if(rs < 1){
                        con.close();
                        return 0;
                    } else {
                        con.close();
                        return 1;
                    }
                } catch (SQLException ex){
                    return 0;
                }
            }
            return 0;
        }
    public static int Delete(String MaChatLieu){
        Connection con = Connect.OpenConnection();
        if (con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from ChatLieu where MaChatLieu = '"+ MaChatLieu +"'";
                //String sql = "EXEC dbo.QLBH_DEL @MaCL = N'"+ MaChatLieu +"'";
                int rs = stmt.executeUpdate(sql);
                if(rs < 1){
                    con.close();
                    return 0;
                } else {
                    con.close();
                    return 1;
                }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
}
