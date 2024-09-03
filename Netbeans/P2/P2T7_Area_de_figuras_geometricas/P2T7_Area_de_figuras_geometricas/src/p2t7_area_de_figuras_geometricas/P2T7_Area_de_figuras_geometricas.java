/*
 * Author       = Brian Rodrguez    
 * Date         = October 02 2019
 * Description  = Program made for calculate the geometric area of figures.
 */
package p2t7_area_de_figuras_geometricas;

import java.util.Scanner;

public class P2T7_Area_de_figuras_geometricas {

    public static void main(String[] args) {
        try {
            int menu = menu();
            while (menu != 0) {
                if (menu == 1) {
                    area_triangle();
                } else if (menu == 2) {
                    area_circle();
                } else if (menu == 3) {
                    area_square();
                } else if (menu == 4) {
                    area_cylinder();
                } else if (menu == 5) {
                    area_cube();
                } else if (menu == 0) {
                    System.err.println("Incorrect option:");

                }
                menu = menu();
            }

        } catch (Exception e) {
            System.err.println("Aborted program (public static void main),"
                    + " error: " + e.toString());
        }

    }

    public static int menu() {
        //Description:Method made for display the menu
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("-------------------------------"
                    + "\n MENU. \nSelect a option. "
                    + "\n(1)Calculate the area of a triangle. "
                    + "\n(2)Calculate the area of a square. "
                    + "\n(3)Calculate the area of a circle. "
                    + "\n(4)Calculate the area of a cylinder."
                    + "\n(5)Calculate the area of a cube."
                    + "\n(0)To exit");
            int option = Keyboard.nextInt();
            return option;
            //(Return option)Hace y devuelve .

        } catch (Exception e) {
            System.err.println("Aborted program (public static int menu),"
                    + " error: " + e.toString());
            return 0;
        }

    }

    public static void area_triangle() {
        //Description: This program calculates the areaa of a triangle 
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("Calculate the area of a triangle. ");
            System.out.println("Input the value for the base of the triangle: ");
            double base = Keyboard.nextDouble();
            System.out.println("Input the value of the height for the triangle: ");
            double h = Keyboard.nextDouble();
            double Area = (base * h) / 2;
            System.out.println("The area of the triangle is " + Area);

        } catch (Exception e) {
            System.err.println("Aborted program (public static void area_triangle),"
                    + " error: " + e.toString());
        }

    }

    public static void area_circle() {
        //Description: This program calculates the areaa of a circle 
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("Calculate the area of a circle. ");
            System.out.println("Input the value for the radius of the circle: ");
            double rad = Keyboard.nextDouble();
            double Area = (3.141592 * rad * rad);
            System.out.println("The area of the circle is " + Area);

        } catch (Exception e) {
            System.err.println("Aborted program (public static void area_circle),"
                    + " error: " + e.toString());
        }

    }

    public static void area_square() {
        //Description: This program calculates the areaa of a square 
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("Calculate the area of a square. ");
            System.out.println("Input the value of the side : ");
            double side = Keyboard.nextDouble();
            double Area = side * side;
            System.out.println("The area of the square is " + Area);

        } catch (Exception e) {
            System.err.println("Aborted program (public static void area_square),"
                    + " error: " + e.toString());
        }

    }

    public static void area_cylinder() {
        //Description: This program calculates the areaa of a cylinder 
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("Calculate the area of a cylinder. ");
            System.out.println("Input the value for the radius of the cylinder: ");
            double radius = Keyboard.nextDouble();
            System.out.println("Input the value for the height of the cylinder: ");
            double heght = Keyboard.nextDouble();
            double Area = (2 * 3.141516 * radius * (radius + heght));
            System.out.println("The area of the cylinder is " + Area);

        } catch (Exception e) {
            System.err.println("Aborted program (public static void area_cylinder),"
                    + " error: " + e.toString());
        }

    }

    public static void area_cube() {
        //Description: This program calculates the areaa of a cube 
        try {
            Scanner Keyboard = new Scanner(System.in);
            System.out.println("Calculate the area of a cube. ");
            System.out.println("Input the value of the side : ");
            double side = Keyboard.nextDouble();
            double Area = 6 * side * side;
            System.out.println("The area of the cube is " + Area);

        } catch (Exception e) {
            System.err.println("Aborted program (public static void area_cube),"
                    + " error: " + e.toString());
        }

    }

}
