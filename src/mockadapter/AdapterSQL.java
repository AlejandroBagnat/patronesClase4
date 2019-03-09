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
public class AdapterSQL implements connSQL {

    java.sql.Connection conn;
    
    public AdapterSQL(java.sql.Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public String query(DatosReserva datosReserva) {
        try {
            conn.close();
        } 
        catch (Exception ex) {
        }
        return "no activo";
    }

    @Override
    public void execute(DatosReserva datosReserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
