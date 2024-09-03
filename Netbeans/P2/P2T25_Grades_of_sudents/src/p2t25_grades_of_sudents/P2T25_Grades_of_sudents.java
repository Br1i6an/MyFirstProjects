/*
 * Author      = Brian Rodriguez
 * Date        = November 7 2019
 * Description = Program to show the grades of a group of students
 */
package p2t25_grades_of_sudents;

import java.util.Scanner;

public class P2T25_Grades_of_sudents {

    public static void main(String[] args) {
        try {
            Show_menu();
            double[] grades=Generate_grades();
            Watch_grades(grades);
            Show_student_approved(grades);
            Show_the_best_grades(grades);

        } catch (Exception e) {
            System.err.println("Aborted System,error:(public static void "
                    + "main(String[] args))" + e.toString());
        }

    }

    public static void Show_menu() {
        try {
            System.out.println("Program to show the grades of a group of "
                    + "students\n"
                    + "========MENU========\n"
                    + "------Created by Brian Rodriguez------");

        } catch (Exception e) {
            System.err.println("Aborted System,error:(public static void "
                    + "Show_menu())" + e.toString());
        }

    }

    public static double[] Generate_grades() {
        //
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("Input the number of students: ");
            int N = Keyboard.nextInt();
            double[] vector = new double[N];
            for (int i = 0; i < N; i++) {
                vector[i] = Math.round(Math.random()*500);
                vector[i] = vector[i]/10;

            }
            return vector;

        } catch (Exception e) {
            System.err.println("Aborted System,error:(public static double"
                    + " []Generate_grades())" + e.toString());
            return null;
        }

    }

    public static void Watch_grades(double[] grades) {
        //
        try {
            for (int i = 0; i < grades.length; i++) {
                System.out.println("The grade of the student " + (i + 1) + " is "
                        + grades[i]);

            }

        } catch (Exception e) {
            System.err.println("Aborted System,error:(public static void "
                    + "Watch_grades(double[] grades))" + e.toString());
        }

    }

    public static void Show_student_approved(double[] grades) {
        //
        try {
            int Totalapproved=0;
             int Totaldisapproved=0;
            for(int i=0; i<grades.length;i++){
                if(grades[i]>=3){
                    Totalapproved+=1;                   
                }else{
                    Totaldisapproved=1; 
                   
                }
                
            }
            System.out.println("The students approved are "+Totalapproved+" "
                    + "and the students disapproved are "+Totaldisapproved);
            
        } catch (Exception e) {
            System.err.println("Aborted System,error:(public static void "
                    + "Show_student_approved(double[] grades))" + e.toString());
        }

    }
    public static void Show_the_best_grades(double [] grades) {
        try {
            for(int i=0;i<grades.length;i++){
                if(grades[i]>=4){
                    System.out.println("The student "+(i+1)+" is excellent");                    
                }else if(grades[i]<1){
                    System.out.println("The sutudent "+(i+1)+" is OTU");
                    
                }
                
            }
            
        } catch (Exception e) {
            System.err.println("Aborted System,error:(public static void "
                    + "Show_the_best_grades(double [] grades))" + e.toString());
        }
        
    }

}
