package basedatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conectliquidacion {
    Conect conn;
   
    public Conectliquidacion(){
        conn = new Conect();
    }
    public Object [] getTrabajador(String rut){
        Object[] data = new String[12];
        try{

            PreparedStatement pstm;
                pstm = conn.getConnection().prepareStatement("SELECT ruttrabajador, nombre,"+
                                " paterno, materno, idcargo,nombresalud,nombreprevision,fechaingreso,tipocontrato,ncargafamiliar, "+
                                "sueldobase,direccion,clave, estado FROM trabajador WHERE ruttrabajador='"+rut+"'");
            ResultSet res;
                res = pstm.executeQuery();

                if(res.next() ) {
                        data[1] = res.getString("ruttrabajador");
                        data[2] = res.getString("nombre");
                        data[3] = res.getString("paterno");
                        data[4] = res.getString("materno");
                        data[5] = res.getString("idcargo");
                        data[6] = res.getString("nombresalud");
                        data[7] = res.getString("nombreprevision");
                        data[8] = res.getString("fechaingreso");
                        data[9] = res.getString("tipocontrato");
                        data[9] = res.getString("ncargafamiliar");
                        data[10] = res.getString("suedobase");
                        data[11] = res.getString("suedobase");
                        data[12] = res.getString("estado");
                }

        }catch (Exception e){}
        return data;
    }
}
 