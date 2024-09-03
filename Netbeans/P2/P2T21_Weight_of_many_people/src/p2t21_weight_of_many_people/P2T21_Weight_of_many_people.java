/*
 * Author:       Brian Rodriguez
 * Date:         November 5 2019
 * Description:  Software that calculates the weight of many people
 */
package p2t21_weight_of_many_people;

import java.util.Scanner;

public class P2T21_Weight_of_many_people {

    public static void main(String[] args) {
        try {
            Show_menu();
            double[] person = Generate_weight();
            Show_weight(person);
            Average_weight(person);
            Show_min_weight(person);
            Show_max_weight(person);

        } catch (Exception e) {
            System.err.println("Aborted System:"
                    + "(public static void main(String[] args))" + e.toString());
        }

    }

    public static void Show_menu() {
        //
        try {
            System.out.println("=======MENU=======\n"
                    + "Program that generates in a randomic way the "
                    + "weight of many people\n"
                    + "Created by Brian Rodríguez");

        } catch (Exception e) {
            System.err.println("Aborted System:"
                    + "(public static void Show_menu())" + e.toString());
        }

    }

    public static double[] Generate_weight() {
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("How many people do you need");
            int N = Keyboard.nextInt();
            double[] vector = new double[N];
            for (int i = 0; i < N; i++) {
                vector[i] = Math.round(Math.random() * 120);

            }
            return vector;
        } catch (Exception e) {
            System.err.println("Aborted System:"
                    + "(public static double[]Generate_weight())" + e.toString());
            return null;
        }

    }

    public static void Show_max_weight(double[] weight) {
        try {
            double max = 0;
            for (int i = 0; i < weight.length; i++) {
                if (i == 0) {
                    max = weight.length;
                } else if (weight[i] > max) {
                    max = weight[i];

                }
            }
            System.out.println("The heaviest person is " + max);

        } catch (Exception e) {
            System.err.println("Aborted System:"
                    + "(public static void Show_max_weight(double[] weight))"
                    + "" + e.toString());
        }

    }

    public static void Show_min_weight(double[] weight) {
        try {
            double min = 0;
            for (int i = 0; i < weight.length; i++) {
                if (i == 0) {
                    min = weight.length;
                } else if (weight[i] < min) {
                    min = weight[i];

                }
            }
            System.out.println("The lightest person is " + min);

        } catch (Exception e) {
            System.err.println("Aborted System:"
                    + "(public static void Show_min_weight(double[] weight))"
                    + "" + e.toString());
        }

    }

    public static void Show_weight(double[] weight) {
        try {
            System.out.println("------Next to show all weights------ ");
            for (int i = 0; i < weight.length; i++) {
                System.out.println("The weight of the person " + (i + 1)
                        + " is" + weight[i]);

            }

        } catch (Exception e) {
            System.err.println("Aborted System:"
                    + "(public static void Show_weight(double[] weight))"
                    + "" + e.toString());
        }

    }

    public static void Average_weight(double[] weight) {
        try {
            double suma = 0;
            for (int i = 0; i < weight.length; i++) {
                suma = weight[i];

            }
            double average = suma / weight.length;
            System.out.println("The average of the weights of the people is "
                    + average);

        } catch (Exception e) {
            System.err.println("Aborted System:"
                    + "public static double Average_weight())"
                    + "" + e.toString());
        }

    }

}
