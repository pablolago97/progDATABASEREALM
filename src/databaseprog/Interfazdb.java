/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseprog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;








/**
 *
 * @author Pablo
 */
public class Interfazdb extends javax.swing.JFrame {

    /**
     * Creates new form Interfazdb
     */
    public Interfazdb() {
        initComponents();
        
        bloquear();
    }

    //METODOS
    public void limpiar() {
        textapellido.setText("");
        textdelito.setText("");
        textfech.setText("");
        textid.setText("");
        textnombre.setText("");
    }

    public void bloquear() {
        bañadir.setEnabled(false);
        bborrar.setEnabled(false);
        bmostrar.setEnabled(false);
        bnuevo.setEnabled(true);
        textapellido.setEnabled(false);
        textdelito.setEnabled(false);
        textfech.setEnabled(false);
        textid.setEnabled(false);
        textnombre.setEnabled(false);
    }
    
    public void bloquearNuevo(){
        bañadir.setEnabled(true);
        bborrar.setEnabled(false);
        bmostrar.setEnabled(false);
        bnuevo.setEnabled(false);
        textapellido.setEnabled(true);
        textdelito.setEnabled(true);
        textfech.setEnabled(true);
        textid.setEnabled(true);
        textnombre.setEnabled(true);
    }
    
    public void desbloquear() {
        bañadir.setEnabled(false);
        bborrar.setEnabled(true);
        bmostrar.setEnabled(true);
        bnuevo.setEnabled(true);
        textapellido.setEnabled(false);
        textdelito.setEnabled(false);
        textfech.setEnabled(false);
        textid.setEnabled(false);
        textnombre.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelid = new javax.swing.JLabel();
        labelapellido = new javax.swing.JLabel();
        labelnombre = new javax.swing.JLabel();
        labelfech = new javax.swing.JLabel();
        labeldelito = new javax.swing.JLabel();
        textid = new javax.swing.JTextField();
        textapellido = new javax.swing.JTextField();
        textnombre = new javax.swing.JTextField();
        textfech = new javax.swing.JTextField();
        bañadir = new javax.swing.JButton();
        bborrar = new javax.swing.JButton();
        bmostrar = new javax.swing.JButton();
        bnuevo = new javax.swing.JButton();
        textdelito = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelid.setText("Id del preso");

        labelapellido.setText("Apellido");

        labelnombre.setText("Nombre");

        labelfech.setText("Fecha de nacimiento");

        labeldelito.setText("Delito");

        textid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textidActionPerformed(evt);
            }
        });

        textapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textapellidoActionPerformed(evt);
            }
        });

        textnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnombreActionPerformed(evt);
            }
        });

        textfech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfechActionPerformed(evt);
            }
        });

        bañadir.setText("Añadir");
        bañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bañadirActionPerformed(evt);
            }
        });

        bborrar.setText("Borrar");
        bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bborrarActionPerformed(evt);
            }
        });

        bmostrar.setText("Mostrar");
        bmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmostrarActionPerformed(evt);
            }
        });

        bnuevo.setText("Nuevo");
        bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnuevoActionPerformed(evt);
            }
        });

        textdelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdelitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(bañadir)
                        .addGap(18, 18, 18)
                        .addComponent(bborrar)
                        .addGap(18, 18, 18)
                        .addComponent(bmostrar)
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelapellido)
                                    .addComponent(labelid)
                                    .addComponent(labelnombre))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textid)
                                    .addComponent(textapellido)
                                    .addComponent(textnombre)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelfech)
                                    .addComponent(labeldelito))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textfech, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(textdelito))))
                        .addGap(119, 119, 119))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelid)
                    .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelapellido)
                    .addComponent(textapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombre)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelfech)
                    .addComponent(textfech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeldelito)
                    .addComponent(textdelito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bañadir)
                    .addComponent(bborrar)
                    .addComponent(bmostrar)
                    .addComponent(bnuevo))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textidActionPerformed
        textid.transferFocus();
    }//GEN-LAST:event_textidActionPerformed

    private void textapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textapellidoActionPerformed
        textapellido.transferFocus();
    }//GEN-LAST:event_textapellidoActionPerformed

    private void textnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnombreActionPerformed
        textnombre.transferFocus();
    }//GEN-LAST:event_textnombreActionPerformed

    private void textfechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfechActionPerformed
        textfech.transferFocus();
    }//GEN-LAST:event_textfechActionPerformed

    private void textdelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdelitoActionPerformed
        textdelito.transferFocus();
    }//GEN-LAST:event_textdelitoActionPerformed

    private void bnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnuevoActionPerformed
        bloquearNuevo();
    }//GEN-LAST:event_bnuevoActionPerformed

    private void bañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bañadirActionPerformed
       
       limpiar();
       desbloquear();
       
       Connection cn = (Connection) new Conexion_database().conexion();  
       String IdPreso, Apellido, Nombre, Fecha_Nacimiento, Delito;
       String SQL = "";
       IdPreso=textid.getText();
       Apellido=textapellido.getText();
       Nombre=textnombre.getText();
       Fecha_Nacimiento=textfech.getText();
       Delito=textdelito.getText();
       SQL = "INSERT INTO Presos(IdPreso, Apellido, Nombre, Fecha_Nacimiento, Delito) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(SQL);
            pst.setString(1,IdPreso);
            pst.setString(2,Apellido);
            pst.setString(3,Nombre);
            pst.setString(4,Fecha_Nacimiento);
            pst.setString(5,Delito);
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null, "Registro guardado con éxito :)");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Interfazdb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bañadirActionPerformed

    private void bborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bborrarActionPerformed
         Connection cn = (Connection) new Conexion_database().conexion();  
       
       limpiar();
       String SQL = ""; 
       SQL = "DELETE from presos";
        try {
            PreparedStatement pst = cn.prepareStatement(SQL);
           
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null, "Registro borrado con éxito :)");
                bloquear();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Interfazdb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bborrarActionPerformed

    private void bmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmostrarActionPerformed
         Connection cn = (Connection) new Conexion_database().conexion();  
       String IdPreso, Apellido, Nombre, Fecha_Nacimiento, Delito;
       String SQL = "";
       
       SQL = "select * from presos;";
    
        try {
            PreparedStatement pst = cn.prepareStatement(SQL);
            System.out.println(pst);
        } catch (SQLException ex) {
            Logger.getLogger(Interfazdb.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            
       
        IdPreso=textid.getText();
       Apellido=textapellido.getText();
       Nombre=textnombre.getText();
       Fecha_Nacimiento=textfech.getText();
       Delito=textdelito.getText();
    }//GEN-LAST:event_bmostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bañadir;
    private javax.swing.JButton bborrar;
    private javax.swing.JButton bmostrar;
    private javax.swing.JButton bnuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelapellido;
    private javax.swing.JLabel labeldelito;
    private javax.swing.JLabel labelfech;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JTextField textapellido;
    private javax.swing.JTextField textdelito;
    private javax.swing.JTextField textfech;
    private javax.swing.JTextField textid;
    private javax.swing.JTextField textnombre;
    // End of variables declaration//GEN-END:variables
}
