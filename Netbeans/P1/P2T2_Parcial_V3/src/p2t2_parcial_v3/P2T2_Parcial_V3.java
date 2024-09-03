/*
 * Author       = Brian Rodriguez Rodriguez 
 * Date         = September  26 2019
 * Description  = This program calculates how many persons´re older or minor
 */
package p2t2_parcial_v3;

import java.util.Scanner;

public class P2T2_Parcial_V3 {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("This program calculates how many persons´re older or minor created by Brian Rodriguez");
        int mayor = 0;
        int menor = 0;

        System.out.println("Input the number of persons: ");
        int N = Keyboard.nextInt();
        for (int i = 1; i <= N; i += 1) {
            System.out.println("Input the birthdate for the person " + i);
            int year = Keyboard.nextInt();
            int age = 2019 - year;
            while (age < 0 || age > 100) {
                System.err.println("Error, the value for the age is not valid, please input a value between 1-100 ");
                System.out.println("Input the birthdate for the person " + i);
                year = Keyboard.nextInt();
                age = 2019 - year;
                
            }
             if (age<18){
                 menor=menor+1;
            
        }else{
                 mayor=mayor+1;
             }
            
        }
        System.out.println("The older persons´re "+mayor+" and the minor persons´re "+menor);
       
    }
}
