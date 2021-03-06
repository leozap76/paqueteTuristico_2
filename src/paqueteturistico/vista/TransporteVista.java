/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package paqueteturistico.vista;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import paqueteturistico.control.DestinoData;
import paqueteturistico.control.TransporteData;
import paqueteturistico.modelo.Conexion;
import paqueteturistico.modelo.Destino;
import paqueteturistico.modelo.Transporte;

/**
 *
 * @author user
 */
public class TransporteVista extends javax.swing.JInternalFrame {
    private ArrayList <Destino> listaDestinos=null;
    private List <Transporte> listaTransporte=new ArrayList<>(); 
    private TransporteData transporteData=null;
    private DestinoData destinoData=null;
    private Conexion conexion=null;
    private Destino destino=null;
    private Transporte tr= new Transporte();
    /**
     * Creates new form TransporteVista
     */
    public TransporteVista() {
        try {
            conexion =new Conexion();
            destinoData= new DestinoData(conexion);
            transporteData= new TransporteData(conexion);
            listaDestinos=(ArrayList<Destino>) destinoData.obtenerDestinos();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this,  "error en el constructor al inicializar conexion"+ex);
        }
        initComponents();
        cargardestinos();
    }
public void cargardestinos(){
      for(Destino i: listaDestinos){
          destino=i;
          jcDestino.addItem(destino);
       }
}
public void cargarTransporte(Destino dest){
      jcTransporte.removeAllItems();
    for(Transporte i:  transporteData.obtenerTransportesXDestino(dest.getIdDestino())){
         
        Transporte transporte= new Transporte();
           transporte=i;
          jcTransporte.addItem(transporte);
       }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbBorrar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jcDestino = new javax.swing.JComboBox<>();
        jcTransporte = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jchActivo = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jrBorrar = new javax.swing.JRadioButton();
        jrNuevo = new javax.swing.JRadioButton();
        jrEditar = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jbBorrar.setText("Borrar");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
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

        jLabel1.setText("Tipo de Transporte :");

        jLabel2.setText("Precio Viaje :");

        jLabel3.setText("Destino :");

        jLabel4.setText("Activo :");

        jtPrecio.setEnabled(false);
        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });

        jcDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcDestino.setEnabled(false);
        jcDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcDestinoItemStateChanged(evt);
            }
        });

        jcTransporte.setEnabled(false);
        jcTransporte.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcTransporteItemStateChanged(evt);
            }
        });

        jLabel6.setText("Transporte :");

        jchActivo.setText("Activo");
        jchActivo.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jchActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcTransporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jcDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jchActivo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Accion :");

        jrBorrar.setBackground(new java.awt.Color(153, 255, 153));
        buttonGroup1.add(jrBorrar);
        jrBorrar.setText("borrar");
        jrBorrar.setBorder(null);
        jrBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBorrarActionPerformed(evt);
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

        jrEditar.setBackground(new java.awt.Color(153, 255, 153));
        buttonGroup1.add(jrEditar);
        jrEditar.setText("Editar");
        jrEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrEditar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrBorrar)
                            .addComponent(jrNuevo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jrBorrar)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditar))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 104, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jbBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbBorrar)
                            .addComponent(jbGuardar))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel7.setText("Transporte");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBorrarActionPerformed
        
           borrar();
       
    }//GEN-LAST:event_jrBorrarActionPerformed

    private void jrNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNuevoActionPerformed
       
             nuevo();
       
    }//GEN-LAST:event_jrNuevoActionPerformed

    private void jrEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditarActionPerformed
            editar();
    }//GEN-LAST:event_jrEditarActionPerformed

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
 char c = evt.getKeyChar();
 if ((c<'a'||c>'z')&&(c<'A'||c>'Z')){
     evt.consume();
 }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
      char c = evt.getKeyChar();
 if (c<'0'||c>'9') evt.consume();
 
    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jcDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcDestinoItemStateChanged
       destino=(Destino) jcDestino.getSelectedItem();
      //primer paso borrar
       if (jrBorrar.isSelected()&& jcDestino.getSelectedItem()!=null){
          jcTransporte.setEnabled(true);
           cargarTransporte(destino);
       }
       //tercer paso nuevo pasa a guardar:
       if (jrNuevo.isSelected()&&jcDestino.getSelectedItem()!=null){
           jbGuardar.setEnabled(true);
       }
       //prime paso editar:
       if (jrEditar.isSelected()&& jcDestino.getSelectedItem()!=null){
           jcTransporte.setEnabled(true);
           cargarTransporte(destino);
       }
       
    }//GEN-LAST:event_jcDestinoItemStateChanged

    private void jcTransporteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcTransporteItemStateChanged
      //segundo paso borrar
        if (jrBorrar.isSelected()&&jcTransporte.getSelectedItem()!=null){
          jbBorrar.setEnabled(true);
          }
        //segundo paso editar:
        if (jrEditar.isSelected()&&jcTransporte.getSelectedItem()!=null){
            Transporte transporte=(Transporte) jcTransporte.getSelectedItem() ;
            String precio=""+transporte.getPrecioViaje();
            jtNombre.setEnabled(true);
            jtNombre.setText(transporte.getTipoTransporte());
            jtPrecio.setEnabled(true);
            jtPrecio.setText(precio);
            jchActivo.setEnabled(true);
            jchActivo.setSelected(transporte.isActivo());
            jbGuardar.setEnabled(true);
            tr.setIdTransporte(transporte.getIdTransporte());
            }
      
    }//GEN-LAST:event_jcTransporteItemStateChanged
private void nuevo(){
    reset();
           jbBorrar.setEnabled(false);
           jcTransporte.setEnabled(false);
           jbGuardar.setEnabled(false);
           jtNombre.setEnabled(true);
           jtPrecio.setEnabled(false);
           jcDestino.setEnabled(false);
           jchActivo.setEnabled(true);
}
private void borrar(){
    reset();
           jbGuardar.setEnabled(false);
           jtNombre.setEnabled(false);
           jtPrecio.setEnabled(false);
           jcDestino.setEnabled(true);
           jchActivo.setEnabled(false);
           jbBorrar.setEnabled(false);
           jcTransporte.setEnabled(false);
    
}
private void editar(){
    reset();
    jbGuardar.setEnabled(false);
           jtNombre.setEnabled(false);
           jtPrecio.setEnabled(false);
           jcDestino.setEnabled(true);
           jchActivo.setEnabled(false);
           jbBorrar.setEnabled(false);
           jcTransporte.setEnabled(false);
}
    private void reset(){
    jtNombre.setText("");
     jtPrecio.setText("");
    jchActivo.setSelected(false);
    jcDestino.setSelectedItem(null);
    jcTransporte.setSelectedItem(null);
    
}
    private void jtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyReleased
     //segundo paso Nuevo pasa a destino:
        if((jrNuevo.isSelected())&&(Integer.parseInt(jtPrecio.getText())>0)){
         jcDestino.setEnabled(true);
         
     }
    }//GEN-LAST:event_jtPrecioKeyReleased

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
   //primer paso agregar pasa al precio:
        if (jrNuevo.isSelected()&&jtNombre.getText()!=""){
       jtPrecio.setEnabled(true);   
   }       
    }//GEN-LAST:event_jtNombreKeyReleased

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
     // terccer paso borrar
        Transporte transporte= new Transporte();
           transporte=(Transporte) jcTransporte.getSelectedItem();
        transporteData.borrarDefinitivo(transporte.getIdTransporte());
        reset();
        borrar();
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
    //cuarto paso Nuevo termina:
    if (jrNuevo.isSelected()){
        Transporte transporte= new Transporte();
        transporte.setTipoTransporte(jtNombre.getText());
        transporte.setPrecioViaje(Integer.parseInt(jtPrecio.getText()));
        transporte.setDestino((Destino) jcDestino.getSelectedItem());
        transporte.setActivo(jchActivo.isSelected());
        transporteData.guardarTransporte(transporte);
        reset();
        nuevo();
       }
    //tercer paso Editar final:
    if (jrEditar.isSelected()&&jtNombre.getText()!=""&&(Integer.parseInt(jtPrecio.getText())>0)&&jcTransporte.getSelectedItem()!=null){
        
        tr.setTipoTransporte(jtNombre.getText());
        tr.setPrecioViaje(Integer.parseInt(jtPrecio.getText()));
        tr.setDestino((Destino) jcDestino.getSelectedItem());
        tr.setActivo(jchActivo.isSelected());
        transporteData.guardarTransporte(tr);
         reset();
         editar();
    }
    
    }//GEN-LAST:event_jbGuardarActionPerformed

private void activarEditar(){
     jbBorrar.setEnabled(false);
           jcTransporte.setEnabled(false);
           jbGuardar.setEnabled(false);
           jtNombre.setEnabled(false);
           jtPrecio.setEnabled(false);
           jcDestino.setEnabled(true);
           jchActivo.setEnabled(false);  
}
private void activarBorrar(){
    jbGuardar.setEnabled(false);
           jtNombre.setEnabled(false);
           jtPrecio.setEnabled(false);
           jcDestino.setEnabled(true);
           jchActivo.setEnabled(false);
           jbBorrar.setEnabled(false);
           jcTransporte.setEnabled(true);
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<Destino> jcDestino;
    private javax.swing.JComboBox<Transporte> jcTransporte;
    private javax.swing.JCheckBox jchActivo;
    private javax.swing.JRadioButton jrBorrar;
    private javax.swing.JRadioButton jrEditar;
    private javax.swing.JRadioButton jrNuevo;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    // End of variables declaration//GEN-END:variables
}
