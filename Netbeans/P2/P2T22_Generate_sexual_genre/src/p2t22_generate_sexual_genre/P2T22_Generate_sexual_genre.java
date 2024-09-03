/*
 * Author:       Brian Rodriguez
 * Date:         November 6 2019
 * Description:  Software that shows the genre of many people
 */
package p2t22_generate_sexual_genre;

import java.util.Scanner;

public class P2T22_Generate_sexual_genre {

  
    public static void main(String[] args) {
        try {
            Watch_menu();
            String[]people=Generate_genre();
            Count_persons_men(people);
            Count_persons_Women(people);
            Count_persons_LGTBI(people);
            List_genre(people);
            
            
        } catch (Exception e) {
            System.err.println("Aborted system, error:(public static void main"
                    + "(String[] args))"+e.toString());
        }
      
    }
    public static void Watch_menu() {
        //
        try {
            
        } catch (Exception e) {
            System.err.println("Aborted system, error:(public static void "
                    + "Watch_menu())"+e.toString());
        }
        
    }
    public static String []Generate_genre() {
        //
        try {
            Scanner Keyboard= new Scanner(System.in);
            System.out.println("How many people do yuo need?");
            int N =Keyboard.nextInt();
            String[]vector= new String[N];
            for(int i=0;i< N;i++){
                double genre=Math.round(Math.random()*6);
                if(genre==0){
                    vector[i]="M";                    
                }else if(genre==1){
                    vector[i]="F";                    
                }else if(genre==2){
                    vector[i]="L";                    
                }else if(genre==3){
                    vector[i]="G";                    
                }else if(genre==4){
                    vector[i]="B";                    
                }else if(genre==5){
                    vector[i]="T";                    
                }else if(genre==6){
                    vector[i]="I";                    
                }
                
            }
            return vector;
            
        } catch (Exception e) {
            System.err.println("Aborted system, error:(public static void "
                    + "Generate_genre())"+e.toString());
            return null;
        }
        
    }
    public static void Count_persons_men(String[] persons) {
        //
        try {
            int total=0;
            for(int i =0;i<persons.length;i++){
                if(persons[i]=="M"){
                    total+=1;
                    
                }
                
            }
            
        } catch (Exception e) {
            System.err.println("Aborted system, error:(public static void "
                    + "Count_persons_men(String[] persons))"+e.toString());
        }
        
    }
     public static void Count_persons_Women(String[] persons) {
        //
        try {
            int total=0;
            for(int i =0;i<persons.length;i++){
                if(persons[i]=="F"){
                    total+=1;
                    
                }
                
            }
            
        } catch (Exception e) {
            System.err.println("Aborted system, error:(public static void "
                    + "Count_persons_Women(String[] persons))"+e.toString());
        }
        
    }
     public static void Count_persons_LGTBI(String[] persons) {
        //
        try {
            int total=0;
            for(int i =0;i<persons.length;i++){
                if(persons[i]=="M"&&persons[i]=="F"){
                    total+=1;
                    
                }
                
            }
            System.out.println("The total of LGTBI is "+total);
            
        } catch (Exception e) {
            System.err.println("Aborted system, error:(public static void "
                    + "Count_persons_Women(String[] persons))"+e.toString());
        }
        
    }
     public static void List_genre(String[] persons) {
        //
        try {
            for(int i =0;i<persons.length;i++){
                System.out.println("The genre of the person "+(i+1)+"="
                        +persons[i]);
                
            }                       
        } catch (Exception e) {
            System.err.println("Aborted system, error:(public static void "
                    + "Count_persons_Women(String[] persons))"+e.toString());
        }
        
    }

}
