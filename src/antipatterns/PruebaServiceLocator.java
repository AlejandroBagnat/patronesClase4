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
public class PruebaServiceLocator {
    public static void main(String ...params) {
        Factory.crearServiceLocator();
        InterfazUI ui = (InterfazUI)Singleton.getInstane().serviceLocator.get("ui");
        ui.botonReservar(new DatosReserva(10, "Pedro"));
    }
}
