/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package paqueteturistico.vista;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import paqueteturistico.control.ClienteData;
import paqueteturistico.modelo.Cliente;
import paqueteturistico.modelo.Conexion;

/**
 *
 * @author user
 */
public class ClientesVista extends javax.swing.JInternalFrame {

     private ArrayList <Cliente> listaClientes=new ArrayList<>();
     private ClienteData clienteData=null;
     private Conexion conexion=null;
     private Cliente cl= new Cliente();
     
     public ClientesVista() {
         try {
             conexion= new Conexion();
             clienteData=new ClienteData(conexion);
             
         } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(jtDni, "error en la conexion vista"+ex);
         }
        initComponents();
    }
public void cargarCLientes(){
    listaClientes=(ArrayList<Cliente>) clienteData.buscarClientes();
       jcCliente.removeAllItems();
      for(Cliente i: listaClientes){
          cl=i;
          jcCliente.addItem(cl);
       }
}
    private void desactivartodo(){
        jtNombre.setEnabled(false);
        jtMail.setEnabled(false);
        jtDni.setEnabled(false);
        jtTelefono.setEnabled(false);
        jchActivo.setEnabled(false);
        jcCliente.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbBorrar.setEnabled(false);
    }
    private void reset(){
        jtNombre.setText("");
            jtMail.setText("");
            jtDni.setText("");
            jtTelefono.setText("");
            jchActivo.setSelected(false);
            jcCliente.setSelectedItem(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcCliente = new javax.swing.JComboBox<>();
        jchActivo = new javax.swing.JCheckBox();
        jtTelefono = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtMail = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jrBorrar = new javax.swing.JRadioButton();
        jrEditar = new javax.swing.JRadioButton();
        jrNuevo = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        jLabel1.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Nombre Completo :");

        jLabel3.setText("email :");

        jLabel4.setText("DNI :");

        jLabel5.setText("Telefono :");

        jLabel6.setText("Activo :");

        jLabel8.setText("Cliente :");

        jcCliente.setEnabled(false);
        jcCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcClienteItemStateChanged(evt);
            }
        });

        jchActivo.setEnabled(false);

        jtTelefono.setEnabled(false);
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });

        jtDni.setEnabled(false);
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jtMail.setEnabled(false);
        jtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMailKeyReleased(evt);
            }
        });

        jtNombre.setEnabled(false);
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcCliente, 0, 188, Short.MAX_VALUE)
                    .addComponent(jtNombre)
                    .addComponent(jtMail)
                    .addComponent(jtDni)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jchActivo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtTelefono))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jchActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel7.setText("Accion:");

        jrBorrar.setBackground(new java.awt.Color(153, 255, 153));
        buttonGroup1.add(jrBorrar);
        jrBorrar.setText("Borrar");
        jrBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBorrarActionPerformed(evt);
            }
        });

        jrEditar.setBackground(new java.awt.Color(153, 255, 153));
        buttonGroup1.add(jrEditar);
        jrEditar.setText("Editar");
        jrEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditarActionPerformed(evt);
            }
        });

        jrNuevo.setBackground(new java.awt.Color(153, 255, 153));
        buttonGroup1.add(jrNuevo);
        jrNuevo.setText("Nuevo");
        jrNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrEditar)
                    .addComponent(jrBorrar)
                    .addComponent(jrNuevo))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jrBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jrNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrEditar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jbBorrar)
                .addGap(26, 26, 26)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBorrar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBorrarActionPerformed
        //primera parte borrar
         
        if (jrBorrar.isSelected()){
           reset(); 
          cargarCLientes();
            desactivartodo();
          
          jcCliente.setEnabled(true);
        } 
    }//GEN-LAST:event_jrBorrarActionPerformed

    private void jrNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNuevoActionPerformed
       //primera parte nuevo
        if (jrNuevo.isSelected()){
             reset();
           desactivartodo();
           jtNombre.setEnabled(true);
       }
    }//GEN-LAST:event_jrNuevoActionPerformed

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
       //segunda parte nuevo
        if (jrNuevo.isSelected()&&jtNombre.getText().length()!=0){
            jtMail.setEnabled(true);
        }
        else if(jrNuevo.isSelected()&&jtNombre.getText().length()==0){
             desactivartodo();
             jtNombre.setEnabled(true);
        }
    }//GEN-LAST:event_jtNombreKeyReleased

    private void jtMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMailKeyReleased
       //tercer parte nuevo
       if (jrNuevo.isSelected()&&jtMail.getText().length()!=0){
           jtDni.setEnabled(true);
       }
       else if(jrNuevo.isSelected()&&jtMail.getText().length()==0){
           desactivartodo();
             jtNombre.setEnabled(true);
             jtMail.setEnabled(true);
       }
    }//GEN-LAST:event_jtMailKeyReleased

    private void jtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyReleased
        //cuarto paso Nuevo
        if (jrNuevo.isSelected()&&jtDni.getText().length()!=0){
            jtTelefono.setEnabled(true);
        }
        else if(jrNuevo.isSelected()&&jtDni.getText().length()==0){
             desactivartodo();
             jtNombre.setEnabled(true);
             jtMail.setEnabled(true);
             jtDni.setEnabled(true);
        }
    }//GEN-LAST:event_jtDniKeyReleased

    private void jtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyReleased
       //quinta parte Nuevo
       if (jrNuevo.isSelected()&&jtTelefono.getText().length()!=0){
           jchActivo.setEnabled(true);
           jbGuardar.setEnabled(true);
       }
       else if(jrNuevo.isSelected()&&jtTelefono.getText().length()==0){
             desactivartodo();
             jtNombre.setEnabled(true);
             jtMail.setEnabled(true);
             jtDni.setEnabled(true);
             jtTelefono.setEnabled(true);
       }
    }//GEN-LAST:event_jtTelefonoKeyReleased

    private void jcClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcClienteItemStateChanged
        
        if (jrBorrar.isSelected()&&jcCliente.getSelectedItem()!="0"){
            jbBorrar.setEnabled(true);
        }
        else if(jrBorrar.isSelected()){
            jbBorrar.setEnabled(false);
        }
      //segunda parte Editar
      if (jrEditar.isSelected()&&jcCliente.getSelectedItem()!="0"){
            cl=(Cliente) jcCliente.getSelectedItem();
            String numero=""+cl.getTelefono();
            String dn=""+cl.getDni();
             jtNombre.setEnabled(true);
             jtMail.setEnabled(true);
             jtDni.setEnabled(true);
             jtTelefono.setEnabled(true);
             jchActivo.setEnabled(true);
             jbGuardar.setEnabled(true);
            jtNombre.setText(cl.getNombreCompleto());
            jtMail.setText(cl.getEmail());
            jtDni.setText(dn);
            jtTelefono.setText(numero);
            jchActivo.setSelected(cl.isActivo());
      }
    }//GEN-LAST:event_jcClienteItemStateChanged

    private void jrEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditarActionPerformed
        cargarCLientes();
        if (jrEditar.isSelected()){
            desactivartodo();
            jcCliente.setEnabled(true);
        }
    }//GEN-LAST:event_jrEditarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
       if(jrBorrar.isSelected()){
           cl=(Cliente) jcCliente.getSelectedItem();
           clienteData.borrarCliente( cl.getIdCliente());
           desactivartodo();
           jcCliente.setEnabled(true);
       }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       if (jrNuevo.isSelected()){
           long telefono=Long.parseLong(jtTelefono.getText());
           long dni=Long.parseLong(jtDni.getText());
           cl.setNombreCompleto(jtNombre.getText());
           cl.setEmail(jtMail.getText());
           cl.setDni(dni);
           cl.setTelefono(telefono);
           clienteData.guardarCliente(cl);
           reset();
       }
       if (jrEditar.isSelected()){
           cl=(Cliente) jcCliente.getSelectedItem();
           long telefono=Long.parseLong(jtTelefono.getText());
           long dni=Long.parseLong(jtDni.getText());
           boolean ac=jchActivo.isSelected();
           cl.setActivo(ac);
           cl.setNombreCompleto(jtNombre.getText());
           cl.setEmail(jtMail.getText());
           cl.setDni(dni);
           cl.setTelefono(telefono);
           clienteData.actualizarCliente(cl);
           reset();
       }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
       char c = evt.getKeyChar();
 if ((c<'a'||c>'z')&&(c<'A'||c>'Z')&& c !=KeyEvent.VK_SPACE){
     evt.consume();}
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
       char c = evt.getKeyChar();
 if (c<'0'||c>'9'){ evt.consume();}
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
        char c = evt.getKeyChar();
 if (c<'0'||c>'9') {evt.consume();}
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Cliente> jcCliente;
    private javax.swing.JCheckBox jchActivo;
    private javax.swing.JRadioButton jrBorrar;
    private javax.swing.JRadioButton jrEditar;
    private javax.swing.JRadioButton jrNuevo;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtMail;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
