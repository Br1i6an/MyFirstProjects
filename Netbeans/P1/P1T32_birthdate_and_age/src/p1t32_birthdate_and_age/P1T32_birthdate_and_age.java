/*
 * Author      = Brian Rodriguez
 * Date        = 2019 September 9
 * Description = Enter a birthdate and show the age of a person 
 */
package p1t32_birthdate_and_age;
import java.util.Scanner;

public class P1T32_birthdate_and_age {

   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el año de nacimiento: ");
        int year = teclado.nextInt();
        int age = 2019 - year;
        System.out.println("La persona tiene "+ age + " años de edad " );
    }
    
}
