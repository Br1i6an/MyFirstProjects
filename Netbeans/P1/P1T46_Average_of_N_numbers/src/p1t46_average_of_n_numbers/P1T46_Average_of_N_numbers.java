/*
 * Author       = Brian Rodriguez Rodriguez
 * Date         = September 17 2019
 * Description  = Average of N numbers
 */
package p1t46_average_of_n_numbers;

import java.util.Scanner;

public class P1T46_Average_of_N_numbers {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Input the number: ");
        int N = teclado.nextInt();
        int suma = 0;
        for (int i=1; i<=N;i=i+1){
            System.out.println("Input the number: ");
            int valor = teclado.nextInt();
            suma=suma+valor;
        }
float promedio = suma/N;
        System.out.println("The sumatory total is: "+ suma+ " and the average is: "+promedio);
    }
    }
    

