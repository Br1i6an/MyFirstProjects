/*
 * Author       = Brian Rodriguez
 * Date         = October 16 2019
 * Description  = Software to know the SOAT of a car
 */
package p2t10_soat;

import java.util.Scanner;

public class P2T10_SOAT {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        try {
            int N = Main_menu();
            int SOATmaximo = 0;
            int SOATminimo = 0;
            int sumaSOAT = 0;

            for (int i = 1; i <= N; i = i + 1) {

                System.out.println("Input the model for the vehicle " + i);
                int model = Keyboard.nextInt();
                System.out.println("Input the gamma for the vehicle (1) for low gamma, (2) for medium gamma or (3) for high gamma " + i);
                int gamma = Keyboard.nextInt();
                int SOAT = SOAT(model, gamma);
                sumaSOAT += SOAT;
                if (i == 1) {
                    SOATmaximo = SOAT;
                    SOATminimo = SOAT;
                } else if (SOAT > SOATmaximo) {
                    SOATmaximo = SOAT;

                } else if (SOAT < SOATminimo) {
                    SOATminimo = SOAT;

                }

            }
            double averageSOAT = sumaSOAT / N;
            System.out.println("The maximum SOAT is " + SOATmaximo + " ,the minimum SOAT is " + SOATminimo + " and the average of the SOAT is " + averageSOAT);

        } catch (Exception e) {
            System.err.println("Error Aborted System: ");
        }

    }

    public static int Main_menu() {
        //Function for Watch the main menu 

        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("Created by: Brian Rodriguez ");
            System.out.println("-----------MENU-----------");
            System.out.println("Input how many vehicles you need:");

            int N = Keyboard.nextInt();
            return N;

        } catch (Exception e) {
            System.err.println("Error Aborted System: Main_menu() " + e.toString());
            return 0;
        }

    }

    public static int SOAT(int model, int gamma) {
        //Function which allows to watch the model and gamma for a vehicle
        try {
            int agecar = 2019 - model;
            int valuesoat = 0;
            if (agecar < 10 && gamma == 1) {
                valuesoat = 200000;

            } else if (agecar < 10 && gamma == 2) {
                valuesoat = 350000;

            } else if (agecar < 10 && gamma == 3) {
                valuesoat = 500000;

            } else if (agecar >= 10 && gamma == 1) {
                valuesoat = 400000;

            } else if (agecar >= 10 && gamma == 2) {
                valuesoat = 700000;
            } else if (agecar >= 10 && gamma == 3) {
                valuesoat = 1200000;
            }
            return valuesoat;

        } catch (Exception e) {
            System.err.println("Error Aborted System: SOAT() " + e.toString());
            return 0;
        }

    }

}
