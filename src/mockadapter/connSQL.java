/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockadapter;

/**
 *
 * @author educacionit
 */
public interface connSQL {
    String query(DatosReserva datosReserva);
    void execute(DatosReserva datosReserva);
}
