/*
 * Author     = Brian Rodriguez
 * Date       = October 21 2019
 * Directory  = Software that simulates the books loans in a library 
 */
package p2t13_loan_of_a_library;

import java.util.Scanner;

public class P2T13_Loan_of_a_library {

    public static void main(String[] args) {
        //Principal function 
        Scanner Keyboard = new Scanner(System.in);
        try {
            int menu = Library_menu();
            if (menu == 1) {
                Loan();

            } else if (menu == 2) {
                give_back();
            } else {
                System.err.println("Invalid option");

            }

        } catch (Exception e) {
            System.err.println("Aborted System: (public static void main)"
                    + e.toString());
        }
    }

    public static int Library_menu() {
        //Function for returns a option for the menu 
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("--------LIBRARY MENU--------\n"
                    + "Select a option:"
                    + "\n (1) Loan"
                    + "\n (2) Give back"
                    + "\n (0) To quit"
                    + "\n-----Created by Brian Rodriguez-----");
            int option = Keyboard.nextInt();
            return option;

        } catch (Exception e) {
            System.err.println("Aborted System: (public static int "
                    + "Library_menu())"
                    + e.toString());
            return 0;
        }

    }

    public static void Loan() {
        //
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("------LOAN------\n"
                    + "Select a loan option:"
                    + "\n (1) Books"
                    + "\n (2) Journals"
                    + "\n (3) Videos"
                    + "\n (4) Computers");
            int option_service = Keyboard.nextInt();
            System.out.println("You have selected the loan service"
                    + option_service);

        } catch (Exception e) {
            System.err.println("Aborted System: ( public static void Loan())"
                    + e.toString());
        }

    }

    public static void give_back() {
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("--------GIVE BACK--------\n"
                    + "Select a option for give back "
                    + "\n (1) Books"
                    + "\n (2) Journals"
                    + "\n (3) Videos"
                    + "\n (4) Computers");
            int option_service = Keyboard.nextInt();

            while (option_service >= 1 && option_service <= 4) {
                int daysloan = Days_loan();
                if ((option_service == 1 && daysloan > 4)
                        || (option_service == 2 && daysloan > 3)
                        || (option_service == 3 && daysloan > 2)
                        || (option_service == 4 && daysloan > 1)) {
                    System.err.println("You must to pay a penalty for the days "
                            + "delay");
                }
            }

        } catch (Exception e) {
            System.err.println("Aborted System: (public static void give_back())"
                    + e.toString());
        }

    }

    public static int Days_loan() {
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("--------Days Loan--------\n"
                    + "Input the number of days that you had the service ");
            int days = Keyboard.nextInt();
            while (days <= 0) {
                System.err.println("The number of days is err");
                System.out.println("--------Days Loan--------\n"
                        + "How many days did it take?");
                days = Keyboard.nextInt();

            }
            return days;
        } catch (Exception e) {
            System.err.println("Aborted System: (public static int Days_loan())"
                    + e.toString());
            return 0;
        }

    }

}
