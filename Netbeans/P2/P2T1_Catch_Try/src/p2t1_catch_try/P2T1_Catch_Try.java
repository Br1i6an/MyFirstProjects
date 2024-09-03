/*
 * Author       = Brian Rodriguez
 * Date         = September 30 2019
 * Description  = Use Try and Catch
 */
package p2t1_catch_try;

import java.util.Scanner;

public class P2T1_Catch_Try {

    public static void main(String[] args) {
        try {
            Scanner Keyboard = new Scanner(System.in);
            float numero= Keyboard.nextFloat();

        } catch (Exception e) {
            System.err.println("La aplicacion se cerro por error en ejecucion: " + e.toString());

        }

    }
}
