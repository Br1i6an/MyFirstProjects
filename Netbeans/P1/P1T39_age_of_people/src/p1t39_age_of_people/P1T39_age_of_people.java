/*
 * Author     = Brian Rodriguez Rodriguez
 * Date       = September 11 2019
 * Directory  = This program is to know the age of a person 
 */
package p1t39_age_of_people;

import java.util.Scanner;

public class P1T39_age_of_people {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("This program is to know the age of a person, Input your age: ");
        int age = teclado.nextInt();
        if (age > 0) {
            if (age < 6) {
                System.out.println("Yo´re a kid ");

            } else {
                if (age < 18) {
                    System.out.println("You´re a teen ");
                } else {
                    if (age < 45) {
                        System.out.println("You´re an adult ");
                    } else {
                        if (age < 90) {
                            System.out.println("You´re an old ");
                        } else {
                            System.out.println("You´re Matusalem");
                        }
                    }
                }
            }

        } else {
            System.out.println("Error the value of the age is not valid ");
        }
    }
}
