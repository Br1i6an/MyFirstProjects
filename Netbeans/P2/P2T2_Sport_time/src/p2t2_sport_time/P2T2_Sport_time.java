/*
 * Author       = Brian Rodriguez
 * Date         = September 30 2019
 * Description  = Software that calculates the total laps of a training session 
 */
package p2t2_sport_time;

import java.util.Scanner;

public class P2T2_Sport_time {

    public static void main(String[] args) {
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("Software that records the times of ech lap of "
                    + "training and determines the best lap,"
                    + " the average and the number of laps per training, imput 1"
                    + " if you want to start or 0 if you want to finish ");
            int option = Keyboard.nextInt();
            double max = 0;
            double min = 0;
            double laps = 0;
            double suma = 0;

            while (option == 1) {
                System.out.println("Input the time of lap: ");
                double time = Keyboard.nextDouble();
                laps += 1;
                suma += time;
                if (laps == 1) {
                    max = time;
                    min = time;
                } else {
                    if (time > max) {
                        max = time;

                    }
                    if (time < min) {
                        min = time;
                    }

                }
                System.out.println("Input 1 if you want to continue or 0 if you "
                        + "want to finish: ");
                option = Keyboard.nextInt();
            }
            double average = suma / laps;
            System.out.println("The best time is " + min + " and the worst time "
                    + "is " + max + " and the average is " + average);

        } catch (Exception e) {
            System.err.println("Abort system, error: " + e.toString());
        }

    }

}
