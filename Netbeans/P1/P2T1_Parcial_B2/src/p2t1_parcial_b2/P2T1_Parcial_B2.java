/*
 * Author       = Brian Rodriguez Rodriguez 
 * Date         = September  26 2019
 * Description  = This program calculates the final grade of N students
 */
package p2t1_parcial_b2;

import java.util.Scanner;

public class P2T1_Parcial_B2 {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("This program calculates the final grade of N students created by Brian Rodriguez");
        double nfinalmax = 0;
        double nfinalmin = 0;
        double nfinalprom = 0;
        double sumanotas = 0;
        System.out.println("Input the number of students ");
        int N = Keyboard.nextInt();
        for (int i = 1; i <= N; i += 1) {
            System.out.println("Input the 1° grade for the student" + i);
            float grade1 = Keyboard.nextFloat();

            while (grade1 < 0 || grade1 > 5) {
                System.err.println("The grade is wrong, please input a grade between 0-5:");

                grade1 = Keyboard.nextFloat();

            }
            System.out.println("Input the 2° grade for the student" + i);
            float grade2 = Keyboard.nextFloat();
            while (grade2 < 0 || grade2 > 5) {
                System.err.println("The grade is wrong, please input a grade between 0-5: ");
                grade2 = Keyboard.nextFloat();

            }
            System.out.println("Input the 3° grade for the student" + i);
            float grade3 = Keyboard.nextFloat();
            while (grade3 < 0 || grade3 > 5) {
                System.err.println("The grade is wrong, please input a grade between 0-5: ");
                grade3 = Keyboard.nextFloat();

            }
            double nfinal = (grade1 * 0.34) + (grade2 * 0.36) + (grade3 * 0.3);
            sumanotas = sumanotas + nfinalprom;
            if (i == 1) {
                nfinalmax = nfinal;
                nfinalmin = nfinal;
            } else {
                if (nfinal > nfinalmax) {
                    nfinalmax = nfinal;
                }
                if (nfinal < nfinalmin) {
                    nfinalmin = nfinal;
                }
            }

           
        }
         double promedio = sumanotas / N;
            System.out.println("La nota máxima es  " + nfinalmax + ", la nota mínima es " + nfinalmin + " y la nota promedio es " + nfinalprom);
    }
}

