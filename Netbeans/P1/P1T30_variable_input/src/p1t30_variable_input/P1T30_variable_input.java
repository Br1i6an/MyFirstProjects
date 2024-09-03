/*
 * Author       = Brian Rodriguez Rodriguez    
 * Date         = 2019 September 9
 * Description  = input a variable and after to print this
 */
package p1t30_variable_input;

import java.util.Scanner;

public class P1T30_variable_input {

    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Ingrese el nombre: ");
    String nombre = teclado.nextLine();
    System.out.println("El nombre es "+ nombre);
    }
    
}
