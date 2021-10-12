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
public class clsbibliotecarios {
      private String nom;
      private String ape;
      private String co;
      private String hora;
      private String codigo;

    public clsbibliotecarios() {
    }

    public clsbibliotecarios(String nom, String ape, String co, String hora, String codigo) {
        this.nom = nom;
        this.ape = ape;
        this.co = co;
        this.hora = hora;
        this.codigo = codigo;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the ape
     */
    public String getApe() {
        return ape;
    }

    /**
     * @param ape the ape to set
     */
    public void setApe(String ape) {
        this.ape = ape;
    }

    /**
     * @return the co
     */
    public String getCo() {
        return co;
    }

    /**
     * @param co the co to set
     */
    public void setCo(String co) {
        this.co = co;
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   
     
}
