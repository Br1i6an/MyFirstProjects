/*
 * Author       = Brian Rodriguez
 * Date         = September 30 2019
 * Description  = Ask the password 
 */
package p2t3_password;

import java.util.Scanner;

public class P2T3_Password {

    public static void main(String[] args) {
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("Program to now the password, please input your "
                    + "password: ");
            int password = Keyboard.nextInt();
            int password1 = 352;
            int password2 = 259;
            int password3 = 569;
            int count = 1;
            boolean login = false;
            if (password == password1 || password == password2 || password == password3) {
                System.out.println("Welcome");
                login = true;
            } 
            while (login == false && count <= 2) {
                    System.out.println("Wrong password, please try again ");
                    password = Keyboard.nextInt();
                    count +=1;
                     if (password == password1 || password == password2 || password == password3) {
                System.out.println("Welcome");
                login = true;
                  
            
                     }  
            }
        } catch (Exception e) {
            System.err.println("Abort system, error:" + e.toString());
        }

    }
    }

