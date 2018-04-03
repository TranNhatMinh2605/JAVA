/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author NhatMinh
 */
public class Bai2 {
    public static void main(String[] args){
    Scanner nhap  = new Scanner(System.in);
    System.out.print("Nhập chiều dài: ");
    float Chieudai = nhap.nextFloat();
    System.out.print("Nhập chiều rộng: ");
    float Chieurong = nhap.nextFloat();
    float chuvi = ( Chieudai + Chieurong ) * 2;
    float dientich = Chieudai * Chieurong;
    System.out.printf("Chu vi = %f \n",chuvi);
    System.out.printf("Diện tích = %f \n",dientich);
    }
}
