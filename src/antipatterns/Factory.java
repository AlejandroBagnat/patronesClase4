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
public class Factory {
    public static void crearServiceLocator() {
        Singleton.getInstane().serviceLocator.put("logger", new Logger());
        Singleton.getInstane().serviceLocator.put("ui", new InterfazUIMejorada());
        Singleton.getInstane().serviceLocator.put("ar", new AdminReserva());
    }
}
