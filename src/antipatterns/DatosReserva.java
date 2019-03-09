/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antipatterns;

import mockadapter.*;

/**
 *
 * @author educacionit
 */
public class DatosReserva {
    public final int cantPersonas;
    public final String nombre;

    public DatosReserva(int cantPersonas, String nombre) {
        this.cantPersonas = cantPersonas;
        this.nombre = nombre;
    }
}
