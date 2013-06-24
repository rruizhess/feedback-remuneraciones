package basedatos;
import GUIRecursosHumanos.Liquidacion;
public class Calculos {
    Liquidacion li=new Liquidacion();
    Conectliquidacion con=new Conectliquidacion();
    int dt=Integer.parseInt(li.getDiastrabajados());
    int sb=Integer.parseInt(con.getSueldobase());
    int he=Integer.parseInt(li.getNhorasextras());
    int cf=Integer.parseInt(con.getNcargafamiliar());
    final int imm=165000;
    final double fhe=0.007777;
    String nombreparametro=null;
    String tramo=null;
//-----------------------------------------------------------------------------------------------------------------------
    public String getNombreparametro() {
        return nombreparametro;
    }

    public String getTramo() {
        return tramo;
    }

    public void setNombreparametro(String nombreparametro) {
        this.nombreparametro = nombreparametro;
    }

    public void setTramo(String tramo) {
        this.tramo = tramo;
    }
    
    
   //--------------------------------------------------------------------------------------------------------------------- 
     public int calculodiastrabajados(){
     return (sb/30)*dt;
 }   

     public int gratificacion(){
     return (int)(imm*4.75)/12;
 }
 
     public int horasextras(){
     return (int)(sb*fhe)*he;
 }
    
 public int sumaimponible(){
 return this.calculodiastrabajados()+this.gratificacion()+this.horasextras();
 }
    
 //------------------------------------------------------------------------------------------------------------
 public class Descuentos {
    int imponible;
    final double valorafp=Integer.parseInt(con.getValorprevision());
    final double valorfonasa=Integer.parseInt(con.getValorsalud());

    public Descuentos(int imponible) {
        this.imponible = imponible;
    }
        
    public int afp(){
    return (int)(valorafp*imponible);
    }
    
    public int fonasa(){
    return (int)(valorfonasa*imponible);
    }
    
    public int sumaDescuento(){
    
    return this.afp()+this.fonasa();
    }
}
//---------------------------------------------------------------------------------------------------------------
// public class NoImponible {
//
//    int imponible,cf;
//    Object[][] dtPer;
//        private int setRequisito;
//        private int setMonto;
//
//    public NoImponible(int imponible, int cf) {
//        this.imponible = imponible;
//        this.cf = cf;
//    }
//
//    public NoImponible() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//   
//    public int cargaFamiliar(){
//    Conectliquidacion con=new Conectliquidacion();
//    
//    if(imponible< setRequisito)
//      return setMonto*cf;
//    }
//   
//    public int sumaNoImponible(){
//    return this.cargaFamiliar()+this.imponible;
//    }
//    
    
}


