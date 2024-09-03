/*
 * Author       = Brian Rodriguez
 * Date         = October 01 2019
 * Description  = Calculadora
 */
package p2t5_calculator;

import java.util.Scanner;

public class P2T5_Calculator {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        try {
            int option = -1;

            while (option != 0) {
                System.out.println("Welcome to this program that simulates a calculator.\nInput a option:");
                System.out.println(" 1-suma\n 2-resta\n 3-multiplicación\n 4-división\n 0-salir");
                option = Keyboard.nextInt();
                if (option == 1) {
                    suma_dos_numeros();
                } else if (option == 2) {
                    resta_dos_numeros();
                } else if (option == 3) {
                    multiplicar_dos_numeros();
                } else if (option == 4) {
                    dividir_dos_numeros();
                } else {
                    System.err.println("La opción ingresada  no existe ");
                }
            }

        } catch (Exception e) {
            System.err.println("Aborted program P2T5_Calculator, error: " + e.toString());
        }
    }

    public static void suma_dos_numeros() {
        // Description  = Este metodo suma dos números  

        System.out.println("Suma de dos números ");

        Scanner Keyboard2 = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer número: ");
            int num1 = Keyboard2.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = Keyboard2.nextInt();
            int suma = num1 + num2;
            System.out.println("La suma de los números es " + suma);
        } catch (Exception e) {
            System.err.println("Aborted system error: " + e.toString());
        }

    }

    public static void resta_dos_numeros() {
        // Description  = Este metodo resta dos números  

        System.out.println("Resta de dos números");
        Scanner Keyboard2 = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer número: ");
            int num1 = Keyboard2.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = Keyboard2.nextInt();
            int resta = num1 - num2;
            System.out.println("La resta de los números es " + resta);
        } catch (Exception e) {
            System.err.println("Aborted system error: " + e.toString());
        }

    }

    public static void multiplicar_dos_numeros() {
        // Description  = Este metodo multiplica dos números  

        System.out.println("Multiplicación de dos números");
        Scanner Keyboard2 = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer número: ");
            int num1 = Keyboard2.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = Keyboard2.nextInt();
            int mult = num1 * num2;
            System.out.println("La multiplicación de los números es " + mult);
        } catch (Exception e) {
            System.err.println("Aborted system error: " + e.toString());
        }

    }

    public static void dividir_dos_numeros() {
        // Description  = Este metodo divide dos números  

        System.out.println("División de dos números");
        Scanner Keyboard2 = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer número: ");
            int num1 = Keyboard2.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = Keyboard2.nextInt();
            if (num2 == 0) {
                System.err.println("No es posible dividir por cero, ingrese un"
                        + "número divisor diferente a cero ");
            } else {
                int divi = num1 / num2;
                System.out.println("La división de los números es " + divi);
            }
        } catch (Exception e) {
            System.err.println("Aborted system error: " + e.toString());
        }

    }

}
