package basedatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import GUIRecursosHumanos.Liquidacion;
public class Conectliquidacion {
    Liquidacion li=new Liquidacion();
    Calculos ca=new Calculos();
    String sueldobase;
    String nombresalud;
    String nombreprevision;
    String mes=li.getMes();
    String año=li.getAño();
    String ruttrabajador=li.getRut();
    String ncargafamiliar;
    String valorsalud;
    String valorprevision;
    String valorparametro;
    String nombreparametro=ca.getNombreparametro();
    String tramo=ca.getTramo();
    String asignacionmonto;
    String asignacionrequisito;
    Conect conn;
   
    public Conectliquidacion(){
    
    }
    public Conectliquidacion DatosTrabajador(){
        Conectliquidacion con=new Conectliquidacion();
        Connection cn=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        try{
            Liquidacion li=new Liquidacion();
            Conect c=new Conect();
            cn=c.getConnection();
            String sql="SELECT * FROM trabajador WHERE ruttrabajador=?";
            pr=cn.prepareStatement(sql);
            pr.setString(1,li.getRut());
            rs=pr.executeQuery();
            while(rs.next()){
                con.setSueldobase(rs.getString("sueldobase"));
                con.setNombresalud(rs.getString("nombresalud"));
                con.setNombreprevision(rs.getString("nombreprevision"));
                con.setNumcargafamiliar(rs.getString("ncargafamiliar"));
                break;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            con=null;
        }finally{
            try{
                rs.close();
                pr.close();
                rs.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return con;
    }
    //--------------------------------------------------------------------------------------------------------------------
    public Conectliquidacion DatosSalud(){
        Conectliquidacion con=new Conectliquidacion(); 
        Connection cn=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        try{
            Conect c=new Conect();
            cn=c.getConnection();
            String sql=("select valor from salud where mes='"+mes+"' and '"+año+
                    "'and nombre=(select nombresalud from trabajador where ruttrabajador='"+ruttrabajador+"'");
            pr=cn.prepareStatement(sql);
            rs=pr.executeQuery();
            while(rs.next()){
                con.setValorsalud(rs.getString("valor"));
      
                break;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try{
                rs.close();
                pr.close();
                rs.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return con;
    }
    //--------------------------------------------------------------------------------------------------------------------
    public Conectliquidacion DatosPrevision(){
        Conectliquidacion con=new Conectliquidacion();
        Connection cn=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        try{
            Liquidacion li=new Liquidacion();
            Conect c=new Conect();
            cn=c.getConnection();
            String sql=("select valor from prevision where mes='"+mes+"' and '"+año+
                    "'and nombre=(select nombresalud from trabajador where ruttrabajador='"+ruttrabajador+"'");
            pr=cn.prepareStatement(sql);
            rs=pr.executeQuery();
            while(rs.next()){
                con.setValorprevision(rs.getString("valor"));
      
                break;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            con=null;
        }finally{
            try{
                rs.close();
                pr.close();
                rs.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return con;
    }
    
    //--------------------------------------------------------------------------------------------------------------------

    public Conectliquidacion DatosParametros(){
        Conectliquidacion con=new Conectliquidacion();
        Connection cn=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        try{
            Liquidacion li=new Liquidacion();
            Conect c=new Conect();
            cn=c.getConnection();
            String sql=("select valor from parametros where mes='"+mes+"' and '"+año+
                    "'and nombre='"+nombreparametro+"'");
            pr=cn.prepareStatement(sql);
            rs=pr.executeQuery();
            while(rs.next()){
                con.setValorparametro(rs.getString("valor"));
      
                break;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            con=null;
        }finally{
            try{
                rs.close();
                pr.close();
                rs.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return con;
    }
    //----------------------------------------------------------------------------------------------------------------------
    public Conectliquidacion DatosAsigancion(){
        Conectliquidacion con=new Conectliquidacion();
        Connection cn=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        try{
            Liquidacion li=new Liquidacion();
            Conect c=new Conect();
            cn=c.getConnection();
            String sql=("select valor from asignacionfamiliar where mes='"+mes+"' and '"+año+
                    "'and tramo='"+tramo+"'");
            pr=cn.prepareStatement(sql);
            rs=pr.executeQuery();
            while(rs.next()){
                con.setTramo(rs.getString("valor"));
      
                break;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            con=null;
        }finally{
            try{
                rs.close();
                pr.close();
                rs.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return con;
    }

    //----------------------------------------------------------------------------------------------------------------------
    public String getSueldobase() {
        return sueldobase;
    }

    public String getNcargafamiliar() {
        return ncargafamiliar;
    }

    public String getNombreparametro() {
        return nombreparametro;
    }

    public String getValorsalud() {
        return valorsalud;
    }

    
    public String getValorprevision() {
        return valorprevision;
    }

    public String getAsignacionmonto() {
        return asignacionmonto;
    }

    public String getAsignacionrequisito() {
        return asignacionrequisito;
    }
    
    //----------------------------------------------------------------------------------------------------------------------
    private void setValorsalud(String valorsalud) {
        this.valorsalud=valorsalud;
    }

    private void setSueldobase(String sueldobase) {
        this.sueldobase=sueldobase;
    }

    private void setNombresalud(String nombresalud) {
        this.nombresalud=nombresalud;
    }

    private void setNombreprevision(String nombreprevision) {
        this.nombreprevision=nombreprevision;
    }

    private void setValorprevision(String valorprevision) {
        this.valorprevision=valorprevision;
    }

    private void setTramo(String tramo) {
        this.tramo=tramo; //To change body of generated methods, choose Tools | Templates.
    }

    private void setValorparametro(String valorparametro) {
        this.valorparametro=valorparametro; //To change body of generated methods, choose Tools | Templates.
    }

    private void setNumcargafamiliar(String ncargafamiliar) {
        this.ncargafamiliar=ncargafamiliar; //To change body of generated methods, choose Tools | Templates.
    }

    
}
 