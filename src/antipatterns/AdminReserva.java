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
public class AdminReserva {
    public void realizarReserva(DatosReserva datosReserva) {
        ((Logger)Singleton.getInstane().serviceLocator.get("logger")).warning("Estoy por reservar!!!");
    }
}
