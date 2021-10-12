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
public class clsPersona {
    private String id;
    private String nombre;
    private String ref;
    private String nomlibro;
    private String fecha;

    public clsPersona() {
    }

    public clsPersona(String id, String nombre, String ref, String nomlibro,String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.ref = ref;
        this.nomlibro = nomlibro;
        this.fecha=fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
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

   
    
    
}
