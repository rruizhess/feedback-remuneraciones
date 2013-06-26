package basedatos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author cepardov <cepardov@gmail.com>
 */

public class Usuario{
	private String ruttrabajador;
	private String nombre;
	private String paterno;
	private String materno;
        private String direccion;
        private String telefono;
	private String clave;
        private String nouser;
	private int cargo;

	/** Crea un nueva instancia de la clase usuario */
	public Usuario(){
        }
        public Usuario verificarUsuario(String ruttrabajador, String clave){
        Usuario u=null;
        Connection cn=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        try{
            Conect c=new Conect();
            cn=c.getConnection();
            String sql="SELECT * FROM trabajador WHERE ruttrabajador=? AND clave=?";
            pr=cn.prepareStatement(sql);
            pr.setString(1, ruttrabajador);
            pr.setString(2, clave);
            rs=pr.executeQuery();
            while(rs.next()){
                u=new Usuario();
                u.setRuttrabajador(rs.getString("ruttrabajador"));
                u.setNombre(rs.getString("nombre"));
                u.setPaterno(rs.getString("paterno"));
                u.setMaterno(rs.getString("materno"));
                u.setDireccion(rs.getString("direccion"));
                u.setTelefono(rs.getString("telefono"));
                u.setClave(rs.getString("clave"));
                u.setCargo(rs.getInt("idcargo"));
                break;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            u=null;
        }finally{
            try{
                rs.close();
                pr.close();
                rs.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return u;
    }

    /** Metodos GET de la clase usuario */
    public String getNousuario () {
        return nouser;
    }
    public String getRuttrabajador() {
        return ruttrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getDireccion(){
        return direccion;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getClave() {
        return clave;
    }

    public int getCargo() {
        return cargo;
    }

    /** Metodos SET de la clase usuario */
    public void setNousuario (String ruttrabajador) {
        this.nouser = ruttrabajador;
    }
    public void setRuttrabajador(String ruttrabajador) {
        this.ruttrabajador = ruttrabajador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

   
}