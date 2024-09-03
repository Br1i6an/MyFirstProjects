/*
 * Author       Brian Rodriguez Rodriguez
 * Date         September 19 2019
 * Description  while input number upper 100
 */
package p1t52_lower_than_100;

import java.util.Scanner;

public class P1T52_Lower_than_100 {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Input number while upper 100, input a number: ");
        int number = Keyboard.nextInt();
        int sumatory = 0;
        int count =1;
        while (number >= 100) {
            sumatory=sumatory+number;
            System.out.println("Input a number: ");
            number = Keyboard.nextInt();
            count=count+1;
        }
        double average = sumatory/count;
        System.out.println("The sumatory is: "+sumatory+" and the average is: "+average);
    }

}
