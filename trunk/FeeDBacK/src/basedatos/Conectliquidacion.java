package basedatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conectliquidacion {
    Conect conn;
   
    public Conectliquidacion(){
        conn = new Conect();
    }
    public Object [] getTrabajador(String rut){
        Object[] data = new String[15];
        try{

            PreparedStatement pstm;
                pstm = conn.getConnection().prepareStatement("SELECT * FROM trabajador WHERE ruttrabajador='"+rut+"'");
            ResultSet res;
                res = pstm.executeQuery();

                if(res.next() ) {
                        data[0] = res.getString("ruttrabajador");
                        data[1] = res.getString("nombre");
                        data[2] = res.getString("paterno");
                        data[3] = res.getString("materno");
                        data[4] = res.getString("idcargo");
                        data[5] = res.getString("nombresalud");
                        data[6] = res.getString("nombreprevision");
                        data[7] = res.getString("fechaingreso");
                        data[8] = res.getString("tipocontrato");
                        data[9] = res.getString("ncargafamiliar");
                        data[10] = res.getString("suedobase");
                        data[11] = res.getString("direccion");
                        data[12] = res.getString("estado");
                        data[13] = res.getString("telefono");
                        data[14] = res.getString("email");
                }

        }catch (Exception e){}
        return data;
    }
}
 