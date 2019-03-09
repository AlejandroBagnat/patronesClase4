/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.io.FileNotFoundException;

/**
 *
 * @author educacionit
 */
public class Init {
    public static void main(String ...params) throws Exception {
        java.io.Reader lector = 
                new java.io.FileReader("c:\\clase4\\ejemplo.txt");
        
        // Este es el decorator
        java.io.BufferedReader lectorXLinea = new java.io.BufferedReader(lector);
        
        System.out.println((char)lectorXLinea.read());
        System.out.println((char)lectorXLinea.read());
        System.out.println((char)lectorXLinea.read());
        
        
        
        for (String s = lectorXLinea.readLine(); s != null; s = lectorXLinea.readLine()) {
            System.out.println(s);
        }
        
        lector.close();
                
                
   }
}
