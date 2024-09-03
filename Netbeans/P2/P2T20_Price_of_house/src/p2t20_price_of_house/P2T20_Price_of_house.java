/*
 * Author:       Brian Rodriguez
 * Date:         October 31 2019
 * Description:  Software that calculates the price of a house
 */
package p2t20_price_of_house;
import java.util.Scanner;

public class P2T20_Price_of_house {

    
    public static void main(String[] args) {
        try {
            Watch_menu();
            Input_Price();
        } catch (Exception e) {
            System.err.println("Aborted System:( public static void main"
                    + "(String[] args))");
        }
       
    }
    public static void Watch_menu() {
        //
        try {
            System.out.println("======MENU======\n"
                    + "Program made for calculate the price of a house\n"
                    + "-----Made by Brian Rodriduez-----");
            
        } catch (Exception e) {
             System.err.println("Aborted System:( public static void "
                     + "Watch_menu())");
        }
        
    }
    public static int[] Input_Price() {
        //
        try {
            Scanner Keyboard= new Scanner(System.in);
            int vector[]= new int[10];
            for(int i=0;i<10;i++){
                System.out.println("Input the price for the house "+(i+1));
                vector[i]= Keyboard.nextInt();
                while(vector[i]<10000||vector[i]>23000){
                    System.err.println("Error, the price is not correct,must be "
                            + "between 1000 and 23000 "
                            + "Input the price for the house "+(i+1));
                    vector[i]=Keyboard.nextInt();
                    
                }
                
            }
            return vector;
            
        } catch (Exception e) {
             System.err.println("Aborted System:( public static void "
                     + "Input_Price())");
             return null;
             
        }
        
    }
    
}
