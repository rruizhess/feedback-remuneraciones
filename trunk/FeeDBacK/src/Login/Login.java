package Login;

import GUIRecursosHumanos.Menu;
import Sistema.sistema;
import Logger.Log;
import basedatos.Usuario;
import java.io.IOException;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 * @author cepardov <cepardov@gmail.com>
 */

public class Login extends javax.swing.JFrame {
    sistema sis=new sistema();
    Log l=new Log();
    
    public Login() {
        initComponents();
        try {
            ad("Inicio aplicación: [Feedback] Version: "+sis.getAppVersion());
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        setLocationRelativeTo(null);
        this.txtversion.setText("Ver: "+sis.getAppVersion());
    }
    public void ad(String s) throws IOException{
       l.crearLog(s);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnentrar = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txtversion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RUT");

        jLabel2.setText("CONTRASEÑA");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/close.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/login.png"))); // NOI18N
        btnentrar.setText("Iniciar Sesión");
        btnentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnentrarMouseClicked(evt);
            }
        });
        btnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentrarActionPerformed(evt);
            }
        });

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        txtversion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtversion.setText("No disponible");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtversion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnentrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2)
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtversion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnentrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnentrarMouseClicked
    }//GEN-LAST:event_btnentrarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentrarActionPerformed
        // TODO add your handling code here:
        String user=this.txtUser.getText();
        String pass=this.txtPass.getText();
        String priv=null;
        Usuario u=new Usuario();
        u=u.verificarUsuario(user, pass);
        if(u==null){
            System.out.println("Error inicio de sesión");
            JOptionPane.showMessageDialog(this, "El nombre de usuario y/o contraseña no son validos.");
        }
        else if(u!=null){
                if(u.getCargo()==1){
                    priv="Administrador";
                    JOptionPane.showMessageDialog(this, "Bienvenido (a) "+u.getNombre()+" "+u.getPaterno()+". ("+priv+").");
                    Menu m=new Menu(u.getCargo(),priv,u.getRuttrabajador(),u.getNombre(),u.getPaterno(),u.getMaterno(),u.getDireccion(),u.getTelefono());
                    m.setTitle("Menu Principal - "+priv+" - Usuario: ["+u.getNombre()+" "+u.getPaterno()+" "+u.getMaterno()+"]");
                    try {
                        this.ad("Inicio de sesión ("+priv+"): ["+u.getRuttrabajador()+"] "+u.getNombre()+" "+u.getPaterno()+" "+u.getMaterno());
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    m.setLocationRelativeTo(null);
                    m.setVisible(true);
                    dispose();
                }
                else if(u.getCargo()==2){
                    priv="Secretario";
                    JOptionPane.showMessageDialog(this, "Bienvenido (a) "+u.getNombre()+" "+u.getPaterno()+". ("+priv+").");
                    Menu m=new Menu(u.getCargo(),priv,u.getRuttrabajador(),u.getNombre(),u.getPaterno(),u.getMaterno(),u.getDireccion(),u.getTelefono());
                    m.setTitle("Menu Principal - "+priv+" - Usuario: ["+u.getNombre()+" "+u.getPaterno()+" "+u.getMaterno()+"]");
                    try {
                        this.ad("Inicio de sesión ("+priv+"): ["+u.getRuttrabajador()+"] "+u.getNombre()+" "+u.getPaterno()+" "+u.getMaterno());
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    m.setLocationRelativeTo(null);
                    m.setVisible(true);
                    dispose();
                }
                else if(u.getCargo()==3){
                    priv="Empleado (a)";
                    JOptionPane.showMessageDialog(this, "Bienvenido (a) "+u.getNombre()+" "+u.getPaterno()+". ("+priv+").");
                    Menu m=new Menu(u.getCargo(),priv,u.getRuttrabajador(),u.getNombre(),u.getPaterno(),u.getMaterno(),u.getDireccion(),u.getTelefono());
                    m.setTitle("Menu Principal - "+priv+" - Usuario: ["+u.getNombre()+" "+u.getPaterno()+" "+u.getMaterno()+"]");
                    try {
                        this.ad("Inicio de sesión ("+priv+"): ["+u.getRuttrabajador()+"] "+u.getNombre()+" "+u.getPaterno()+" "+u.getMaterno());
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    m.setLocationRelativeTo(null);
                    m.setVisible(true);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Error de inicio de sesión: El tipo de usuario \""+u.getCargo()+"\" no tiene un area de trabajo creada.\nPor favor indique esta situación al administrador del sistema.");
                     try {
                        this.ad("¡ERROR!: [Inicio de sesion] el siguente tipo usuario \""+u.getRuttrabajador()+" "+u.getNombre()+" "+u.getPaterno()+"\" no tiene un area de\ntrabajo creada. Consulte con el Administrador del sistema.");
                    } catch (IOException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
    }//GEN-LAST:event_btnentrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnentrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel txtversion;
    // End of variables declaration//GEN-END:variables
}
