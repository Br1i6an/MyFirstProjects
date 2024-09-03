/*
 * Author      = Brian Rodriguez
 * Date        = November 7 2019
 * Description = Program to show the route of a bus
 */
package p2t24_route_of_a_bus;

import java.util.Scanner;

public class P2T24_Route_of_a_bus {

    public static void main(String[] args) {
        //
        try {
            
        } catch (Exception e) {
            System.err.println("Aborted system error:( public static void main"
                    + "(String[] args))"+e.toString());
        }

    }
    public static void Show_menu() {
        try {
            System.out.println("========MENU========\n"
                    + "Program that calculates the prices of a route of a bus\n"
                    + "Select a option:\n"
                    + "(1)Bogotá\n"
                    + "(2)Medellín\n"
                    + "(3)Cali\n"
                    + "(4)Cartagena\n"
                    + "--------Created by Brian Rodriguez--------");
        } catch (Exception e) {
             System.err.println("Aborted system error:( public static void Show"
                     + "_menu())"+e.toString());
        }
        
    }
    public static int[][][] Generate_price_and_route() {
        //
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("How many combinations do you need?: ");
            int N = Keyboard.nextInt();
            int [][][] vector = new int [N][N][N];
            for(int i =0;i<N;i++){
                vector[1][0][0]=(int)Math.random()*4;
                vector[1][0][1]=(int)Math.random()*4;
                while(vector[i][0][0]==vector [i][0][1]){
                    vector[1][0][1]=(int)Math.random()*4;
                    
                }
                vector[1][0][2]=(int)Math.random()*100000;
                
            }
            return vector;
            
        } catch (Exception e) {
             System.err.println(" public static int[][][] Generate_price_and_"
                     + "route())"+e.toString());
             return null;
        }
        
    }
    public static void Watch_menu(int[][][] Routes) {
        try {
            
        } catch (Exception e) {
             System.err.println("(public static void Watch_menu(int[][][] Routes"
                     + "))"+e.toString());
        }
        
    }

}
