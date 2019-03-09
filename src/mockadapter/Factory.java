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
public class Factory {
    public static connSQL crearConexion() {
        // return new FakeSQL();
        return new AdapterSQL(null);
    }
}
