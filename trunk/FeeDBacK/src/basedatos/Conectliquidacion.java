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
    String ncargafamiliar;
    String valorsalud;
    String valorprevision;
    String valorparametro;
    String nombreparametro;
    String tramo;
    String asignacionmonto;
    String asignacionrequisito;
    String ndiastrbajados;
    String nhorasextras;
    Conect conn;
   
    public Conectliquidacion(){
    
    }
    public void addDatosli(String rut, String mes,String año, String ndiastrabajados, String nhorasextras){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("insert into datosliquidacionmensual (rut,mes, año, ndiastrabajados,nhorasextras) values(?,?,?,?,?)");
            pstm.setString(1, rut);
            pstm.setString(2, mes);
            pstm.setString(3, año);
            pstm.setString(4, ndiastrabajados);
            pstm.setString(4, nhorasextras);
            pstm.execute();
            pstm.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
    public void tomarDatosli(String rut, String mes,String año){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("select ndiastrabajados,nhorasextras from datosliquidacionmensual where rut='"+rut+"' mes ='"+mes+"' año='"+año+"'");
            pstm.setString(1, rut);
            pstm.setString(2, mes);
            pstm.setString(3, año);
            pstm.execute();
                
            pstm.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
     public Conectliquidacion tomarDatosliqui(String rut,String mes,String año){
        Conectliquidacion con=new Conectliquidacion();
        Connection cn=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        try{
            Liquidacion li=new Liquidacion();
            Conect c=new Conect();
            cn=c.getConnection();
            String sql=("select ndiastrabajados,nhorasextras from datosliquidacionmensual where rut='"+rut+"' mes ='"+mes+"' año='"+año+"'");
            pr=cn.prepareStatement(sql);
            pr.setString(1,rut);
            rs=pr.executeQuery();
            while(rs.next()){
                con.setNdiastrabajado(rs.getString("ndiastrabajados"));
                con.setNhorasextras(rs.getString("nhorasextras"));
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
    //--------------------------------------------------------------------------------------------------------------------------
    public Conectliquidacion DatosTrabajador(String rut){
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
            pr.setString(1,rut);
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
    public Conectliquidacion DatosSalud(String rut,String mes, String año){
        Conectliquidacion con=new Conectliquidacion(); 
        Connection cn=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        try{
            Conect c=new Conect();
            cn=c.getConnection();
            String sql=("select valor from salud where mes='"+mes+"' and '"+año+
                    "'and nombre=(select nombresalud from trabajador where ruttrabajador='"+rut+"')");
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
    public Conectliquidacion DatosPrevision(String rut, String mes,String año){
        Conectliquidacion con=new Conectliquidacion();
        Connection cn=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        try{
            Liquidacion li=new Liquidacion();
            Conect c=new Conect();
            cn=c.getConnection();
            String sql=("select valor from salud where mes='"+mes+"' and '"+año+
                    "'and nombre=(select nombresalud from trabajador where ruttrabajador='"+rut+"')");
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

//      Trabajador buscar = new Trabajador();
////en el boton search
//txtnombre.setText(buscar.buscar_trabajadores_Rut(txtrut.getText())[0]);
//txtdireccion.setText(buscar.buscar_trabajadores_Rut(txtrut.getText())[1]);
//txtestadocivil.setText(buscar.buscar_trabajadores_Rut(txtrut.getText())[2]);
//txtcargasfamiliares.setText(buscar.buscar_trabajadores_Rut(txtrut.getText())[3]);
//txtsueldobase.setText(buscar.buscar_trabajadores_Rut(txtrut.getText())[4]);
//metodo de busqueda rut a traves de arreglo va en 
        public String[] buscarAsignacion(){
            String[] datos = new String[4];
            Calculos cal=new Calculos();
                try{
                    Conect c=new Conect();
                    
                    PreparedStatement pstm = c.getConnection().prepareStatement("select tramo, monto,requisito from asignacionfamiliar where tramo=''");
                    ResultSet res = pstm.executeQuery();
                    if(res.next()){
                    datos[0] = res.getString("valor");
                    
                    
                }
                }catch (Exception e){}
            return datos;
        }
    
    
//    public Conectliquidacion DatosParametros(){
//        Conectliquidacion con=new Conectliquidacion();
//        Connection cn=null;
//        PreparedStatement pr=null;
//        ResultSet rs=null;
//        try{
//            Liquidacion li=new Liquidacion();
//            Conect c=new Conect();
//            cn=c.getConnection();
//            String sql=("select valor from parametros where mes='"+mes+"' and '"+año+
//                    "'and nombre='"+nombreparametro+"'");
//            pr=cn.prepareStatement(sql);
//            rs=pr.executeQuery();
//            while(rs.next()){
//                con.setValorparametro(rs.getString("valor"));
//      
//                break;
//            }
//        }catch(SQLException e){
//            JOptionPane.showMessageDialog(null, e);
//            con=null;
//        }finally{
//            try{
//                rs.close();
//                pr.close();
//                rs.close();
//            }catch(SQLException e){
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }
//        return con;
//    }
    //----------------------------------------------------------------------------------------------------------------------
    public Conectliquidacion DatosAsigancion(String tramo, String mes, String año ){
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

    public String getNdiastrbajados() {
        return ndiastrbajados;
    }

    public String getNhorasextras() {
        return nhorasextras;
    }

    public String getNcargafamiliar() {
        return ncargafamiliar;
    }

//    public String getNombreparametro() {
//        return nombreparametro;
//    }

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

    public String getValorparametro() {
        return valorparametro;
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
        this.tramo=tramo; 
    }

    private void setValorparametro(String valorparametro) {
        this.valorparametro=valorparametro; 
    }

    private void setNumcargafamiliar(String ncargafamiliar) {
        this.ncargafamiliar=ncargafamiliar; 
    }


    private void setNdiastrabajado(String ndiastrabajados) {
        this.ndiastrbajados=ndiastrabajados;
    }

    private void setNhorasextras(String nhorasextras) {
        this.nhorasextras=nhorasextras;
    }

    
}
 