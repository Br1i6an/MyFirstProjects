/*
 * Author:       Brian Rodriguez
 * Date:         October 31 2019
 * Description:  Software that builds an array of models of vehicles
 */
package p2t19_vehicles_models;

import java.util.Scanner;

public class P2T19_Vehicles_models {

    public static void main(String[] args) {
        try {
            Scanner Keyboard = new Scanner(System.in);
            Main_menu();

            int vehicles[] = Input_Models();
            Display_oldest(vehicles);
            Display_newest(vehicles);
            Average_Vehicles(vehicles);

        } catch (Exception e) {
            System.err.println("Aborted System:(public static void main"
                    + "(String[] args))" + e.toString());
        }

    }

    public static void Main_menu() {
        //This function allows watch the menu
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("======MAIN MENU======\n"
                    + "This program builds an array of models for 10 vehicles\n"
                    + "-----Created by Brian Rodriguez-----");

        } catch (Exception e) {
            System.err.println("Aborted System:(public static void Watch_menu()"
                    + ")" + e.toString());
        }

    }

    public static int[] Input_Models() {
        //Function that returns an array of vehicle models
        try {
            Scanner Keyboard = new Scanner(System.in);
            int vector[] = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Input the model for the vehicle " + (i + 1));
                vector[i] = Keyboard.nextInt();

            }
            return vector;

        } catch (Exception e) {
            System.err.println("Aborted System:(public static int "
                    + "[]Input_Models()" + ")" + e.toString());
            return null;
        }

    }

    public static void Display_oldest(int[] vehicles) {
        //function made for know the oldest vehicle
        try {
            int oldest = 0;
            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    oldest = vehicles[i];
                }
                if (oldest > vehicles[i]) {
                    oldest = vehicles[i];

                }

            }
            System.out.println("The oldest vehicle is " + oldest);

        } catch (Exception e) {
            System.err.println("Aborted System:( public static void "
                    + "Display_oldest(int[] vehicles))"+e.toString());
        }

    }

    public static void Display_newest(int[] vehicles) {
        //function made for know the newest vehicle
        try {
            int newest = 0;
            for (int i = 0; i < 10; i++) {
                if (i == 0) {
                    newest = vehicles[i];

                }
                if (newest < vehicles[i]) {
                    newest = vehicles[i];

                }

            }
            System.out.println("The newest vehicle is " + newest);

        } catch (Exception e) {
            System.err.println("Aborted System:( public static void "
                    + "Display_newest(int[] vehicles))"+e.toString());
        }

    }
    public static void Average_Vehicles(int[] vehicles) {
        try {
            int suma=0;
            for(int i=0;i<10;i++){
                suma+=vehicles[i];                                
            }
            double average=suma/10;
            System.out.println("The average of vehicles is "+average);
            
        } catch (Exception e) {
            System.err.println("Aborted System:(public static void "
                    + "Average_Vehicles(int[] vehicles))"+e.toString());
        }
        
    }

}
