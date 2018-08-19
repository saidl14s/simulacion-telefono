/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematelefonico;
import javax.swing.JLabel;
/**
 *
 * @author said
 */
public class Telefono {
    private boolean estado; //true ocupado: false disponible
    private Telefono conexion; // si esta, ocupado con que tefelono?
    private int idTelefono; //identificador unico
    private JLabel indicador;
    
    public Telefono(boolean estado, Telefono conexion, int idTelefono, JLabel indicador){
        this.estado = estado;
        this.conexion = conexion;
        this.idTelefono = idTelefono;
        this.indicador = indicador;
        
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void setIdTelefono(int idTelefono){
        this.idTelefono = idTelefono;
    }

    public void setConexion(Telefono conexion) {
        this.conexion = conexion;
    }
    
    public int getIdTelefono(){
        return idTelefono;
    }
    
    public Telefono getConexion() {
        return conexion;
    }
    
    public JLabel getIndicador(){
        return indicador;
    }
    
    public boolean isOcupado() {
        return estado;
    }
    
    public String getStringOcupado(){
        if(estado) return "Ocupado";
        else return "Disponible";
    }
    
}
