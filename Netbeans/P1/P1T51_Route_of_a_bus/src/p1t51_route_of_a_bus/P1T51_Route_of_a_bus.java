/*
 * Author       Brian Rodriguez Rodriguez
 * Date         September 19 2019
 * Description  This program is to print the routes of a bus
 */
package p1t51_route_of_a_bus;

import java.util.Scanner;

public class P1T51_Route_of_a_bus {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Program that simulates the route of a bus "
                + "\nPlease input the number of stops: ");
        int stops = Teclado.nextInt();
        int up = 0;
        int down = 0;
        int total = 0;

        for (int i = 1; i < stops; i = i + 1) {
            if (i < stops) {
                System.out.println("How many passengers get in on the stop: " + i);
                int passengersup = Teclado.nextInt();
                up = up + passengersup;
            } else {
                down = down + (up - down);

            }
            if (i > 1 && 1 < stops) {
                System.out.println("How many passengers get down on the stop: " + i);
                int passengersdown = Teclado.nextInt();
                down = down + passengersdown;
            }
            total = up - down;
            System.out.println("Stop: " + i + " passengers get in: " + up + " ,passengers get down: " + down);
        }
        total = up * 150;
        System.out.println("Passengers got in on the route are: " + up + " and the driver won: $" + total);
    }
}
