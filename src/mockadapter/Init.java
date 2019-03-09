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
public class Init {
    public static void realizarReserva(connSQL conn, DatosReserva datosReserva) {
        System.out.println("***Aca es donde me va a interesar testear***");
        String resp = conn.query(datosReserva);
        if (resp.equals("ok")) {
            conn.execute(datosReserva);
        }
        else {
            System.out.println("No se puede realizar la reserva");
        }
    }
    public static void main(String ...params) {
        realizarReserva(Factory.crearConexion(), new DatosReserva(55, "pepe"));
    } 
}
