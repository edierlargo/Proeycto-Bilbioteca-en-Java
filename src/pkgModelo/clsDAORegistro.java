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
public class clsDAORegistro extends clsRegistro{
    pkgConecta.clsConecta con;

    public clsDAORegistro() {
        con = new pkgConecta.clsConecta();
    }
    public boolean registrar(){
        String SQL="INSERT INTO tbl_registro(persona, hora,fecha,termino)VALUES ('"+super.getPersona()+"', '"+super.getHora()+"','"+super.getFecha()+"','"+super.getHoratermino()+"')";
        return con.procesarSQL(SQL);
    }
   
    
}
