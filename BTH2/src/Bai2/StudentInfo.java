/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author NhatMinh
 */
public class StudentInfo {
        int STT;
        String Ten;
        String NamSinh;
        String GioiTinh;
        public void setSTT(int stt){
            this.STT = stt;
        }
        public int getSTT(){
            return STT;
        }
        public void setTen(String ten){
            this.Ten = ten;
        }
        public String getTen(){
            return Ten;
        }
        public void setNam(String nam){
            this.NamSinh = nam;
        }
        public String getNam(){
            return NamSinh;
        }
        public void setGioi(String sex){
            this.GioiTinh = sex;
        }
        public String getGioi(){
            return GioiTinh;
        }
        
}
