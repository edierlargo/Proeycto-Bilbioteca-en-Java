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
public class clsentregar {
      private String id;
      private String nombre;
      private String ref;
      private String nomlibro;
      private String fechaentrega;
      private String entrego;
      private String hora;
     

    public clsentregar() {
    }

    public clsentregar(String id, String nombre, String ref, String nomlibro, String fechaentrega, String entrego, String hora) {
        this.id = id;
        this.nombre = nombre;
        this.ref = ref;
        this.nomlibro = nomlibro;
        this.fechaentrega = fechaentrega;
        this.entrego = entrego;
        this.hora = hora;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ref
     */
    public String getRef() {
        return ref;
    }

    /**
     * @param ref the ref to set
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * @return the nomlibro
     */
    public String getNomlibro() {
        return nomlibro;
    }

    /**
     * @param nomlibro the nomlibro to set
     */
    public void setNomlibro(String nomlibro) {
        this.nomlibro = nomlibro;
    }

    /**
     * @return the fechaentrega
     */
    public String getFechaentrega() {
        return fechaentrega;
    }

    /**
     * @param fechaentrega the fechaentrega to set
     */
    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    /**
     * @return the entrego
     */
    public String getEntrego() {
        return entrego;
    }

    /**
     * @param entrego the entrego to set
     */
    public void setEntrego(String entrego) {
        this.entrego = entrego;
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

   
     
}

