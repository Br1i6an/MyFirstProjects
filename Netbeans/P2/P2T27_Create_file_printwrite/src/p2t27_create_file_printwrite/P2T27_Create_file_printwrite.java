/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2t27_create_file_printwrite;

import java.io.PrintWriter;

public class P2T27_Create_file_printwrite {

   
    public static void main(String[] args) {
        try {
            
            PrintWriter archivo=new PrintWriter("d:/nuevoarchivo.txt","UTF-8");
            archivo.println("Primera línea");
            archivo.println("Segunda línea");
            archivo.close();
            
        } catch (Exception e) {
        }
       
    }
    
}
