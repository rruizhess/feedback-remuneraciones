package basedatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class control {
    Conect conn;
    
    public control(){
        conn = new Conect();
    }    
    public void addUser(String ruttrabajador, String nombre, String paterno, String materno, int idcargo, String nombresalud, String nombreprevision, String fechaingreso, String tipocontrato, String ncargafamiliar, String sueldobase, String direccion, String telefono, String email, String clave){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("insert into trabajador (ruttrabajador, nombre, paterno, materno, idcargo, nombresalud, nombreprevision, fechaingreso, tipocontrato, ncargafamiliar, sueldobase, direccion, telefono, email, clave) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstm.setString(1, ruttrabajador);
            pstm.setString(2, nombre);
            pstm.setString(3, paterno);
            pstm.setString(4, materno);
            pstm.setInt(5, idcargo);
            pstm.setString(6, nombresalud);
            pstm.setString(7, nombreprevision);
            pstm.setString(8, fechaingreso);
            pstm.setString(9, tipocontrato);
            pstm.setString(10, ncargafamiliar);
            pstm.setString(11, sueldobase);
            pstm.setString(12, direccion);
            pstm.setString(13, telefono);
            pstm.setString(14, email);
            pstm.setString(15, clave);
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "El el usuario registrado correctamente");
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
    public void updateUsuarioComplete(String ruttrabajador, String nombre, String paterno, String materno, int idcargo, String nombresalud, String nombreprevision, String fechaingreso, String tipocontrato, String ncargafamiliar, String sueldobase, String direccion, String telefono, String email, String estado){
       try {            
            PreparedStatement pstm = conn.getConnection().prepareStatement("update trabajador " +
            "set nombre = ? ," +
            "paterno = ? ," +
            "materno = ? ," + 
            "idcargo = ? ," +         
            "nombresalud = ? ," + 
            "nombreprevision = ? ," + 
            "fechaingreso = ? ," + 
            "tipocontrato = ? ," + 
            "ncargafamiliar = ? ," + 
            "sueldobase = ? ," + 
            "direccion = ? ," +
            "telefono = ? ," +
            "email = ? ," +        
            "estado = ? " + 
            "where ruttrabajador = ?");            
            pstm.setString(1, nombre);
            pstm.setString(2, paterno);
            pstm.setString(3, materno);
            pstm.setInt(4, idcargo);
            pstm.setString(5, nombresalud);
            pstm.setString(6, nombreprevision);
            pstm.setString(7, fechaingreso);
            pstm.setString(8, tipocontrato);
            pstm.setString(9, ncargafamiliar);
            pstm.setString(10, sueldobase);
            pstm.setString(11, direccion);
            pstm.setString(12, telefono);
            pstm.setString(13, email);
            pstm.setString(14, estado);
            pstm.setString(15, ruttrabajador);
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
      }
   }
     public void updateEditardato(String rut, String nombre, String paterno, String materno, String direccion, String telefono){
       try {            
            PreparedStatement pstm = conn.getConnection().prepareStatement("update trabajador " +
            "set nombre = ? ," +
            "paterno = ? ," +
            "materno = ? ," + 
            "direccion = ? ," +
            "telefono = ? " + 
            "where ruttrabajador = ?");            
            pstm.setString(1, nombre);
            pstm.setString(2, paterno);
            pstm.setString(3, materno);
            pstm.setString(4, direccion);
            pstm.setString(5, telefono);
            pstm.setString(6, rut);
            pstm.execute();
            pstm.close();  
            JOptionPane.showMessageDialog(null, "Trabajo realizado exitosamente\nLos cambios surtiran efecto la proxima vez que inicie sesión.");
         }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
      }
   }
   public void updateUsuario2(String ruttrabajador, String nombre, String paterno, String materno, int idcargo){
       try {            
            PreparedStatement pstm = conn.getConnection().prepareStatement("update trabajador " +
            "set nombre = ? ," +
            "paterno = ? ," +
            "materno = ? ," +
            "idcargo = ? " +
            "where ruttrabajador = ?");            
            pstm.setString(1, nombre);
            pstm.setString(2, paterno);
            pstm.setString(3, materno);
            pstm.setInt(4, idcargo);
            pstm.setString(5, ruttrabajador);            
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Los cambios de han efectuado exitosamente");
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
      }
   }
   public void delUsuario(String ruttrabajador){
       try {                
            PreparedStatement pstm = conn.getConnection().prepareStatement("delete from trabajador where ruttrabajador = ?");            
            pstm.setString(1, ruttrabajador);                   
            pstm.execute();
            pstm.close();            
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
      }
   }
   public void updateClave(String clave, String ruttrabajador){
       try {                
            PreparedStatement pstm = conn.getConnection().prepareStatement("update trabajador "+
            "set clave=?"+
            "where ruttrabajador=?");            
            pstm.setString(1, clave);                 
            pstm.setString(2, ruttrabajador);
            pstm.execute();
            pstm.close();            
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
      }
   }
   public Object [][] getUsuarios(){
        int posid = 0;
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("SELECT count(1) as total FROM trabajador");
            ResultSet res = pstm.executeQuery();
            res.next();
            posid = res.getInt("total");
            res.close();
            }catch(SQLException e){
                System.out.println(e);
        }
        Object[][] data = new String[posid][5];
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("SELECT ruttrabajador, nombre, paterno, materno, idcargo FROM trabajador ORDER BY ruttrabajador");
            ResultSet res = pstm.executeQuery();
            int increment = 0;
            while(res.next()){
                String estRut = res.getString("ruttrabajador");
                String estNombre = res.getString("nombre");
                String estPaterno = res.getString("paterno");
                String estMaterno = res.getString("materno");
                String estCargo = res.getString("idcargo");
                data[increment][0] = estRut;
                data[increment][1] = estNombre;
                data[increment][2] = estPaterno;
                data[increment][3] = estMaterno;
                data[increment][4] = estCargo;
                increment++;
            }
            res.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
        return data;
    }
    public void addPrevisionM(String mes, String año, String nombre, String valor){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("insert into prevision (mes, año, nombre,valor) values(?,?,?,?)");
            pstm.setString(1, mes);
            pstm.setString(2, año);
            pstm.setString(3, nombre);
            pstm.setString(4, valor);
            pstm.execute();
            pstm.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
    public void updatePrevisionM(String mes, String año, String nombre, String valor){
       try {            
            PreparedStatement pstm = conn.getConnection().prepareStatement("update prevision " +
            "set mes = ? ," +
            "año = ? ," +
            "nombre = ? ," +                    
            "valor = ?");            
            pstm.setString(0, mes);                   
            pstm.setString(1, año);
            pstm.setString(2, nombre);
            pstm.setString(3, valor);
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
      }
   }
   public Object [][] getPrevision(){
        int posid = 0;
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("SELECT count(1) as total FROM prevision");
            ResultSet res = pstm.executeQuery();
            res.next();
            posid = res.getInt("total");
            res.close();
            }catch(SQLException e){
                System.out.println(e);
        }
        Object[][] data = new String[posid][6];
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("SELECT mes,año,nombre,valor FROM prevision ORDER BY mes");
            ResultSet res = pstm.executeQuery();
            int increment = 0;
            while(res.next()){
                String estMes = res.getString("mes");
                String estAño = res.getString("año");
                String estNombre = res.getString("nombre");
                String estValor = res.getString("valor");
                data[increment][0] = estMes;
                data[increment][1] = estAño;
                data[increment][2] = estNombre;
                data[increment][3] = estValor;
                increment++;
            }
            res.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
        return data;
   }
   public void delPrevision(int usuario_Codigo){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("delete from Usuario where usuario_Codigo = "+usuario_Codigo);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //------------------------------------------------------------------------------------------------------------//
    
    public void addSaludM(String mes, String año, String nombre, String valor){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("insert into salud (mes, año, nombre,valor) values(?,?,?,?)");
            pstm.setString(1, mes);
            pstm.setString(2, año);
            pstm.setString(3, nombre);
            pstm.setString(4, valor);
            pstm.execute();
            pstm.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
    public void updateSaludM(String mes, String año, String nombre, String valor){
       try {            
            PreparedStatement pstm = conn.getConnection().prepareStatement("update salud " +
            "set mes = ? ," +
            "año = ? ," +
            "nombre = ? ," +                    
            "valor = ?");            
            pstm.setString(0, mes);                   
            pstm.setString(1, año);
            pstm.setString(2, nombre);
            pstm.setString(3, valor);
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
      }
   }
    
    public Object [][] getSalud(){
        int posid = 0;
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("SELECT count(1) as total FROM salud");
            ResultSet res = pstm.executeQuery();
            res.next();
            posid = res.getInt("total");
            res.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
        Object[][] data = new String[posid][6];
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("SELECT mes,año,nombre,valor FROM salud ORDER BY mes");
            ResultSet res = pstm.executeQuery();
            int increment = 0;
            while(res.next()){
                String estMes = res.getString("mes");
                String estAño = res.getString("año");
                String estNombre = res.getString("nombre");
                String estValor = res.getString("valor");
                data[increment][0] = estMes;
                data[increment][1] = estAño;
                data[increment][2] = estNombre;
                data[increment][3] = estValor;
                increment++;
            }
            res.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
        return data;
    }
     public void delSalud(String mes, String año, String nombre){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("delete from salud where mes='"+mes+"' and mes='"+mes+"'and nombre='"+nombre+"'");
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //-------------------------------------------------------------------------------------------------------------------
     
    public void addAsignacion(String monto,String requisito){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("insert into asignacionfamiliar (monto,requisito) values(?,?)");
            pstm.setString(1, monto);
            pstm.setString(2, requisito);
            pstm.execute();
            pstm.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
    public void updateAsignacion(String monto,String requisito){
       try {            
            PreparedStatement pstm = conn.getConnection().prepareStatement("update asignacionfamiliar " +
            "set monto = ? ," +
            "requiisito = ?");            
            pstm.setString(1, monto);                   
            pstm.setString(2, requisito);
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
      }
   }
    
    public Object [][] getAsignacion(){
        int posid = 0;
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("SELECT count(1) as total FROM asignacionfamiliar");
            ResultSet res = pstm.executeQuery();
            res.next();
            posid = res.getInt("total");
            res.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
        Object[][] data = new String[posid][6];
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("SELECT monto,requisito FROM asignacionfamiliar ORDER BY monto");
            ResultSet res = pstm.executeQuery();
            int increment = 0;
            while(res.next()){
                String estMonto = res.getString("monto");
                String estRequisito = res.getString("requisito");
                data[increment][0] = estMonto;
                data[increment][1] = estRequisito;
                increment++;
            }
            res.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
        return data;
    }
     public void delAsignacion(String monto,String requisito){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("delete from asignacionfamiliar where mes='"+monto+"'and requisito='"+requisito+"'");
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     //--------------------------------------------------------------------------------------------------------------------//
     
    public void addParametros(String mes, String año, String nombre, String valor){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("insert into parametros (mes, año, nombre,valor) values(?,?,?,?)");
            pstm.setString(1, mes);
            pstm.setString(2, año);
            pstm.setString(3, nombre);
            pstm.setString(4, valor);
            pstm.execute();
            pstm.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
    public void updateParametros(String mes, String año, String nombre, String valor){
       try {            
            PreparedStatement pstm = conn.getConnection().prepareStatement("update parametros " +
            "set mes = ? ," +
            "año = ? ," +
            "nombre = ? ," +                    
            "valor = ?");            
            pstm.setString(0, mes);                   
            pstm.setString(1, año);
            pstm.setString(2, nombre);
            pstm.setString(3, valor);
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e);
      }
   }
   public Object [][] getParametros(){
        int posid = 0;
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("SELECT count(1) as total FROM parametros");
            ResultSet res = pstm.executeQuery();
            res.next();
            posid = res.getInt("total");
            res.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
        Object[][] data = new String[posid][6];
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("SELECT mes,año,nombre,valor FROM parametros ORDER BY mes");
            ResultSet res = pstm.executeQuery();
            int increment = 0;
            while(res.next()){
                String estMes = res.getString("mes");
                String estAño = res.getString("año");
                String estNombre = res.getString("nombre");
                String estValor = res.getString("valor");
                data[increment][0] = estMes;
                data[increment][1] = estAño;
                data[increment][2] = estNombre;
                data[increment][3] = estValor;
                increment++;
            }
            res.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
        }
        return data;
    }
    public void delParametros(String mes, String año, String nombre){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("delete from parametros where mes='"+mes+"' and mes='"+mes+"'and nombre='"+nombre+"'");
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            }
     }
     public void delFono(String ruttrabajador, String telefono){
        try{
            PreparedStatement pstm = conn.getConnection().prepareStatement("delete from telefono where ruttrabajador='"+ruttrabajador+"'and telefono='"+telefono+"'");
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
