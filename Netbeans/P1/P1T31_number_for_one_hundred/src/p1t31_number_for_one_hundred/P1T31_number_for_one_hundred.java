/*
 * Author      = Brian Rodriguez
 * Date        = 2019 September 9
 * Description = Enter a number an multiply for 100
 */
package p1t31_number_for_one_hundred;
import java.util.Scanner;

public class P1T31_number_for_one_hundred {
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el número: ");
        int numero = teclado.nextInt();
        int total = numero * 100;
        System.out.println("El resultado de multiplicar el número por 100 es : "+ total);
        
   
    }
    
}
