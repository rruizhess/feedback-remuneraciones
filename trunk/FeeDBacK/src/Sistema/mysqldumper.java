
package Sistema;

import java.io.*;
import javax.swing.JOptionPane;

/**
 * @author cepardov <cepardov@gmail.com>
 */

public class mysqldumper {
    private int BUFFER = 10485760;
    private StringBuffer temp = null;
    private FileWriter  fichero = null;
    private PrintWriter pw = null;
    
 public boolean backupforWinNT(String host, String port, String user, String password, String db, String file_backup){
    boolean ok=false;
    try{
         Process run = Runtime.getRuntime().exec(
        "c:\\xampp\\mysql\\bin\\mysqldump.exe --host=" + host + " --port=" + port +
        " --user=" + user + " --password=" + password +
        " --compact --complete-insert --extended-insert --skip-quote-names" +
        " --skip-comments --skip-triggers " + db);
        InputStream in = run.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        temp = new StringBuffer();
        int count;
        char[] cbuf = new char[BUFFER];
        while ((count = br.read(cbuf, 0, BUFFER)) != -1)
            temp.append(cbuf, 0, count);
        br.close();
        in.close();
        fichero = new FileWriter(file_backup);
        pw = new PrintWriter(fichero);                                                    
        pw.println(temp.toString());  
        ok=true;
   }
    catch (Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error!!\nSe produjo un problema al crear respaldo de base de datos:\n\n\t- Razon: no se ha encontrado un modulo externo \"mysqldump\"\n\tSolucion: Instale o reinstale xampp en servidor.");
    } finally {
       try {           
         if (null != fichero)
              fichero.close();
       } catch (Exception e2) {
           e2.printStackTrace();
           System.out.println("des");
       }
    }   
    return ok; 
 }
 public boolean backupforLinux(String host, String port, String user, String password, String db, String file_backup){
    boolean ok=false;
    try{
         Process run = Runtime.getRuntime().exec(
        "/opt/lampp/bin/mysqldump --host=" + host + " --port=" + port +
        " --user=" + user + " --password=" + password +
        " --compact --complete-insert --extended-insert --skip-quote-names" +
        " --skip-comments --skip-triggers " + db);
        InputStream in = run.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        temp = new StringBuffer();
        int count;
        char[] cbuf = new char[BUFFER];
        while ((count = br.read(cbuf, 0, BUFFER)) != -1)
            temp.append(cbuf, 0, count);
        br.close();
        in.close();
        fichero = new FileWriter(file_backup+".sql");
        pw = new PrintWriter(fichero);                                                    
        pw.println(temp.toString());  
        ok=true;
   }
    catch (Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error!!\nSe produjo un problema al crear respaldo de base de datos:\n\n\t- Razon: no se ha encontrado un modulo externo \"mysqldump\"\n\tSolucion: Instale o reinstale xampp en servidor.");
    } finally {
       try {           
         if (null != fichero)
              fichero.close();
              JOptionPane.showMessageDialog(null, "El respaldo se ha creado con exito.");
       } catch (Exception e2) {
           e2.printStackTrace();
       }
    }   
    return ok; 
 }
 
}