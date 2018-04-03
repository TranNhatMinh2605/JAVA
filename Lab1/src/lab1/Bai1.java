package lab1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
    Scanner nhap  = new Scanner(System.in);
    System.out.print("Họ và tên: ");
    String Hoten = nhap.nextLine();
    System.out.print("Điểm TB: ");
    double DiemTB = nhap.nextDouble();
    System.out.printf("%s %f \n",Hoten,DiemTB);
    }   
}
