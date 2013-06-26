package GUIRecursosHumanos;

/**
 * @author cepardov <cepardov@gmail.com>
 */

import Sistema.sistema;
import Login.Login;
import java.io.IOException;
import java.util.logging.*;

public class Menu extends javax.swing.JFrame {
    sistema sis=new sistema();
    Login l=new Login();
    String usuario,clave;
    String a=null;
    String rutid=null;
    String nom=null;
    String pat=null;
    String mat=null;
    String dir=null;
    String tel=null;
    String priv=null;
  
    public Menu() {
        initComponents();
    }
 
   public Menu(int valor, String tipo, String id, String nombre, String paterno, String materno, String direccion, String telefono) {
        initComponents();
        a = "("+tipo+"): ["+id+"] "+nombre+" "+paterno+" "+materno;
        rutid = id;
        nom = nombre;
        pat = paterno;
        mat = materno;
        dir = direccion;
        tel = telefono;
        priv = tipo;
        this.txtapp.setText(sis.getAppName()+" V"+sis.getAppVersion());
         if(valor==1){
             this.btnuser.setText(nombre+" "+paterno);
             this.btnclave.setEnabled(true);
             this.btnlistausuario.setEnabled(true);
             this.btnsucesos.setEnabled(true);
         }
         else if(valor==2){
             this.btnuser.setText(nombre+" "+paterno);
         }
         else if(valor==3){
             this.btnuser.setText(nombre+" "+paterno);
             this.btncreartrabajador.setEnabled(false);
             this.btnvercontrato.setEnabled(false);
         }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p = new javax.swing.JDesktopPane();
        txtapp = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnuser = new javax.swing.JMenu();
        btnclave = new javax.swing.JMenuItem();
        btneditdatos = new javax.swing.JMenuItem();
        btnadministrativo = new javax.swing.JMenu();
        btnlistausuario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btncerrarsesion = new javax.swing.JMenuItem();
        btnsalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        btnaddcontrato = new javax.swing.JMenuItem();
        btnaddfiniquito = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        btnmantenedores = new javax.swing.JMenu();
        btndelcontrato = new javax.swing.JMenuItem();
        btndelfiniquito = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btncreartrabajador = new javax.swing.JMenuItem();
        btncargo = new javax.swing.JMenuItem();
        btnvercontrato = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnverLiquidacion = new javax.swing.JMenuItem();
        btnverContrato = new javax.swing.JMenuItem();
        btnverFiniquito = new javax.swing.JMenuItem();
        btnverEmpleados = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        btngraficos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        actualizarprevision = new javax.swing.JMenuItem();
        actualizasalud = new javax.swing.JMenuItem();
        actualizarparametros = new javax.swing.JMenuItem();
        actualizarasignacion = new javax.swing.JMenuItem();
        btnayuda = new javax.swing.JMenu();
        btnsucesos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnacerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        p.setBackground(new java.awt.Color(161, 161, 161));

        txtapp.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtapp.setForeground(new java.awt.Color(254, 254, 254));
        txtapp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtapp.setText("Aplicación");
        txtapp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtapp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtapp.setBounds(320, 400, 680, 180);
        p.add(txtapp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/user.png"))); // NOI18N
        btnuser.setText("Usuario");

        btnclave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/changeclv.png"))); // NOI18N
        btnclave.setText("Cambiar Clave");
        btnclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclaveActionPerformed(evt);
            }
        });
        btnuser.add(btnclave);

        btneditdatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/Edit-icon.png"))); // NOI18N
        btneditdatos.setText("Editar datos");
        btneditdatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditdatosActionPerformed(evt);
            }
        });
        btnuser.add(btneditdatos);

        btnadministrativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/admin.png"))); // NOI18N
        btnadministrativo.setText("Administrativo");

        btnlistausuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/Users-icon.png"))); // NOI18N
        btnlistausuario.setText("Mantenedor de Usuarios");
        btnlistausuario.setEnabled(false);
        btnlistausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistausuarioActionPerformed(evt);
            }
        });
        btnadministrativo.add(btnlistausuario);

        jMenuItem1.setText("Opciones de Base de Datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btnadministrativo.add(jMenuItem1);

        btnuser.add(btnadministrativo);
        btnuser.add(jSeparator2);

        btncerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/logout.png"))); // NOI18N
        btncerrarsesion.setText("Cerrar Sesión");
        btncerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsesionActionPerformed(evt);
            }
        });
        btnuser.add(btncerrarsesion);

        btnsalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/salir.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        btnuser.add(btnsalir);

        jMenuBar1.add(btnuser);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/btnremuneraciones.png"))); // NOI18N
        jMenu2.setText("Remuneraciones");

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/Add-icon.png"))); // NOI18N
        jMenu5.setText("Nuevo");

        btnaddcontrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/File-add-icon.png"))); // NOI18N
        btnaddcontrato.setText("Contrato");
        btnaddcontrato.setEnabled(false);
        jMenu5.add(btnaddcontrato);

        btnaddfiniquito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/File-add-icon.png"))); // NOI18N
        btnaddfiniquito.setText("Finiquito");
        btnaddfiniquito.setEnabled(false);
        jMenu5.add(btnaddfiniquito);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/File-add-icon.png"))); // NOI18N
        jMenuItem3.setText("Liquidación");
        jMenuItem3.setEnabled(false);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenu2.add(jMenu5);

        btnmantenedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/File-icon.png"))); // NOI18N
        btnmantenedores.setText("Mantenedor");

        btndelcontrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/File-edit-icon.png"))); // NOI18N
        btndelcontrato.setText("Contrato");
        btndelcontrato.setEnabled(false);
        btnmantenedores.add(btndelcontrato);

        btndelfiniquito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/File-edit-icon.png"))); // NOI18N
        btndelfiniquito.setText("Finiquito");
        btndelfiniquito.setEnabled(false);
        btnmantenedores.add(btndelfiniquito);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/File-edit-icon.png"))); // NOI18N
        jMenuItem4.setText("Liquidación");
        jMenuItem4.setEnabled(false);
        btnmantenedores.add(jMenuItem4);

        jMenu2.add(btnmantenedores);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/btncrear.png"))); // NOI18N
        jMenu4.setText("Crear");

        btncreartrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/User-icon.png"))); // NOI18N
        btncreartrabajador.setText("Crear Trabajador");
        btncreartrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreartrabajadorActionPerformed(evt);
            }
        });
        jMenu4.add(btncreartrabajador);

        btncargo.setText("Gestor de cargos");
        btncargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargoActionPerformed(evt);
            }
        });
        jMenu4.add(btncargo);

        btnvercontrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/contrat-view.png"))); // NOI18N
        btnvercontrato.setText("Ver Contrato");
        btnvercontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvercontratoActionPerformed(evt);
            }
        });
        jMenu4.add(btnvercontrato);

        jMenuBar1.add(jMenu4);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/Eye-icon.png"))); // NOI18N
        jMenu3.setText("Ver");

        btnverLiquidacion.setText("Liquidación");
        btnverLiquidacion.setEnabled(false);
        jMenu3.add(btnverLiquidacion);

        btnverContrato.setText("Contrato");
        btnverContrato.setEnabled(false);
        btnverContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverContratoActionPerformed(evt);
            }
        });
        jMenu3.add(btnverContrato);

        btnverFiniquito.setText("Finiquito");
        btnverFiniquito.setEnabled(false);
        jMenu3.add(btnverFiniquito);

        btnverEmpleados.setText("Lista Empleados");
        btnverEmpleados.setEnabled(false);
        jMenu3.add(btnverEmpleados);

        jMenu6.setText("Otros");

        btngraficos.setText("Graficos");
        btngraficos.setEnabled(false);
        jMenu6.add(btngraficos);

        jMenu3.add(jMenu6);

        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/application-settings-icon.png"))); // NOI18N
        jMenu1.setText("Actualizar datos");

        actualizarprevision.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        actualizarprevision.setText("Actualizar datos Prevision");
        actualizarprevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarprevisionActionPerformed(evt);
            }
        });
        jMenu1.add(actualizarprevision);

        actualizasalud.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        actualizasalud.setText("Actualizar datos Salud");
        actualizasalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizasaludActionPerformed(evt);
            }
        });
        jMenu1.add(actualizasalud);

        actualizarparametros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        actualizarparametros.setText("Actualizar datos Parametros");
        actualizarparametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarparametrosActionPerformed(evt);
            }
        });
        jMenu1.add(actualizarparametros);

        actualizarasignacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        actualizarasignacion.setText("Actualizar Asignacion");
        actualizarasignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarasignacionActionPerformed(evt);
            }
        });
        jMenu1.add(actualizarasignacion);

        jMenuBar1.add(jMenu1);

        btnayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/question-faq-icon.png"))); // NOI18N
        btnayuda.setText("Ayuda");
        btnayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnayudaMouseClicked(evt);
            }
        });
        btnayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnayudaActionPerformed(evt);
            }
        });

        btnsucesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/log.png"))); // NOI18N
        btnsucesos.setText("Ver Log de sistema");
        btnsucesos.setEnabled(false);
        btnsucesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsucesosActionPerformed(evt);
            }
        });
        btnayuda.add(btnsucesos);
        btnayuda.add(jSeparator1);

        btnacerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Img/Info-icon.png"))); // NOI18N
        btnacerca.setText("Acerca de..");
        btnacerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacercaActionPerformed(evt);
            }
        });
        btnayuda.add(btnacerca);

        jMenuBar1.add(btnayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsesionActionPerformed
        try {
            // TODO add your handling code here:
            l.ad("Cierre de sesión: "+a);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncerrarsesionActionPerformed

    private void btnclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclaveActionPerformed
        // TODO add your handling code here:
        editarclave ec=new editarclave(rutid);
        p.add(ec);
        ec.show();
    }//GEN-LAST:event_btnclaveActionPerformed

    private void btnlistausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistausuarioActionPerformed
        // TODO add your handling code here:
        usuariosistema us=new usuariosistema();
        p.add(us);
        us.show();
    }//GEN-LAST:event_btnlistausuarioActionPerformed

    private void btnayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnayudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnayudaActionPerformed

    private void btnayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnayudaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnayudaMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        try {
            // TODO add your handling code here:
            l.ad("Cierre de sesión [Salir]: "+a);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnacercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacercaActionPerformed
        // TODO add your handling code here:
        aboutbox ab=new aboutbox();
        ab.setTitle("Acerca de "+sis.getAppName()+" "+sis.getAppVersion());
        ab.setLocationRelativeTo(null);
        ab.setVisible(true);
    }//GEN-LAST:event_btnacercaActionPerformed

    private void btnsucesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsucesosActionPerformed
        // TODO add your handling code here:
        logsis ls=new logsis();
        ls.setTitle("Log de sistema");
        p.add(ls);
        ls.show();
    }//GEN-LAST:event_btnsucesosActionPerformed


    private void actualizasaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizasaludActionPerformed
        IngresoSalud is=new IngresoSalud();
        p.add(is);
        is.show();
    }//GEN-LAST:event_actualizasaludActionPerformed

    private void actualizarprevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarprevisionActionPerformed
        IngresoPrevision ip=new IngresoPrevision();
        p.add(ip);
        ip.show();
    }//GEN-LAST:event_actualizarprevisionActionPerformed

    private void actualizarparametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarparametrosActionPerformed
        IngresoParametro ipa=new IngresoParametro();
        p.add(ipa);
        ipa.show();
    }//GEN-LAST:event_actualizarparametrosActionPerformed

    private void actualizarasignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarasignacionActionPerformed
        Edicionasignacion ed=new Edicionasignacion();
        p.add(ed);
        ed.show();
    }//GEN-LAST:event_actualizarasignacionActionPerformed


    private void btneditdatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditdatosActionPerformed
        // TODO add your handling code here:
        editardato ed=new editardato(rutid, nom, pat, mat, dir, tel);
        ed.setTitle("Editar Información Personal");
        p.add(ed);
        ed.show();
    }//GEN-LAST:event_btneditdatosActionPerformed

    private void btncreartrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreartrabajadorActionPerformed
        ingresoTrabajador it=new ingresoTrabajador(rutid, nom, pat, mat, priv);
        p.add(it);
        it.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_btncreartrabajadorActionPerformed

    private void btnverContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverContratoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btnverContratoActionPerformed

    private void btnvercontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvercontratoActionPerformed
        VistaContrato vc=new VistaContrato();
        vc.setTitle("Vista Contratos");
        vc.setLocationRelativeTo(null);
        vc.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvercontratoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Liquidacion liq=new Liquidacion();
        p.add(liq);
        liq.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       adminTools at=new adminTools();
       at.setTitle("Opciones del Administrador");
       p.add(at);
       at.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btncargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargoActionPerformed
        // TODO add your handling code here:
        crearCargo cc=new crearCargo();
        cc.setTitle("Gestor de cargos");
        p.add(cc);
        cc.show();
    }//GEN-LAST:event_btncargoActionPerformed


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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                
             
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarasignacion;
    private javax.swing.JMenuItem actualizarparametros;
    private javax.swing.JMenuItem actualizarprevision;
    private javax.swing.JMenuItem actualizasalud;
    private javax.swing.JMenuItem btnacerca;
    private javax.swing.JMenuItem btnaddcontrato;
    private javax.swing.JMenuItem btnaddfiniquito;
    private javax.swing.JMenu btnadministrativo;
    private javax.swing.JMenu btnayuda;
    private javax.swing.JMenuItem btncargo;
    private javax.swing.JMenuItem btncerrarsesion;
    private javax.swing.JMenuItem btnclave;
    private javax.swing.JMenuItem btncreartrabajador;
    private javax.swing.JMenuItem btndelcontrato;
    private javax.swing.JMenuItem btndelfiniquito;
    private javax.swing.JMenuItem btneditdatos;
    private javax.swing.JMenuItem btngraficos;
    private javax.swing.JMenuItem btnlistausuario;
    private javax.swing.JMenu btnmantenedores;
    private javax.swing.JMenuItem btnsalir;
    private javax.swing.JMenuItem btnsucesos;
    private javax.swing.JMenu btnuser;
    private javax.swing.JMenuItem btnverContrato;
    private javax.swing.JMenuItem btnverEmpleados;
    private javax.swing.JMenuItem btnverFiniquito;
    private javax.swing.JMenuItem btnverLiquidacion;
    private javax.swing.JMenuItem btnvercontrato;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JDesktopPane p;
    private javax.swing.JLabel txtapp;
    // End of variables declaration//GEN-END:variables

}
