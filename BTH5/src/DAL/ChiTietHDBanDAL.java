/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChiTietHDBan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author NhatMinh
 */
public class ChiTietHDBanDAL {
 public static ArrayList<ChiTietHDBan> getAll(){
        Connection con = Connect.OpenConnection();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from ChiTietHDBan";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<ChiTietHDBan> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaHDBan = rs.getString("MaHDBan");
                    String MaHang = rs.getString("MaHang");
                    float SoLuong = rs.getFloat("SoLuong");
                    float DonGia = rs.getFloat("DonGia");
                    float GiamGia = rs.getFloat("GiamGia");
                    float ThanhTien = rs.getFloat("ThanhTien");
                    ChiTietHDBan chiTiet = new ChiTietHDBan(MaHDBan, MaHang,SoLuong, DonGia, GiamGia, ThanhTien);
                    ds.add(chiTiet);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
 public static int Insert(String MaHDBan, String MaHang, float SoLuong,float DonGia,float GiamGia,float ThanhTien){
        Connection con = Connect.OpenConnection();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into ChiTietHDBan(MaHDBan, MaHang, SoLuong,DonGia,GiamGia,ThanhTien) values ('"+ MaHDBan +"','"+ MaHang +"',"+ SoLuong +","+ DonGia +","+ GiamGia +","+ ThanhTien +")";
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
    
    public static int Update(String MaHDBan, String MaHang, float SoLuong, float DonGia,float GiamGia,float ThanhTien){
        Connection con = Connect.OpenConnection();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update ChiTietHDBan set SoLuong = "+ SoLuong +",DonGia = "+ DonGia +",GiamGia="+ GiamGia +",ThanhTien = "+ ThanhTien +" where MaHDBan = '"+ MaHDBan +"' and MaHang='"+MaHang+"'";
                int rs = stmt.executeUpdate(Sql);
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
    
    public static int Delete(String MaHDBan){
        Connection con = Connect.OpenConnection();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from ChiTietHDBan where MaHDBan = '"+MaHDBan+"'";
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
