/*
 * Author       = Brian Rodriguez
 * Date         = September 18 2019
 * Description  = This program is for calculate the average salary, total salary and highest salary of N employees
 */
package p1t49_salary_of_many_employee;

import java.util.Scanner;

public class P1T49_Salary_of_many_employee {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular el salario promedio, salario total y el salario más alto de N empleados, ingrese el número de empleados: ");
        int N = teclado.nextInt();
        int salariomax = 0;
        int sumadesalarios = 0;

        for (int i = 1; i <= N; i += 1) {
            System.out.println("Ingrese el sueldo para el empleado " + i);
            int sueldo = teclado.nextInt();
            System.out.println("Ingrese el número de días trabajado por el empleado " + i);
            int days = teclado.nextInt();
            int salario = (sueldo / 30) * days;

            sumadesalarios = sumadesalarios + salario;
            if (i == 1) {
                salariomax = salario;
            } else if (salariomax < salario) {
                salariomax = salario;
            }
        }
        double promedio = sumadesalarios/N;
        System.out.println("La suma de los salarios es: $"+sumadesalarios+" y el salario maximo es: $"+salariomax+" y el promedio es: $"+promedio);
    }

}
