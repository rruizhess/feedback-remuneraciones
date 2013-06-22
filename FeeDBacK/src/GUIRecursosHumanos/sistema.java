package GUIRecursosHumanos;
public class sistema {
     /***********************************************************
     * Aqui se epecifica los detalles de la aplicacion
     * como son la versión y fechas de compilación.
     * versiones manuales:
     * mayor: el software sufre grandes cambios y mejoras.
     * menor: el software sufre pequeños cambios y/o correcciones de errores.
     * micro: se aplica una corrección al software, y a su vez sufre pocos o ningún cambio.
     * fase: se indica si se encuentra en una fase de desarrollo que no sea la final o estable,
     * es decir, una fase inestable o en pruebas. Se suele indicar con un guion seguido de la
     * fase correspondiente en minúsculas, o un espacio seguido de la fase. Puede haber
     * varias versiones de una misma fase, para indicar el avance en el desarrollo
     * del software pero manteniendo la fase para indicar que todavía es inestable,
     * indicándose añadiendo un número al final del nombre de la fase que va incrementando
     * conforme se publiquen nuevas versiones de esta fase.
     * *********************************************************
     * mayor.menor: 1.2
     * mayor.menor.micro: 1.2.1
     * mayor.menor.fase (guion): 1.2-alpha
     * mayor.menor.fase (espacio): 1.2 Beta
     * mayor.menor.fase+versión fase (guion): 1.2-rc1
     * mayor.menor.fase+versión fase (espacio): 1.2 RC1
     * mayor.menor.micro.fase+versión fase (guion): 1.2.1-beta2
     * *********************************************************
     */
    String appName="Remuneraciones";
    String appVersion="1.5 rev5";
    String appFase="-alpha1";
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion+this.appFase;
    }
}
