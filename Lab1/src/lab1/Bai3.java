
package lab1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
    Scanner nhap = new Scanner(System.in);
    System.out.print("Nhập vào cạnh hình lập phương: ");
    float Canh = nhap.nextFloat();
    double thetich = Math.pow(Canh,3);
    System.out.printf("Thể tích khối lập phương = %f",thetich);
    }
}
