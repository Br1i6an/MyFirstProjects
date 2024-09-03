/*
 * Author      = Brian Rodriguez 
 * Date        = November 14 2019
 * Description = Program forread a file on pc
 */
package p2t30_read_files;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class P2T30_Read_files {

    public static void main(String[] args) {
        try {
            String ruta = "d:/Database_age.txt";
            String Lineatexto = "";
            File archivo = new File(ruta);
            if (archivo.exists()) {
                FileReader filereader = new FileReader(ruta);
                BufferedReader contenido = new BufferedReader(filereader);
                while ((Lineatexto = contenido.readLine()) != null) {
                    System.out.println(Lineatexto);

                }

            } else {
                System.err.println("The file doesn't exist: " + ruta);
            }

        } catch (Exception e) {
            System.err.println("Aborted system error:(public static void "
                    + "main(String[] args))" + e.toString());
        }

    }

}
