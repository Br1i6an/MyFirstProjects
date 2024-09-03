/*
 * Author       = Brian Rodriguez
 * Date         = October 01 2019
 * Description  = Uso de métodos
 */
package p2t4_metodos;

import java.util.Scanner;

public class P2T4_Metodos {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Welcome to this program taht use functions or procedures");
        try {

        } catch (Exception e) {
            System.err.println("Aborted system error: " + e.toString());
        }

    }

    public static void metodo_prueba() {
        // Description  = Este método es solo para pruebas 
        System.out.println("Este es un método de prueba ");

        Scanner Keyboard2 = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer número: ");
            int num1 = Keyboard2.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = Keyboard2.nextInt();
            int suma = num1 + num2;
            System.out.println("La suma es: " + suma);
        } catch (Exception e) {
            System.err.println("Aborted system error: " + e.toString());
        }

    }

}
