/*
 * Author: Brian Rodríguez Rodríguez
 * Date: 2019-nov-14
 * Description: This program generates the age of N people
 */
package p2t29_age_of_many_people;

import java.util.Scanner;
import java.io.PrintWriter;

public class P2T29_Age_of_many_people {

    public static void main(String[] args) {
        //
        try {
            Show_menu();
            int[]vector=Create_vector();
            Show_vector(vector);
            Create_files(vector);
            
            

        } catch (Exception e) {
            System.err.println("Aborted system error:(public static void "
                    + "main(String[] args))" + e.toString());
        }

    }

    public static void Show_menu() {
        //
        try {
            System.out.println("-------MENU------\n"
                    + "This program generates the age of N people\n"
                    + "Created by Brian Rodríguez");

        } catch (Exception e) {
            System.err.println("Aborted system error:(public static void "
                    + "Show_menu())" + e.toString());
        }

    }

    public static int[] Create_vector() {
        //
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("How many people do you need? ");
            int N = Keyboard.nextInt();
            int[] vector = new int[N];
            for (int i = 0; i < N; i++) {
                vector[i] = (int) Math.round(Math.random() * 120);

            }
            return vector;

        } catch (Exception e) {
            System.err.println("Aborted system error:(public static int[]"
                    + "Create_vector())" + e.toString());
            return null;
        }

    }

    public static void Show_vector(int[] vector) {
        //
        try {
            for (int i = 0; i < vector.length; i++) {
                System.out.println("The person " + (i + 1) + " is " + vector[i]
                        + " years old");

            }

        } catch (Exception e) {
            System.err.println("Aborted system error:(public static void "
                    + "Show_vector(int[] vector))" + e.toString());
        }

    }

    public static int Count_meinor_five_years(int[] vector) {
        //
        try {
            int total = 0;
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] <= 5) {
                    total += 1;

                }

            }
            return total;

        } catch (Exception e) {
            System.err.println("Aborted system error:(public static int "
                    + "Count_meinor_five_years(int[] vector))" + e.toString());
            return 0;
        }

    }

    public static int Count_between_six_and_eighteen(int[] vector) {
        //
        try {
            int total = 0;
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] > 5 && vector[i] <= 18) {
                    total += 1;

                }

            }
            return total;

        } catch (Exception e) {
            System.err.println("Aborted system error:(public static int "
                    + "Count_between_six_and_eighteen(int[] vector))"
                    + e.toString());
            return 0;
        }

    }

    public static int Count_between_eighteen_and_fifty(int[] vector) {
        //
        try {
            int total = 0;
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] > 18 && vector[i] <= 50) {
                    total += 1;

                }

            }
            return total;

        } catch (Exception e) {
            System.err.println("Aborted system error:(public static int "
                    + "Count_between_eighteen_and_fifty(int[] vector))"
                    + e.toString());
            return 0;
        }

    }

    public static int Count_older_than_fifty(int[] vector) {
        //
        try {
            int total = 0;
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] > 50) {
                    total += 1;

                }

            }
            return total;

        } catch (Exception e) {
            System.err.println("Aborted system error:(public static int "
                    + "Count_between_eighteen_and_fifty(int[] vector))"
                    + e.toString());
            return 0;
        }

    }

    public static void Create_files(int[] vector) {
        //
        try {
            PrintWriter archivo = new PrintWriter("d:/Database_age.txt",
                    "UTF-8");
            archivo.println("This file is automatically created by java");
            for (int i = 0; i < vector.length; i++) {
                archivo.println("The age for the person " + (i + 1) + " is "
                        + vector[i]);

            }
            archivo.println("------TOTALS------");
            archivo.println("The total for the people meinor than five years is "
                    + Count_meinor_five_years(vector));
            archivo.println("The total for the people between five and eighteen "
                    + "years"
                    + " is " + Count_between_six_and_eighteen(vector));
            archivo.println("The total for the people between eighteen and fifty"
                    + " years is "
                    + Count_between_eighteen_and_fifty(vector));
            archivo.println("The total for the people older than fifty"
                    + " years is "
                    + Count_older_than_fifty(vector));
            archivo.close();

        } catch (Exception e) {
            System.err.println("Aborted system error:( public static void "
                    + "Create_files(int[] vector))" + e.toString());
        }

    }

}
