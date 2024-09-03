/*
 * Author       = Brian Rodriguez 
 * Date         = October 3 2019
 * Description  = Software for determinate the risks of the place 
 */
package p2t8_risks;

import java.util.Scanner;

public class P2T8_Risks {
    
    public static void main(String[] args) {
        try {
            int menu_places = place_menu();
            int menu_gender = gender_menu();
            if (menu_places == 1) {
                System.out.println(Antioquia(menu_gender));
            }else if(menu_places == 2){
                System.out.println(Boyacá(menu_gender));
            }else if(menu_places == 3){
                System.out.println(Chocó(menu_gender));
            }else if (menu_places == 4){
                System.out.println(Valle(menu_gender));
            }else{
                System.err.println("The chosen option doesn't exist");                                                               
            }
        } catch (Exception e) {
        }
        
    }
    
    public static int gender_menu() {
        //Description:Method made for display the menu for the gender
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("--------------------------------"
                    + "\n GENDER MENU. \n Select a option: "
                    + "\n(1)Male "
                    + "\n(2)Female "
                    + "\n(3)LGTBI "
                    + "\n(0)To exit ");
            int option = Keyboard.nextInt();
            return option;
            
        } catch (Exception e) {
            System.err.println("Aborted program (public static int gender_menu),"
                    + " error: " + e.toString());
            return 0;
        }
    }
    
    public static int place_menu() {
        //Description:Method made for display the menu for the town
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("--------------------------------"
                    + "\n PLACE MENU. \n Select a option: "
                    + "\n(1)Antioquia "
                    + "\n(2)Boyacá "
                    + "\n(3)Chocó "
                    + "\n(4)Valle ");
            
            int option = Keyboard.nextInt();
            return option;
            
        } catch (Exception e) {
            System.err.println("Aborted program (public static int place_menu),"
                    + " error: " + e.toString());
            return 0;
            
        }
    }
    
    public static String Antioquia(int gender) {
        try {
            String risk = "";
            if (gender == 1) {
                risk = "Antioquia: Be sexually abused by Antioquia ";
            } else if (gender == 2) {
                risk = "Antioquia: Fall in love with Tarzán ";
            } else if (gender == 3) {
                risk = "Antioquia: Be capturted by butterflies ";
                
            }
            return risk;
            
        } catch (Exception e) {
            System.err.println("Aborted program: Antioquia error: "
                    + " error: " + e.toString());
            return "Error";
        }
    }

    public static String Boyacá(int gender) {
        try {
            String risk = "";
            if (gender == 1) {
                risk = "Boyacá: ";
            } else if (gender == 2) {
                risk = "Boyacá: ";
            } else if (gender == 3) {
                risk = "Boyacá: ";
                
            }
            return risk;
            
        } catch (Exception e) {
            System.err.println("Aborted program: Boyacá error: "
                    + " error: " + e.toString());
            return "Error";
        }
    }

    public static String Chocó(int gender) {
        try {
            String risk = "";
            if (gender == 1) {
                risk = "Chocó: You'll not be able to sit in a month ";
            } else if (gender == 2) {
                risk = "Chocó: Marry the whatsapp nigga ";
            } else if (gender == 3) {
                risk = "Chocó: Dance the cheke-choko song ";
                
            }
            return risk;
            
        } catch (Exception e) {
            System.err.println("Aborted program: Chocó error: "
                    + " error: " + e.toString());
            return "Error";
        }
    }

    public static String Valle(int gender) {
        try {
            String risk = "";
            if (gender == 1) {
                risk = "Valle: ";
            } else if (gender == 2) {
                risk = "Valle: ";
            } else if (gender == 3) {
                risk = "Valle: ";
                
            }
            return risk;
            
        } catch (Exception e) {
            System.err.println("Aborted program: Valle error: "
                    + " error: " + e.toString());
            return "Error";
        }
    }
}
