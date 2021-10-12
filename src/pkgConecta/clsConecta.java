 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgConecta;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edierlargo
 */
public class clsConecta {
    java.sql.Connection con;// 1. Para cargar el Driver de JDBC para Postgres
    java.sql.Statement st; // 2. Para conectarse con el Motor
    java.sql.ResultSet res; // 3. Procesar las consultas (información)

    public clsConecta() {
        //para conectrase al motor potsgres
        try {
            try {
                Class.forName("org.postgresql.Driver"); // Carga el drive
                System.out.println("Driver Correcto");
            } 
            catch (ClassNotFoundException ex) {
                System.out.println("Error cargando el Driver");
            }
          
       con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/biblioteca", "postgres", "1234");
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar con el Motor");
        }
    }
    public void insertAR(String sql){
        try { 
            st=con.createStatement();
            java.sql.ResultSet rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("error al insertando"+ex.toString());
            
        }
    
    
}
    
    public boolean validar(String sql){
        // JDBC
        java.sql.ResultSet hoja_resultado=null;
        try { 
            st=con.createStatement(); // Se conecta con el motor
            hoja_resultado=st.executeQuery(sql);
            if (hoja_resultado.next()){ // Si los datos correctos
                return true;
            }
            else{ // No está registro en la base de datos
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Error consultando: "+ex.toString());
            return false;
        }
    }
    
    public boolean procesarSQL(String SQL){
        try { 
            st=con.createStatement();
            return st.execute(SQL);
        } catch (SQLException ex) {
            System.out.println("Problema con el SQL "+ex.toString());
            return false;
        }
    }
    
    public java.sql.ResultSet consultar(String sql){
        try { 
            st=con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("error consultando "+ex.toString());
            return null;
        }
    }
    public String eliminar(String sql){
        try { 
            st=con.createStatement();
            int resultado=st.executeUpdate(sql);
            if (resultado==1){
                return "elimino";
            }else{
              return "error";  
            }
        } catch (SQLException ex) {
            System.out.println("error consultando "+ex.toString());
            return null;
        }
    }
    public String modifica(String sql){
        try { 
            st=con.createStatement();
            int resultado=st.executeUpdate(sql);
            if (resultado==1){
                return "modifico";
            }else{
              return "error";  
            }
        } catch (SQLException ex) {
            System.out.println("error insertando"+ex.toString());
            return null;
        }
    }
    
}
