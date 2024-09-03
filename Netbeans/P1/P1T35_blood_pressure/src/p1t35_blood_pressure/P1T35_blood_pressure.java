/*
 * Author    = Brian Rodriguez 
 * Date      = 10 September 2019
 * Directory = This program calculate the systolic and the diastolic pressure data of a person
 */
package p1t35_blood_pressure;

import java.util.Scanner;

public class P1T35_blood_pressure {

    public static void main(String[] args) {
        System.out.println("This program calculate the systolic and the diastolic pressure data of a person, input the value of the systolic pressure ");
        Scanner teclado = new Scanner(System.in);
        int systolic = teclado.nextInt();
        System.out.println("Input the value of the diastolic pressure ");
        int diastolic = teclado.nextInt();

        if (diastolic <= 80 & systolic <= 120) {
            System.out.println("Your pressure is normal ");
        } else {
            if (diastolic <= 89 && systolic <= 139) {
                System.out.println("You have prehypertension ");
            } else {
                if (diastolic <= 99 && systolic <= 159) {
                    System.out.println("You  have hypertension ");
                } else {
                    System.out.println("data error");
                }
            }
        }
    }
}
