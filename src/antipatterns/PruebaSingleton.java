/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antipatterns;

/**
 *
 * @author educacionit
 */
public class PruebaSingleton {
    public static void main(String ...params) {
        Singleton.getInstane().valor = 10;
        Singleton.getInstane().valor = 14;
        System.out.println(Singleton.getInstane().valor);
    }
}
