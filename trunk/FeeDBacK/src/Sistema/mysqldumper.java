
package Sistema;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class mysqldumper {
    private int BUFFER = 10485760;
    private StringBuffer temp = null;
    private FileWriter  fichero = null;
    private PrintWriter pw = null;
    
 public boolean CrearBackup(String host, String port, String user, String password, String db, String file_backup){
    boolean ok=false;
    try{
         Process run = Runtime.getRuntime().exec(
        "mysqldump --host=" + host + " --port=" + port +
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
    } finally {
       try {           
         if (null != fichero)
              fichero.close();
       } catch (Exception e2) {
           e2.printStackTrace();
       }
    }   
    return ok; 
 }  
 
}