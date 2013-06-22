package Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Log {
    FileWriter archivo;
    public void crearLog(String dat) throws IOException {
        if (new File("log1.txt").exists()==false){archivo=new FileWriter(new File("log1.txt"),false);}
             archivo = new FileWriter(new File("log1.txt"), true);
             Date dh=new Date();
             archivo.write(dh+": "+dat+"\n");
             archivo.close();
     }
}

