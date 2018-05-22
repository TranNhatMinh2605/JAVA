/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChatLieuDAL;
import DTO.ChatLieu;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NhatMinh
 */
public class FormChatLieu {
    public static ArrayList<ChatLieu> ChatLieuArray(){
        return ChatLieuDAL.getALL();
    }
    
    public static DefaultTableModel ChatLieuModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Chất Liệu");
        model.addColumn("Tên Chất Liệu");
        try{
            for(int i = 0; i < ChatLieuArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(ChatLieuArray().get(i).getMaChatLieu());
                h.add(ChatLieuArray().get(i).getTenChatLieu());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            System.out.println("Fail");
            return null;
        }
    }
    
    public static int InsertChatLieu(String MaChatLieu,String TenChatLieu){
            return ChatLieuDAL.Insert(MaChatLieu, TenChatLieu);
    }
    
    public static int UpdateChatLieu(String MaChatLieu, String TenChatLieu){
            return ChatLieuDAL.Update(MaChatLieu, TenChatLieu);
    }
    
    public static int DeleteChatLieu(String MaChatLieu){
            return ChatLieuDAL.Delete(MaChatLieu);
    }

}
