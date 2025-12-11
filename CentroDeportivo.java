/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EDD;

import static EDD.ManejoArchivo.*;

/**
 *
 * @author valef
 */
public class CentroDeportivo extends javax.swing.JFrame {

    /**
     * Creates new form CentroDeportivo
     */
    public CentroDeportivo() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static class Archivos {
        /*
        private static int N = 0;
        private static int[][] inventario= new int[1000][5];

        public static synchronized void actualizar(int[][] bodega, int N_Productos) { 
            inventario=bodega;
            N= N_Productos;
        }
        public static synchronized int[][] setBodega() { 
            return inventario;
        }
        public static synchronized int setProductos(){
            return N;
        }*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estadisticas = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        modificarDeportistas = new javax.swing.JButton();
        verDeportistas = new javax.swing.JButton();
        eliminarSesion = new javax.swing.JButton();
        verSesiones = new javax.swing.JButton();
        nuevaSesion = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        estadisticas.setContentAreaFilled(false);
        estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 290, 520));

        reiniciar.setContentAreaFilled(false);
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, 290, 330));

        modificarDeportistas.setContentAreaFilled(false);
        modificarDeportistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDeportistasActionPerformed(evt);
            }
        });
        getContentPane().add(modificarDeportistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 290, 330));

        verDeportistas.setContentAreaFilled(false);
        verDeportistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDeportistasActionPerformed(evt);
            }
        });
        getContentPane().add(verDeportistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 290, 330));

        eliminarSesion.setContentAreaFilled(false);
        eliminarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 290, 330));

        verSesiones.setContentAreaFilled(false);
        verSesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSesionesActionPerformed(evt);
            }
        });
        getContentPane().add(verSesiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 290, 330));

        nuevaSesion.setContentAreaFilled(false);
        nuevaSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaSesionActionPerformed(evt);
            }
        });
        getContentPane().add(nuevaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 290, 330));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EDD/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verSesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSesionesActionPerformed
        SesionesProgramadas sv= new SesionesProgramadas();
        sv.setVisible(true);
    }//GEN-LAST:event_verSesionesActionPerformed

    private void nuevaSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaSesionActionPerformed
        NuevaSesion sv= new NuevaSesion();
        sv.setVisible(true);
    }//GEN-LAST:event_nuevaSesionActionPerformed

    private void eliminarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarSesionActionPerformed
        EliminarSesion sv= new EliminarSesion();
        sv.setVisible(true);
    }//GEN-LAST:event_eliminarSesionActionPerformed

    private void verDeportistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDeportistasActionPerformed
        VerDeportistas sv= new VerDeportistas();
        sv.setVisible(true);
    }//GEN-LAST:event_verDeportistasActionPerformed

    private void modificarDeportistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDeportistasActionPerformed
        ModificarDeportistas sv= new ModificarDeportistas();
        sv.setVisible(true);
    }//GEN-LAST:event_modificarDeportistasActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        Reiniciar sv= new Reiniciar();
        sv.setVisible(true);
    }//GEN-LAST:event_reiniciarActionPerformed

    private void estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadisticasActionPerformed

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
            java.util.logging.Logger.getLogger(CentroDeportivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentroDeportivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentroDeportivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentroDeportivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentroDeportivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton eliminarSesion;
    private javax.swing.JButton estadisticas;
    private javax.swing.JButton modificarDeportistas;
    private javax.swing.JButton nuevaSesion;
    private javax.swing.JButton reiniciar;
    private javax.swing.JButton verDeportistas;
    private javax.swing.JButton verSesiones;
    // End of variables declaration//GEN-END:variables
}
