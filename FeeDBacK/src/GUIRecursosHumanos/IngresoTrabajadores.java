package GUIRecursosHumanos;
import basedatos.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

public class IngresoTrabajadores extends javax.swing.JInternalFrame {

    public IngresoTrabajadores() {
        initComponents();
        try{
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbsisremuneraciones", "root", "");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM prevision");
            while (rs.next()) {
                modeloCombo.addElement(rs.getObject("nombre"));
            }
            rs.close();
            this.cbprevision.setModel(modeloCombo);
        } catch (SQLException ex) {
            Logger.getLogger(IngresoTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IngresoTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbsisremuneraciones", "root", "");
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM salud");
            while (rs.next()) {
                modeloCombo.addElement(rs.getObject("nombre"));
            }
            rs.close();
            this.cbsalud.setModel(modeloCombo);
        } catch (SQLException ex) {
            Logger.getLogger(IngresoTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IngresoTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnok = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtrut = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtsueldobase = new javax.swing.JTextField();
        txtpaterno = new javax.swing.JTextField();
        txtmaterno = new javax.swing.JTextField();
        cbestado = new javax.swing.JComboBox();
        cbcargo = new javax.swing.JComboBox();
        txtcargasfamiliares = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtfono = new javax.swing.JTextField();
        cbcontrato = new javax.swing.JComboBox();
        cbsalud = new javax.swing.JComboBox();
        cbprevision = new javax.swing.JComboBox();
        cbdia = new javax.swing.JComboBox();
        cbmes = new javax.swing.JComboBox();
        txtaño = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Trabajador"));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Trabajador"));

        jLabel1.setText("Rut");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido Paterno");

        jLabel4.setText("Apellido Materno");

        jLabel11.setText("Sueldo Base");

        jLabel14.setText("Estado");

        jLabel5.setText("Cargo");

        jLabel16.setText("Telefono");

        jLabel10.setText("Num. Carga Fam");

        jLabel8.setText("Fecha Ingreso");

        jLabel9.setText("Tipo Contrato");

        jLabel12.setText("Direccion");

        jLabel6.setText("Salud");

        jLabel7.setText("Prevision");

        jLabel13.setText("Año");

        txtrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrutActionPerformed(evt);
            }
        });

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtsueldobase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsueldobaseActionPerformed(evt);
            }
        });

        cbestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "No Activo" }));

        cbcargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Recursos Humanos", "Empleado" }));
        cbcargo.setToolTipText("");

        cbcontrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Definido", "Indefinido" }));

        cbsalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsaludActionPerformed(evt);
            }
        });

        cbprevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbprevisionActionPerformed(evt);
            }
        });

        cbdia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbmes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        txtaño.setText("201");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel5))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtrut, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtnombre)
                            .addComponent(txtpaterno)
                            .addComponent(txtmaterno)
                            .addComponent(txtsueldobase, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbestado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cbcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12)
                                .addComponent(jLabel16)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdireccion)
                                    .addComponent(cbsalud, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbprevision, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbcontrato, 0, 113, Short.MAX_VALUE)
                                    .addComponent(txtcargasfamiliares)
                                    .addComponent(txtfono))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(cbdia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel16)
                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcargasfamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(txtpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(txtmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(txtsueldobase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbsalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel7)
                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbprevision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnok)
                    .addComponent(btnagregar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
      public void erase(){
            txtrut.setText("");
            txtcargasfamiliares.setText("");
            txtaño.setText("");
            txtnombre.setText("");
            txtpaterno.setText("");
            txtmaterno.setText("");
            txtsueldobase.setText("");
            txtfono.setText("");
            txtdireccion.setText("");
         }
    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void cbprevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbprevisionActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cbprevisionActionPerformed

    private void cbsaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsaludActionPerformed
        //aqui el codigo del cb para salud
        // TODO add your handling code here:
    }//GEN-LAST:event_cbsaludActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnokActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        String diaingreso = cbdia.getSelectedItem().toString();
        String mesin = cbmes.getSelectedItem().toString();
        int mesingreso;
        String añoingreso = txtaño.getText();
        if(mesin == "Enero"){
            mesingreso = 1;
        }
        else if(mesin == "Febrero"){
            mesingreso = 2;
        }
        else if(mesin == "Marzo"){
            mesingreso = 3;
        }
        else if(mesin == "Abril"){
            mesingreso = 4;
        }
        else if(mesin == "Mayo"){
            mesingreso = 5;
        }
        else if(mesin == "Junio"){
            mesingreso = 6;
        }
        else if(mesin == "Julio"){
            mesingreso = 7;
        }
        else if(mesin == "Agosto"){
            mesingreso = 8;
        }
        else if(mesin == "Septiembre"){
            mesingreso = 9;
        }
        else if(mesin == "Octubre"){
            mesingreso = 10;
        }
        else if(mesin == "Noviembre"){
            mesingreso = 11;
        }
        else{
            mesingreso = 12;
        }
        String Mesingreso = Integer.toString(mesingreso);
        String fechaingreso = diaingreso+"-"+Mesingreso+"-"+añoingreso;
        String rut=txtrut.getText();
        String cargafamiliares = txtcargasfamiliares.getText();
        String nombre=txtnombre.getText();
        String appaterno=txtpaterno.getText();
        String apmaterno=txtmaterno.getText();
        String prevision = cbprevision.getSelectedItem().toString();
        String salud = cbsalud.getSelectedItem().toString();
        String cargo= cbcargo.getSelectedItem().toString();
        int cargofinal;
        if (cargo == "Administrador"){
            cargofinal = 1;
        }
        else if (cargo == "Recursos Humanos"){
            cargofinal = 2;
        }
        else{
            cargofinal = 3;
        }
        String sb = txtsueldobase.getText();
        String tcontrato = cbcontrato.getSelectedItem().toString();
        String fono = txtfono.getText();
        String direccion = txtdireccion.getText();
        String estado = cbestado.getSelectedItem().toString();
        control c=new control();
        c.updateUsuarioComplete(rut, nombre, appaterno, apmaterno, cargofinal, salud, prevision, fechaingreso, tcontrato, cargafamiliares, sb, direccion, fono, estado);
        JOptionPane.showMessageDialog(this, "El usuario "+nombre+" "+appaterno+" se agregara a la base de datos.");
        this.erase();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrutActionPerformed

    private void txtsueldobaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsueldobaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsueldobaseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox cbcargo;
    private javax.swing.JComboBox cbcontrato;
    private javax.swing.JComboBox cbdia;
    private javax.swing.JComboBox cbestado;
    private javax.swing.JComboBox cbmes;
    private javax.swing.JComboBox cbprevision;
    private javax.swing.JComboBox cbsalud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtaño;
    private javax.swing.JTextField txtcargasfamiliares;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfono;
    private javax.swing.JTextField txtmaterno;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpaterno;
    private javax.swing.JTextField txtrut;
    private javax.swing.JTextField txtsueldobase;
    // End of variables declaration//GEN-END:variables
}
