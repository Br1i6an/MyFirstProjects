/*
 * Author       = Brian Rodriguez
 * Date         = October 01 2019
 * Description  = This program calculates the salary, health, penssion and the ARL of an employee
 */
package p2t6_salario_mensual_persona;

import java.util.Scanner;

public class P2T6_Salario_mensual_persona {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        try {
            System.out.println("Input the salary of the contract: ");
            int contr = Keyboard.nextInt();
            System.out.println("Please input the days worked by the employee: ");
            int days = Keyboard.nextInt();
            while (days < 1 || days > 30) {
                System.err.println("Error, the value for the days is incorrect, "
                        + "please input a correct value: (1-30)");
                days = Keyboard.nextInt();               
            }
            int salary= contr*30/days;
            System.out.println("The salary of the employee is: $"+salary);
            health(salary);
            penssion(salary);
            ARL(salary);
        } catch (Exception e) {
            System.err.println("Aborted system error: " + e.toString());
        }

    }
    public static void health(int salary) {
        // Description  = This program calculates the health of an employee
        try {
            double health=salary*0.125;
            System.out.println("The value of the health is: $"+health);
        } catch (Exception e) {
            System.err.println("Aborted system error: " + e.toString());
        }
    }
    public static void penssion(int salary) {
        // Description  = This program calculates the health of an employee
        try {
            double penss=salary*0.16;
            System.out.println("The value of the penssion is: $"+penss);
        } catch (Exception e) {
            System.err.println("Aborted system error: " + e.toString());
        }
    }
    public static void ARL(int salary) {
        // Description  = This program calculates the health of an employee
        try {
            double ARL=salary*0.0522;
            System.out.println("The value of the ARL is: $"+ARL);
        } catch (Exception e) {
            System.err.println("Aborted system error: " + e.toString());
        }
    }

}
