/*
 * Author       Brian Rodriguez Rodriguez
 * Date         September 19 2019
 * Description  Market of the month
 */
package p1t53_market_of_the_month;

import java.util.Scanner;

public class P1T53_Market_of_the_month {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("This program allows to input the price of a product as long as totally be lower than $500000, \n input the price of the product: ");
        int price = Keyboard.nextInt();
        int total = price;
        while (total <= 500000) {
            System.out.println("Input the price of the product: ");
            price = Keyboard.nextInt();
            total = total + price;

        }
        if (total > 500000) {
            total = total - price;

        }
        System.out.println("The total value is: $" + total);
    }
}
