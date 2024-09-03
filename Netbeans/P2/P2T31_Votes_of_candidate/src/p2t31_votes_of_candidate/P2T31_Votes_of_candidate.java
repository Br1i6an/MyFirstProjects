/*
 * Author      = Brian Rodriguez 
 * Date        = November 14 2019
 * Description = Program for generate random votes for a candidate 
 */
package p2t31_votes_of_candidate;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class P2T31_Votes_of_candidate {

    public static void main(String[] args) {
        //
        try {

        } catch (Exception e) {
            System.err.println("Aborted system error:(public static void main"
                    + "(String[] args))" + e.toString());
        }

    }

    public static void Show_menu() {
        //
        try {

        } catch (Exception e) {
            System.err.println("Aborted system error:( public static void "
                    + "Show_menu())" + e.toString());
        }

    }

    public static int[] Generate_votes() {
        //
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("How many candidates do you need?");
            int N = Keyboard.nextInt();
            int[] vector = new int[N];
            int estado = 0;
            for (int i = 0; i < N; i++) {
                while (vector[i] % 2 != 1) {
                    vector[i] = (int) Math.round(Math.random() * 100);

                }

            }
            return vector;

        } catch (Exception e) {
            System.err.println("Aborted system error:(public static int[] "
                    + "Generate_votes())" + e.toString());
            return null;
        }

    }

}
