
package pkgModelo;

/**
 *
 * @author Edierlargo
 */
public class clsDAOLogin extends clsLogin{
    pkgConecta.clsConecta con;

    public clsDAOLogin() {
        con = new pkgConecta.clsConecta();
    }
    
    public boolean valideLogin(){
        String SQL="SELECT correoe, clave FROM tbl_login WHERE correoe='"+super.getCorreoe()+"' AND clave='"+super.getClave()+"';";
        if ( con.validar(SQL)==false){
            return false;
        }else{
            return true;
        }
    }
    
}
