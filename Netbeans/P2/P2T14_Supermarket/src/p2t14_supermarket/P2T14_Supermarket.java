/*
 * Author     = Brian Rodriguez
 * Date       = October 21 2019
 * Directory  = Software that simulates the books loans in a library 
 */
package p2t14_supermarket;

import java.util.Scanner;

public class P2T14_Supermarket {

    public static void main(String[] args) {
        //
        Scanner Keyboard = new Scanner(System.in);
        try {

        } catch (Exception e) {
            System.err.println("Aborted system: (public static void main"
                    + "(String[] args))"
                    + e.toString());
        }
    }

    public static int State_menu() {
        //This function selects the satate where you live
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("--------STATE MENU--------\n"
                    + "Select a option:"
                    + "\n (1) Boyacá"
                    + "\n (2) Cundinamarca"
                    + "\n (3) Bolívar"
                    + "\n (4) Atlántico"
                    + "\n-----Created by Brian Rodriguez-----");
            int option = Keyboard.nextInt();
            while (option < 1 || option < 4) {
                System.out.println("The option is invalid");
                System.out.println("--------STATE MENU--------\n"
                    + "Select a option:"
                    + "\n (1) Boyacá"
                    + "\n (2) Cundinamarca"
                    + "\n (3) Bolívar"
                    + "\n (4) Atlántico"
                    + "\n-----Created by Brian Rodriguez-----");
            option = Keyboard.nextInt();
            }
            return option;

        } catch (Exception e) {
            System.err.println("Aborted system: (public static int State_menu())"
                    + e.toString());
            return 0;
        }

    }
    public static int Food_menu(int option) {
        try {
            String menu= "The menu available is: \n";
            if(option==1){
                menu+="(1) Cocido boyacense\n (2) Arepa Ramiriqueña\n (3) Envueltos ";                
            }else if (option==2){
                menu+= "(1) Postres de Sopó\n (2) ";
            }
            
        } catch (Exception e) {
            System.err.println("Aborted system: (public static int Food_menu())"
                    + e.toString());
            return 0;
        }
        
    }

}
