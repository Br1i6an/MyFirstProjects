/*
 * Author       = Brian Rodriguez 
 * Date         = October 15 2019
 * Description  = Software for determinate how much alcohol can a person drink
 */
package p2t9_age_sex_and_weight_of_a_person;

import java.util.Scanner;

public class P2T9_Age_sex_and_weight_of_a_person {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        try {
            int N = Main_Menu();
            double Suma_litros = 0;
            double Minimo_litros = 0;
            for (int i = 1; i <= N; i = i + 1) {
                System.out.println("Input the age of the people: " + i);
                int age = Keyboard.nextInt();
                System.out.println("Input the sex for the person , input (1) if the person is a woman or (2) if the person is a man: " + i);
                int sex = Keyboard.nextInt();
                System.out.println("Input the weight for the person " + i);
                double weight = Keyboard.nextDouble();
                double litros = Calculate_alcohol(age, sex, weight);
                Suma_litros += litros;
                if (i == 1) {
                    Minimo_litros = litros;
                } else if (Minimo_litros > litros) {
                    Minimo_litros = litros;

                }

            }
            double Average = Suma_litros / N;
            System.out.println("The number of the people is " + N + " ,the average for the liters drunk is " + Average + " and the minimum of liters is " + Minimo_litros);

        } catch (Exception e) {
            System.err.println("Error.Aborted system: " + e.toString());
        }

    }

    public static int Main_Menu() {
        //This function is the principal menu in this program
        Scanner Keyboard = new Scanner(System.in);
        try {
            System.out.println("Input the number of persons: ");
            int N = Keyboard.nextInt();
            return N;

        } catch (Exception e) {
            System.err.println("Error.Aborted system Main_Menu():" + e.toString());
            return 0;
        }

    }

    public static double Calculate_alcohol(int age, int sex, double weight) {
        //Function made for input age, sex, and weight of the people
        try {
            double value = 0;
            if (age < 18) {
                System.err.println("The person must not drink alcohol ");
                value= 0;
            } else {
                if (sex == 1 && age >= 18 && age < 35 && weight < 45) {
                    value= 0;

                } else if (sex == 1 && age > 18 && age < 35 && weight > 45) {
                    value =1;

                } else if (sex == 2 && age > 35) {
                    value =2;

                }else if(sex == 2 && age > 18 && age < 35 && weight > 45){
                    
                }

            }

        } catch (Exception e) {
            System.err.println("Error. Aborted system Calculate_alcohol():" + e.toString());
        }
    }

}
