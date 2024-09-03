/*
 * Author     Brian Rodriguez
 * Date       October 23 2019
 * Directory  Admin age of persons using arrays
 */
package p2t16_array_ages;

import java.util.Scanner;

public class P2T16_Array_ages {

    public static void main(String[] args) {
        try {
            Scanner Keyboard = new Scanner(System.in);
            int[] ages = new int [10];
            System.out.println("-----Admin of 10 ages of persons-----");
            for(int i=0;i<10;i++){
                System.out.println("Input age for the person "+(i+1));
                ages [i]=Keyboard.nextInt();
                
            }
            for (int i=0;i<10;i++){
                System.out.println("Age of person "+(i+1)+" is"+ages[i]);
                
            }
            
            Age_max(ages);
            
        } catch (Exception e) {
            System.err.println("Aborted system: (public static void main"
                    + "(String[] args))"+e.toString());
        }

    }
    public static void Age_max(int[] ages) {
        int agemax=0;
        int person=0;
        for(int i=0;i<10;i++){
            if(i==0){
                agemax=ages[i];                
            }else if (ages[i]>agemax){
                agemax=ages[i];
                person=1;
                
            }
            
        }
        System.out.println("The person with max age is "+(person+1)+" age "+agemax);
        
    }

}
