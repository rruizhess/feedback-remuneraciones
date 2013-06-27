package basedatos;
import GUIRecursosHumanos.Liquidacion;
public class Calculos {
    Liquidacion li=new Liquidacion();
    Conectliquidacion con=new Conectliquidacion();
    int dt;//=Integer.parseInt(con.getNdiastrabajados());
    int sb;//Integer.parseInt(con.getSueldobase());
    int he;//Integer.parseInt(li.getNhorasextras());
    int cf=Integer.parseInt(con.getNcargafamiliar());
    int imm=Integer.parseInt(con.getValorparametro());
    double fhe=0.007777;
    String nombreparametro=null;
    String tramo=null;
//-----------------------------------------------------------------------------------------------------------------------
    public void setNombreparametro(String nombreparametro) {
        this.nombreparametro = nombreparametro;
    }
    
    
   //--------------------------------------------------------------------------------------------------------------------- 
     public int calculodiastrabajados(){
     return (sb/30)*dt;
 }   

     public int gratificacion(){
         nombreparametro="imm";
     return (int)(imm*4.75)/12;
 }
 
     public int horasextras(){
     return (int)(sb*fhe)*he;
 }
    
 public int sumaimponible(){
 return this.calculodiastrabajados()+this.gratificacion()+this.horasextras();
 }
    
 //descuentos------------------------------------------------------------------------------------------------------------

    final double valorafp=Integer.parseInt(con.getValorprevision());
    final double valorfonasa=Integer.parseInt(con.getValorsalud());
        
    public int afp(){
    return (int)(valorafp*this.sumaimponible());
    }
    
    public int fonasa(){
    return (int)(valorfonasa*this.sumaimponible());
    }
    
    public int sumaDescuento(){
    
    return this.afp()+this.fonasa();
    }

//---------------------------------------------------------------------------------------------------------------
 
       int requisito=0;
        

    
    
}


