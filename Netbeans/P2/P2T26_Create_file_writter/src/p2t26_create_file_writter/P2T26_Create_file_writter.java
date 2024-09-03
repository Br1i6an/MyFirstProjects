/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2t26_create_file_writter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class P2T26_Create_file_writter {

    
    public static void main(String[] args) {
        try {
            String ruta= "d:/probando.txt";
            String contenido="Contenido de ejemplo JAVA";
            
            BufferedWriter bw;
            File archivo= new File(ruta);
            if (!archivo.exists()){
                bw=new BufferedWriter(new FileWriter(archivo));
                bw.write(contenido);                                
            }else {
                bw=new BufferedWriter(new FileWriter(archivo));
                bw.write(contenido);
                
            }
            bw.close();
            
        } catch (Exception e) {
        }
       
    }
    
}
