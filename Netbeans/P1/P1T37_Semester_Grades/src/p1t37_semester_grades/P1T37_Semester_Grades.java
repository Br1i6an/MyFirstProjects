/*
 * Author     = Brian Rodriguez Rodriguez
 * Date       = September 11 2019
 * Directory  = This program is made for calculate the average of a student 
 */
package p1t37_semester_grades;

import java.util.Scanner;

public class P1T37_Semester_Grades {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular la nota final del semestre de un estudiante, ingrese el valor de la 1° nota: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Ingrese el valor de la 2° nota: ");
        float nota2 = teclado.nextFloat();
        System.out.println("Ingrese el valor de la 3° nota: ");
        float nota3 = teclado.nextFloat();
        System.out.println("Ingrese el valor de la 4° nota: ");
        float nota4 = teclado.nextFloat();
        if (nota1>=0 && nota1<=5 && nota2>=0 && nota2<=5 && nota3>=0 && nota3<=5 && nota4>=0 && nota4<=5){
        double total = (nota1 * 0.20) + (nota2 * 0.25) + (nota3 * 0.25) + (nota4 * 0.30);
        System.out.println("La nota total del estudiante es: " + total);
    } else {
            System.out.println("Error, el valor de todas las notas debe estar entre el rango de 0.0 a 5.0 ");
            }
    }
        

}
