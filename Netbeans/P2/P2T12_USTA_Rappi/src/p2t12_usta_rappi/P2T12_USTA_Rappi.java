/*
 * Author     = Brian Rodriguez
 * Date       = October 21 2019
 * Directory  = Software for the food service USTA rappi 
 */
package p2t12_usta_rappi;

import java.util.Scanner;

public class P2T12_USTA_Rappi {

    public static void main(String[] args) {
        //Principal function 
        Scanner Keyboard = new Scanner(System.in);
        try {
            int option = Location_menu();
            Service(option);

        } catch (Exception e) {
            System.err.println("Aborted System: (public static void main)"
                    + e.toString());
        }

    }

    public static int Location_menu() {
        //Function to returns a option for the menu of USTArappi 
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("---------USTA RAPPI---------\n "
                    + "select your location:"
                    + "\n (1) Muiscas--10 min---$5.000"
                    + "\n (2) Downtown--5 min--$2.000"
                    + "\n (3) Hongos--15 min--$7.500"
                    + "\n (4) Las Quintas--10 min--$4.000"
                    + "\n (5) San Francisco--20 min--$10.000"
                    + "\n (0) To quit"
                    + "\n -----Created by Brian Rodriguez-----");
            int option = Keyboard.nextInt();
            return option;

        } catch (Exception e) {
            System.err.println("Aborted System: (public static int Location_menu)"
                    + e.toString());

        }
        return 0;

    }

    public static void Service(int option) {
        //Fuction for show the price of the service
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("---------Service---------\n "
                    + "Select your service"
                    + "\n (1) Purchases in supermarket---$15.000"
                    + "\n (2) Payments of invoices in banks---$10.000"
                    + "\n (3) Carrying objects---$5.000");
            int option_service = Keyboard.nextInt();
            int price = 0;
            int time = 0;
            if (option == 1 && option_service == 1) {
                time = 10;
                price = 20000;
            } else if (option == 1 && option_service == 2) {
                time = 10;
                price = 15000;
            } else if (option == 1 && option_service == 3) {
                time = 10;
                price = 10000;
            } else if (option == 2 && option_service == 1) {
                time = 5;
                price = 17000;
            } else if (option == 2 && option_service == 2) {
                time = 5;
                price = 12000;
            } else if (option == 2 && option_service == 3) {
                time = 5;
                price = 7000;
            } else if (option == 3 && option_service == 1) {
                time = 15;
                price = 22500;
            } else if (option == 3 && option_service == 2) {
                time = 15;
                price = 17500;
            } else if (option == 3 && option_service == 3) {
                time = 15;
                price = 12500;
            } else if (option == 4 && option_service == 1) {
                time = 10;
                price = 19000;
            } else if (option == 4 && option_service == 2) {
                time = 10;
                price = 14000;
            } else if (option == 4 && option_service == 3) {
                time = 10;
                price = 9000;
            } else if (option == 5 && option_service == 1) {
                time = 20;
                price = 25000;
            } else if (option == 5 && option_service == 2) {
                time = 20;
                price = 20000;
            } else if (option == 5 && option_service == 3) {
                time = 20;
                price = 15000;
            }
            System.out.println("The neecessary time is " + time + " minutes and"
                    + " the total "
                    + "price is $" + price);

        } catch (Exception e) {
            System.err.println("Aborted System: ( public static void Service)"
                    + e.toString());
        }

    }

}
