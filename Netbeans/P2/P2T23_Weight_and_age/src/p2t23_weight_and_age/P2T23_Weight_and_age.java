/*
 * Author      = Brian Rodriguez
 * Date        = November 7 2019
 * Description = 
 */
package p2t23_weight_and_age;

import java.util.Scanner;

public class P2T23_Weight_and_age {
    
    public static void main(String[] args) {
        //
        try {
            Show_menu();
            double[][] persons = Generate_vector_weight_and_age();
            Show_values(persons);
            Show_max_min_average_kids(persons);
            
        } catch (Exception e) {
            System.err.println("Aborted system error:(public static void "
                    + "main(String[] args))" + e.toString());
        }
    }
    
    public static void Show_menu() {
        //This function shows the menu
        try {
            System.out.println("======MENU======\n"
                    + "Program that calculates the age and weight of many people"
                    + "\n------Made by Brian Rodriguez------");
            
        } catch (Exception e) {
            System.err.println("Aborted system error:"
                    + "(public static void Show_menu())" + e.toString());
        }
        
    }
    
    public static double[][] Generate_vector_weight_and_age() {
        //
        Scanner Keyboard = new Scanner(System.in);
        try {
            System.out.println("How many people do you need in this software?");
            int N = Keyboard.nextInt();
            double[][] vector = new double[N][N];
            for (int i = 0; i < N; i++) {
                vector[i][0] = Math.round(Math.random() * 99);
                if (vector[i][0] <= 5) {
                    vector[i][1] = Math.round(Math.random() * 20);
                } else if (vector[i][0] <= 10) {
                    vector[i][1] = Math.round(Math.random() * 40);
                } else if (vector[i][0] > 10) {
                    vector[i][1] = Math.round(Math.random() * 100);
                }
                
            }
            return vector;
            
        } catch (Exception e) {
            System.err.println("Aborted system error:"
                    + "(public static double[][] "
                    + "Generate_vector_weight_and_age())" + e.toString());
            return null;
        }
        
    }
    
    public static void Show_values(double[][] persons) {
        //This function shows the values wich generate
        try {
            System.out.println("Next to how the values generated");
            for (int i = 0; i < persons.length; i++) {
                System.out.println("The age for the person " + (i + 1) + " is "
                        + persons[i][0] + " and weight is " + persons[i][1]
                        + " Kg ");
                
            }
            
        } catch (Exception e) {
            System.err.println("Aborted system error:"
                    + "(public static void  Show_values(double[][] persons))"
                    + e.toString());
        }
        
    }
    
    public static void Show_max_min_average_kids(double[][] persons) {
        //
        try {
            double max = 0;
            double min = 0;
            double sum = 0;
            int count = 0;
            for (int i = 0; i < persons.length; i++) {                
                if (persons[i][0] <= 5) {
                    if (count == 0) {
                        min = persons[i][1];
                        max = persons[i][1];
                    } else if (min > persons[i][1]) {
                        min = persons[i][1];
                    } else if (max < persons[i][1]) {
                        max = persons[i][1];
                    }
                    sum += persons[i][1];                    
                    count += 1;
                }
            }
            double average = sum / count;
            System.out.println("The skinniest kid is " + min + ", the thickest kid"
                    + " is " + max + " and the average of ages is " + average);
        } catch (Exception e) {
            System.err.println("Aborted system error:"
                    + "(public static void Show_max_min_average_kids(double[][]"
                    + " persons))" + e.toString());
        }
        
    }
    public static void Show_max_min_average_youngs(double[][] persons) {
        //
        try {
            double max = 0;
            double min = 0;
            double sum = 0;
            int count = 0;
            for (int i = 0; i < persons.length; i++) {                
                if (persons[i][0] <18&& persons[1][0]>10) {
                    if (count == 0) {
                        min = persons[i][1];
                        max = persons[i][1];
                    } else if (min > persons[i][1]) {
                        min = persons[i][1];
                    } else if (max < persons[i][1]) {
                        max = persons[i][1];
                    }
                    sum += persons[i][1];                    
                    count += 1;
                }
            }
            double average = sum / count;
            System.out.println("The skinniest young is " + min + ", the thickest"
                    + " young"+ " is " + max + " and the average of ages is " 
                    + average);
        } catch (Exception e) {
            System.err.println("Aborted system error:"
                    + "(public static void Show_max_min_average_youngs(double[][]"
                    + " persons))" + e.toString());
        }
        
    }
    public static void Show_max_min_average_adults(double[][] persons) {
        //
        try {
            double max = 0;
            double min = 0;
            double sum = 0;
            int count = 0;
            for (int i = 0; i < persons.length; i++) {                
                if (persons[i][0] >=18) {
                    if (count == 0) {
                        min = persons[i][1];
                        max = persons[i][1];
                    } else if (min > persons[i][1]) {
                        min = persons[i][1];
                    } else if (max < persons[i][1]) {
                        max = persons[i][1];
                    }
                    sum += persons[i][1];                    
                    count += 1;
                }
            }
            double average = sum / count;
            System.out.println("The skinniest adult is " + min + ", the thickest"
                    + " adult"+ " is " + max + " and the average of ages is " 
                    + average);
        } catch (Exception e) {
            System.err.println("Aborted system error:"
                    + "(public static void Show_max_min_average_adults(double[][]"
                    + " persons))" + e.toString());
        }
        
    }
    
}
