/*
 * Author      = Brian Rodriguez
 * Date        = November 14 2019
 * Description = Program that generates a randomic number of children for many people
 */
package p2t28_number_of_children;

import java.util.Scanner;
import java.io.PrintWriter;

public class P2T28_Number_of_children {

    public static void main(String[] args) {
        try {
            Show_menu();
            int vector[] = Create_vector();
            Show_vector(vector);            
            Create_files(vector);

        } catch (Exception e) {
            System.err.println("Aborted System error: (public static void "
                    + "main(String[] args))" + e.toString());
        }
    }

    public static void Show_menu() {
        try {
            System.out.println("=======MENU=======\n"
                    + "Program that generates a randomic number of children for"
                    + "many people\n"
                    + "------Created by Brian Rodríguez------");

        } catch (Exception e) {
            System.err.println("Aborted System error: (public static void"
                    + " Show_menu())" + e.toString());
        }

    }

    public static int[] Create_vector() {
        //Create vector for the program
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("How many peoplpe do you need? ");
            int N = Keyboard.nextInt();
            int[] vector = new int[N];
            for (int i = 0; i < N; i++) {
                vector[i] = (int) Math.round(Math.random() * 18);
            }
            return vector;

        } catch (Exception e) {
            System.err.println("Aborted System error: (public static int[] "
                    + "Create_vector())" + e.toString());
            return null;
        }

    }

    public static void Show_vector(int[] vector) {
        //
        try {
            for (int i = 0; i < vector.length; i++) {
                System.out.println("The person " + (i + 1) + " has " + vector[i]);

            }

        } catch (Exception e) {
            System.err.println("Aborted System error: (public static void "
                    + "Show_vector(int[] vector))" + e.toString());
        }

    }

    public static int View_max_sons(int[] vector) {
        //
        try {
            int max = 0;
            int person = 0;
            for (int i = 0; i < vector.length; i++) {
                if (i == 0) {
                    max = vector[i];
                    person = i;
                } else if (vector[i] > max) {
                    max = vector[i];
                    person = i;
                }

            }
            return person + 1;

        } catch (Exception e) {
            System.err.println("Aborted System error: (public static int "
                    + "View_max_sons(int[] vector))" + e.toString());
            return 0;
        }

    }

    public static int View_min_sons(int[] vector) {
        //
        try {
            int min = 0;
            int person = 0;
            for (int i = 0; i < vector.length; i++) {
                if (i == 0) {
                    min = vector[i];
                    person = i;
                } else if (vector[i] < min) {
                    min = vector[i];
                    person = i;
                }

            }
            return person + 1;

        } catch (Exception e) {
            System.err.println("Aborted System error: (public static int "
                    + "View_max_sons(int[] vector))" + e.toString());
            return 0;
        }

    }

    public static double Show_average_of_sons(int[] vector) {
        //
        try {
            int suma = 0;
            for (int i = 0; i < vector.length; i++) {
                suma += vector[i];

            }
            double average = suma / vector.length;
            return average;

        } catch (Exception e) {
            System.err.println("Aborted System error: (public static double "
                    + "Show_average_of_sons(int[] vector))" + e.toString());
            return 0;
        }

    }

    public static void Create_files(int[] vector) {
        //
        try {
            PrintWriter archivo = new PrintWriter("d:/Number_of_sons.txt", "UTF-8");
            archivo.println("This file was created automatically by java");
            for (int i = 0; i < vector.length; i++) {
                archivo.println("The person " + (i + 1) + " has " + vector[i]
                        + " sons");

            }
            archivo.println("----TOTALS----");
            archivo.println("The person with most sons is " + View_max_sons(vector));
            archivo.println("The person with less sons is " + View_min_sons(vector));
            archivo.println("The average of sons is " + Show_average_of_sons(vector));
            archivo.close();

        } catch (Exception e) {
            System.err.println("Aborted System error: (public static void "
                    + "Create_files(int[] vector))" + e.toString());
        }

    }

}
