/*
 * Author       = Brian Rodriguez Rodriguez
 * Date         = September 16 2019
 * Description  = This program calculates the volume of a cylinder 
 */
package p1t40_volumen_of_cylinder;

import java.util.Scanner;

public class P1T40_Volumen_of_cylinder {

    public static void main(String[] args) {
        System.out.println("This program calculates the volume of a cylinder, please input the value for the radius ");
        Scanner teclado = new Scanner(System.in);
        double radius = teclado.nextDouble();
        System.out.println("Please input the value for the height ");
        double height = teclado.nextDouble();
        double volume = Math.PI* (Math.pow(radius,2))*height;
        System.out.println("The volume of the cylinder is: "+ volume);

    }

}
