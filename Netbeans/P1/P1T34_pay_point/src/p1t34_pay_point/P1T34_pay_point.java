/*
 * Author    = Brian Rodriguez 
 * Date      = 10 September 2019
 * Directory = This program calculate IVA (19%) for four products
 */
package p1t34_pay_point;
import java.util.Scanner;

public class P1T34_pay_point {

    
    public static void main(String[] args) {
  System.out.println("this program calculate IVA (19%)for four products, input the value of the 1° product ");
  Scanner teclado =new Scanner (System.in);
  int prod1=teclado.nextInt();
        System.out.println(" Input the 2° product: ");
        int prod2=teclado.nextInt();
        System.out.println(" Input the 3° product: ");
        int prod3=teclado.nextInt();
        System.out.println(" Input the 4° product: ");
         int prod4=teclado.nextInt();
        
         int bruto= prod1+prod2+prod3+prod4;
         double IVA= bruto*0.19;
         double total= bruto+IVA;
         System.out.println(" The gross value is "+ bruto+" VAT (19%) is "+IVA+" Total is "+  total);
        
        
    }
    
}
