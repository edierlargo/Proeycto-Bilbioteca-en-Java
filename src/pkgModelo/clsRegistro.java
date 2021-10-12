/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgModelo;

/**
 *
 * @author Edierlargo
 */
public class clsRegistro {
      private String persona;
      private String hora;
      private String fecha;
      private String horatermino;

    public clsRegistro() {
    }

    public clsRegistro(String persona, String hora, String fecha, String horatermino) {
        this.persona = persona;
        this.hora = hora;
        this.fecha = fecha;
        this.horatermino = horatermino;
    }

    /**
     * @return the persona
     */
    public String getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(String persona) {
        this.persona = persona;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the horatermino
     */
    public String getHoratermino() {
        return horatermino;
    }

    /**
     * @param horatermino the horatermino to set
     */
    public void setHoratermino(String horatermino) {
        this.horatermino = horatermino;
    }
    

    
    
    
}
