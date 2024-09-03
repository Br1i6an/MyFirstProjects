/*
 * Author     = Brian Rodriguez Rodriguez
 * Date       = September 18 2019
 * Directory  = This program is for calculate the gross value and the total value for N products
 */
package p1t48_product_invoice_n;

import java.util.Scanner;

public class P1T48_Product_invoice_N {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos: ");
        int n = teclado.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i = i+1) {
            System.out.println("Ingrese le valor del producto " + i);
            int prod = teclado.nextInt();
            suma = suma + prod;

        }
        double IVA = suma * 0.19;
        double Total = suma + IVA;
        System.out.println("El valor total de la factura es: $"+Total+" y el valor del IVA es: $"+IVA);
    }

}
