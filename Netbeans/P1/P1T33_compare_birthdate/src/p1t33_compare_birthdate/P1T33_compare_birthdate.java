/*
 * Author    = Brian Rodriguez 
 * Date      = 10 September 2019
 * Directory = This program compare two birthdates
 */
package p1t33_compare_birthdate;
//paso1: importar la librería 
import java.util.Scanner;

public class P1T33_compare_birthdate {

    
    public static void main(String[] args) {
        //paso2:una salida de inicio del programa 
        System.out.println("Programa para comparar años de nacimiento, ingrese el valor del 1° año: ");
        //paso3: crear una asociación/ objeto del teclado 
        Scanner teclado = new Scanner(System.in);
        //paso4: crear las variables 
        int year1= teclado.nextInt();
        System.out.println("Ingrese el valor del 2° año ");
        int year2= teclado.nextInt();
        int edad1= 2019-year1;
        int edad2= 2019-year2;
        //paso5: hacer condicionalidad
        if (edad1>edad2) {
            System.out.println("Es mayor  "+edad1+" que "+edad2);
        }else{
            System.out.println("Es mayor "+edad2+" que "+edad1);
        } 
        
        
    }
    
}
