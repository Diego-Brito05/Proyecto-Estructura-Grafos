/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.awt.*;
import javax.swing.*;
import EDD.*;
import Grafo.*;
import Interfaces.Menu.*;

import static Interfaces.Menu.libro;
import static Interfaces.Menu.mySlylesheet;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;


/**
 *
 * @author Jose Ignacio Muñoz
 */
public class ModGraph extends javax.swing.JFrame {

    /**
     * Creates new form ModGraph
     */
    public ModGraph() {
        initComponents();
        
    }
   
        
static String gsucur;
       
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        newt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tButt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sucursal = new javax.swing.JTextField();
        addsuc = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        secsuc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BuBP = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor");
        setResizable(false);

        jLayeredPane1.setBackground(new java.awt.Color(255, 204, 153));
        jLayeredPane1.setDoubleBuffered(true);
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Valor de t:");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 85, -1, -1));

        newt.setBackground(new java.awt.Color(204, 204, 204));
        newt.setToolTipText("");
        newt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        newt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtActionPerformed(evt);
            }
        });
        jLayeredPane1.add(newt, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 83, 74, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Bienvenido al Editor del Grafo");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 9, -1, -1));

        tButt.setBackground(new java.awt.Color(255, 153, 102));
        tButt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tButt.setText("Establecer t");
        tButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tButtActionPerformed(evt);
            }
        });
        jLayeredPane1.add(tButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 109, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Modificar t");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 47, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Colocar Sucursales");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 47, -1, -1));

        jLabel5.setText("Escriba una parada");
        jLabel5.setFocusable(false);
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 85, -1, -1));

        sucursal.setBackground(new java.awt.Color(204, 204, 204));
        sucursal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalActionPerformed(evt);
            }
        });
        jLayeredPane1.add(sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 83, 164, -1));

        addsuc.setBackground(new java.awt.Color(255, 153, 102));
        addsuc.setText("Colocar/Quitar");
        addsuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsucActionPerformed(evt);
            }
        });
        jLayeredPane1.add(addsuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 109, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Cobertura Sucursal");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 152, -1, -1));

        secsuc.setBackground(new java.awt.Color(204, 204, 204));
        jLayeredPane1.add(secsuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 204, 133, -1));

        jLabel7.setText("Escriba una Sucursal");
        jLabel7.setToolTipText("");
        jLayeredPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 182, -1, -1));

        BuBP.setBackground(new java.awt.Color(255, 153, 102));
        BuBP.setText("DFS");
        BuBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuBPActionPerformed(evt);
            }
        });
        jLayeredPane1.add(BuBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 257, -1, -1));

        jLabel8.setText("Seleccione el Metodo");
        jLayeredPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 235, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setText("BFS");
        jLayeredPane1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 257, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tButtActionPerformed
        // TODO add your handling code here:
        
        String tt = newt.getText();
        if (isNumeric(tt) == true) {
            t = Integer.parseInt(tt);
            
        } else {
            
             JOptionPane.showMessageDialog(null, "El Valor de " + tt + " no es valido");
        }
        
        
      
        
    }//GEN-LAST:event_tButtActionPerformed

    private void sucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sucursalActionPerformed

    private void addsucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsucActionPerformed
        // TODO add your handling code here:
        String sucur = sucursal.getText();
        String cc = Menu.grafo.buscarp(sucur);
        Node node = Menu.libro.getNode(cc);

        
    // Cambiar el color del nodo aquí

        if (cc.equals(sucur)){
            int tom= Menu.grafo.buscarpar(sucur).getNumero();
            if (Menu.grafo.buscarpar(cc).getSucursal()){
                Menu.grafo.buscarpar(sucur).CambiarSucursal();
                JOptionPane.showMessageDialog(null,sucur+" ya no tiene sucursal");
                Menu.libro.getNode(tom-1).setAttribute("ui.label", sucur);
                
            }else{
            
            System.setProperty("gs.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
            Menu.grafo.buscarpar(sucur).CambiarSucursal();
            JOptionPane.showMessageDialog(null, "Sucursal colocada en "+ sucur);
           
            String nuvo ="node {icon-mode: at-left; icon: url('data/Smiley_032.png');}";
            Menu.libro.getNode(tom-1).setAttribute("ui.stylesheet", nuvo);
            Menu.libro.getNode(tom-1).setAttribute("ui.label", "🏠︎"+sucur+"🏠");
            
            
            }
            
            
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Parada no encontrada");
        
    }//GEN-LAST:event_addsucActionPerformed
    }
    private void BuBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuBPActionPerformed
        // TODO add your handling code here:
        String par= secsuc.getText();
        if(!Menu.grafo.searchByname(par).getParada().getSucursal()){
            JOptionPane.showMessageDialog(null, par +" No cuenta con una sucursal");
        }
        Menu.grafo.BP(par, t);
        JOptionPane.showMessageDialog(null, par +" Si cuenta con una sucursal");
        
    }//GEN-LAST:event_BuBPActionPerformed

    private void newtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newtActionPerformed
    
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
            java.util.logging.Logger.getLogger(ModGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModGraph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuBP;
    private javax.swing.JButton addsuc;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField newt;
    private javax.swing.JTextField secsuc;
    private javax.swing.JTextField sucursal;
    private javax.swing.JButton tButt;
    // End of variables declaration//GEN-END:variables

    private boolean isNumeric(String tt) {
        boolean resultado;
        try {
            Integer.parseInt(tt);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
    static int t;

    private void displayGraph(Graph libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    


}