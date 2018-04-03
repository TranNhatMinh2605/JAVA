
package lab1;

import java.util.Scanner;


public class Bai4 {
    public static void main(String [] args){
    Scanner nhap = new Scanner(System.in);
    System.out.print("Phương trình bậc 2 dạng: AX^2 + BX + C = 0 \n");
    System.out.print("Nhập A = ");
    float a = nhap.nextFloat();
    System.out.print("Nhập B = ");
    float b = nhap.nextFloat();
    System.out.print("Nhập C = ");
    float c = nhap.nextFloat();
    double Delta = Math.pow(b,2) - 4*a*c;
    double SqrtDelta = Math.sqrt(Delta);
    System.out.printf("Delta = %f \n",Delta);
    System.out.printf("SqrtDelta = %f \n",SqrtDelta);
    }
}
