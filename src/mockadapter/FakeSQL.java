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
public class FakeSQL implements connSQL {

    @Override
    public String query(DatosReserva datosReserva) {
        if (datosReserva.cantPersonas < 10) {
            return "ok";
        }
        return "NO ok";
    }

    @Override
    public void execute(DatosReserva datosReserva) {
        System.out.println("Si bien, este retorna void, se puede ejecutar algo para terminar el unit test");
    }
}
