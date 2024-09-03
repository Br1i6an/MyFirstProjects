/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2t11_machine_of_cofee;

import java.util.Scanner;

public class P2T11_machine_of_cofee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the cash:");
            int cash = sc.nextInt();
            System.out.println(Menu_drinks(cash));
            int option = sc.nextInt();
            Making_drink(option, cash);
                    

        } catch (Exception e) {
            System.err.println("ABORTED SYSTEM (public static void main)"
                    + "error: " + e.toString());
        }
    }

    public static String Menu_drinks(int cash) {
        //Method depending of the cash tath returns a drink
        try {
            String menu_text = "----Available drinks----\n\n";

            if (cash >= 1300) {
                menu_text += "(1) Express coffe $1.300\n";
            }
            if (cash >= 1000) {
                menu_text += "(2) American coffe $1.000\n";
            }
            if (cash >= 3000) {
                menu_text += "(3) Milo $3.000\n";
            }
            if (cash >= 2500) {
                menu_text += "(4) Chocolate $2.500\n";
            }
            if (cash >= 3000) {
                menu_text += "(5) Late $3.000\n";
            }
            if (cash >= 3800) {
                menu_text += "(6) Capuccino $3.800\n";
            }
            if (cash >= 1500) {
                menu_text += "(7) Aromatic water $1.500\n";
            }
            return menu_text;

        } catch (Exception e) {
            System.err.println("ABORTED SYSTEM (public static void Menu_drinks)"
                    + "error: " + e.toString());
            return "";
        }

    }

    public static void Making_drink(int option, int cash) {
        //  
        try {
            int return_cash = 0;
            if (option == 1) {
                return_cash = cash - 1300;
                System.out.println("The time for the Express coffe is: 2 minutes\n"
                        + "Your return cash is " + return_cash);

            }
            if (option == 2) {
                return_cash = cash - 1000;
                System.out.println("The time for the American coffe is: 3 minutes\n"
                        + "Your return cash is " + return_cash);
            }
            if (option == 3) {
                return_cash = cash - 3000;
                System.out.println("The time for the Milo is: 5 minutes\n"
                        + "Your return cash is " + return_cash);
            }
            if (option == 4) {
                return_cash = cash - 2500;
                System.out.println("The time for the Chocolate is: 50 seconds\n"
                        + "Your return cash is " + return_cash);
            }
            if (option == 5) {
                return_cash = cash - 1300;
                System.out.println("The time for the late is: 1 minute\n"
                        + "Your return cash is " + return_cash);
            }
            if (option == 6) {
                return_cash = cash - 3800;
                System.out.println("The time for the Capuccino is: 3 minutes\n"
                        + "Your return cash is " + return_cash);
            }
            if (option == 7) {
                return_cash = cash - 1300;
                System.out.println("The time for the aromatic water  is: 2 minutes\n"
                        + "Your return cash is " + return_cash);
            }

        } catch (Exception e) {
            System.err.println("Aborted system(public static int Making_drink)"
                    + "(int option, int cash), error: " + e.toString());
        }

    }

}
