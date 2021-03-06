/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgVista;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Edierlargo
 */
public class JFrbliotecarios extends javax.swing.JFrame {

    /**
     * Creates new form JFrbliotecarios
     */
    public JFrbliotecarios() {
        initComponents();
        setLocationRelativeTo(null);
        //listar();
    
        java.util.Date fechaActual = new java.util.Date();
        java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd-MM-yyyy");
        lblfecha.setText(formato.format(fechaActual));
        
        // Se toma la hora y pone en la caja de texto
        Calendar cal1 = Calendar.getInstance();
        txthoras.setText(""+cal1.get(Calendar.HOUR)+":"+cal1.get(Calendar.MINUTE)+":"+cal1.get(Calendar.SECOND));
    }
    public void listar(){
        pkgModelo.clsDAObibliotecarios obj;
        obj=new pkgModelo.clsDAObibliotecarios();
        jTable1.setModel(obj.listar(jTable1));
    }
   public void borro(){
     txtapellido.setText("");
     txtcodigo.setText("");
     txtemail.setText("");
     txtnombre.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnagergar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jblhora = new javax.swing.JLabel();
        txthoras = new javax.swing.JTextField();
        jblnombre = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jblapellidos = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        lblfecha = new javax.swing.JLabel();
        jblcodigo = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE PERSONAL");

        jToolBar1.setRollover(true);

        btnagergar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edierlargo\\Music\\Iconos\\1432543365_application-vnd.ms-excel.png")); // NOI18N
        btnagergar.setText("REGISTRAR");
        btnagergar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagergarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnagergar);

        btnbuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edierlargo\\Music\\Iconos\\1432543223_search_b.png")); // NOI18N
        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnbuscar);

        btneliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edierlargo\\Music\\Iconos\\1432544990_edit-delete.png")); // NOI18N
        btneliminar.setText("ELINIMAR");
        btneliminar.setFocusable(false);
        btneliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btneliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btneliminar);

        btnmodificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edierlargo\\Music\\Iconos\\modificar.png")); // NOI18N
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnmodificar);

        btncerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edierlargo\\Music\\Iconos\\1432541838_Exit.png")); // NOI18N
        btncerrar.setText("CERRAR");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btncerrar);

        jblemail.setText("E-MAIL");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jblhora.setText("HORA");

        txthoras.setEnabled(false);
        txthoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthorasActionPerformed(evt);
            }
        });

        jblnombre.setText("NOMBRE");

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        jblapellidos.setText("APELLIDOS");

        jblcodigo.setText("CODIGO");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDOS", "E-MAIL", "HORA", "CODIGO"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(9, 9, 9))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblnombre)
                            .addComponent(jblcodigo)
                            .addComponent(jblapellidos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblhora)
                                .addGap(18, 18, 18)
                                .addComponent(txthoras, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jblemail)
                                .addGap(18, 18, 18)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
                        .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblcodigo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblnombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblapellidos))
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jblemail)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblhora)
                            .addComponent(txthoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txthorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthorasActionPerformed

    private void btnagergarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagergarActionPerformed
        // TODO add your handling code here:
        if (txtapellido.getText().isEmpty()&&txtcodigo.getText().isEmpty()&&txtemail.getText().isEmpty()&&txtnombre.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "CAMPOS VACIOS", "ERROR", JOptionPane.ERROR_MESSAGE);   
 
        
        
        }else{//el que me dice  si estan vacios
          if(txtnombre.getText().isEmpty()) {
         JOptionPane.showMessageDialog(null, "INGRESE SENOMBRE", "ERROR", JOptionPane.ERROR_MESSAGE);
          
              
          }else{ 
              if (txtcodigo.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "INGRESE CODIGO", "ERROR", JOptionPane.ERROR_MESSAGE);

              }else{
                  if (txtapellido.getText().isEmpty()){
                             JOptionPane.showMessageDialog(null, "INGRESE APELLIDOS", "ERROR", JOptionPane.ERROR_MESSAGE);

                      
                  }else{
                      if (txtemail.getText().isEmpty()){
                                 JOptionPane.showMessageDialog(null, "INGRESE E-MAIL ", "ERROR", JOptionPane.ERROR_MESSAGE);

                          
                      }else{
        pkgModelo.clsDAObibliotecarios obj;
        obj=new pkgModelo.clsDAObibliotecarios();
        obj.setCodigo(txtcodigo.getText());
        obj.setNom(txtnombre.getText());
        obj.setApe(txtapellido.getText());
        obj.setCo(txtemail.getText().toLowerCase());
        obj.setHora(txthoras.getText());
        if (obj.insertar() == true){
            JOptionPane.showMessageDialog(rootPane, "NO SE INSERTO");
            
        }
        else{
            
            listar();
            JOptionPane.showMessageDialog(rootPane, "REGISTRADO");
            borro();
        }
        }
        }
        }
        }
        }
    }//GEN-LAST:event_btnagergarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
         pkgModelo.clsDAObibliotecarios obj;
        obj=new pkgModelo.clsDAObibliotecarios();
        int fila=jTable1.getSelectedRow();
        if (fila != -1){
            String codigo=jTable1.getValueAt(fila, 0).toString();
            obj.setNom(codigo);
            obj.borrar();
            listar();
        }
        else{
                        JOptionPane.showMessageDialog(null, "SELECCIONE UNA COLUMNA PARA BORRAR", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistro().setVisible(true);
            }
        });
        this.dispose();
        
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        pkgModelo.clsDAObibliotecarios obj;
        obj=new pkgModelo.clsDAObibliotecarios();
        String de=JOptionPane.showInputDialog("INGRESE CODIGO ");
         obj.setCodigo(de);
         if (de.isEmpty()){
                         JOptionPane.showMessageDialog(null, "INGRESE CODIGO", "ERROR", JOptionPane.ERROR_MESSAGE);

         }else{
         java.util.ArrayList resu = new java.util.ArrayList();
         resu=obj.consultar();
         if (resu.size() == 0){
            JOptionPane.showMessageDialog(null, "NO EXISTE");
         }else{
             
            txtcodigo.setText(de);
            txtapellido.setText(resu.get(1).toString());
            txtemail.setText(resu.get(2).toString());
            txtnombre.setText(resu.get(0).toString());
           
        }
         }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        pkgModelo.clsDAObibliotecarios obj;
        obj=new pkgModelo.clsDAObibliotecarios();
        String de=JOptionPane.showInputDialog("INGRESE EL CODIGO");
        txtcodigo.setText(de);
        if (de.isEmpty()){
                        JOptionPane.showMessageDialog(null, "INGRESE CODIGO", "ERROR", JOptionPane.ERROR_MESSAGE);

        }else{
        obj.setCodigo(txtcodigo.getText());
        obj.setNom(txtnombre.getText());
        obj.setApe(txtapellido.getText());
        obj.setCo(txtemail.getText().toUpperCase());
        obj.setHora(txthoras.getText());
        if(obj.modificar() == false){
         listar();
            JOptionPane.showMessageDialog(rootPane, "SE MODIFICO");
            
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "NO SE PUDO MODIFICAR");
        }
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrbliotecarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrbliotecarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrbliotecarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrbliotecarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrbliotecarios().setVisible(true);
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagergar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel jblapellidos;
    private javax.swing.JLabel jblcodigo;
    private javax.swing.JLabel jblemail;
    private javax.swing.JLabel jblhora;
    private javax.swing.JLabel jblnombre;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoras;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
