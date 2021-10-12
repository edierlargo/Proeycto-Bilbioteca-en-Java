/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgModelo;

import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pkgConecta.clsConecta;

/**
 *
 * @author Edierlargo
 */
public class clsDAObibliotecarios extends clsbibliotecarios {
    pkgConecta.clsConecta con;

    public clsDAObibliotecarios() {
        con = new pkgConecta.clsConecta();
    }

    public boolean insertar() {
        String SQL = "INSERT INTO tbl_bibliotecarios(codigo,nombre,apellidos,correo,hora) VALUES ('" + super.getCodigo() + "','" + super.getNom() + "','" + super.getApe() + "','" + super.getCo() + "','" + super.getHora() + "')";
        return con.procesarSQL(SQL);
    }

    public void borrar() {
        String SQL = "DELETE FROM tbl_bibliotecarios WHERE nombre='" + super.getNom()+"'";
        con.procesarSQL(SQL);
    }

    public boolean modificar(){
        String SQL = "UPDATE tbl_bibliotecarios SET nombre='" + super.getNom() + "',apellidos='" + super.getApe() + "',correo='" + super.getCo() + "',hora='" + super.getHora() + "',codigo='" + super.getCodigo() + "' WHERE codigo='" + super.getCodigo() + "'";
        return con.procesarSQL(SQL);
    }
public  java.util.ArrayList  consultar (){
      String sql="SELECT * FROM tbl_bibliotecarios WHERE codigo='" + super.getCodigo() + "'"; 
      java.sql.ResultSet re=null;
      java.util.ArrayList resu = new java.util.ArrayList();
      re=con.consultar(sql);
          try {
              if (re.next()){
                  resu.add(re.getString(1));
                  resu.add(re.getString(2));
                  resu.add(re.getString(3));
                  resu.add(re.getString(4));
                  resu.add(re.getString(4));
                  
                  
                 
              }
              return resu;
          } catch (SQLException ex) {
              System.out.println(ex.toString() );
              return null;
          }
   }
   

    public javax.swing.table.DefaultTableModel listar(JTable tbl) {
        javax.swing.table.DefaultTableModel modelo;
        modelo = new DefaultTableModel(new Object[]{tbl.getColumnName(0), tbl.getColumnName(1),tbl.getColumnName(2),tbl.getColumnName(3),tbl.getColumnName(4)}, 0);
        String SQL = "SELECT * FROM tbl_bibliotecarios";
        java.sql.ResultSet res = null;
        res = con.consultar(SQL);
        try {
            while (res.next()) {
                modelo.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
            }
        } catch (SQLException ex) {
            System.out.println("Error consultando para listar");
        }
        return modelo;
    }
    
    public javax.swing.DefaultComboBoxModel listarCombo() {
        javax.swing.DefaultComboBoxModel modelo;
        modelo = new javax.swing.DefaultComboBoxModel();
        String SQL = "SELECT * FROM tbl_bibliotecarios";
        java.sql.ResultSet res = null;
        res = con.consultar(SQL);
        try {
            while (res.next()) {
                modelo.addElement(res.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("Error consultando para listar en combo");
        }
        return modelo;
    }
    
    
}
