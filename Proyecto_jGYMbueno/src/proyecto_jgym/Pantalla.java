/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_jgym;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 *
 * @author villu
 */

public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    
    private Point clickInicial;
    public Pantalla() {
        //Este primer Listener detecta el CLICK del ratón
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                clickInicial = e.getPoint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                clickInicial = null;
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Si initialClick es null, significa que no empezamos arrastrando desde esta ventana
                if (clickInicial == null) {
                    return;
                }

                // Coordenadas actuales del ratón en la pantalla
                int thisX = getLocationOnScreen().x;
                int thisY = getLocationOnScreen().y;

                int xMoved = e.getXOnScreen() - clickInicial.x;
                int yMoved = e.getYOnScreen() - clickInicial.y;

                // Mueve la ventana a la nueva posición
                setLocation(xMoved, yMoved);
            }
        });
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogRegistro = new javax.swing.JDialog();
        labelBienvenida = new javax.swing.JLabel();
        labelSalir = new javax.swing.JLabel();
        labelLogoGym = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonRegCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonAccesoEmpleados = new javax.swing.JLabel();
        fondoBotones = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondoFrame = new javax.swing.JLabel();

        dialogRegistro.setEnabled(false);
        dialogRegistro.setMaximumSize(new java.awt.Dimension(640, 480));
        dialogRegistro.setMinimumSize(new java.awt.Dimension(640, 480));
        dialogRegistro.setPreferredSize(new java.awt.Dimension(640, 480));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso jGym");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("iconoJGym.png")).getImage());
        setMaximumSize(new java.awt.Dimension(1108, 660));
        setMinimumSize(new java.awt.Dimension(1108, 660));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1108, 660));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBienvenida.setBackground(new java.awt.Color(255, 255, 255));
        labelBienvenida.setFont(new java.awt.Font("Yu Gothic", 0, 48)); // NOI18N
        labelBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        labelBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBienvenida.setText("Bienvenid@ a jGym.");
        getContentPane().add(labelBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 470, 90));

        labelSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_jgym/cerrar.png"))); // NOI18N
        labelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSalirMouseClicked(evt);
            }
        });
        getContentPane().add(labelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 30, 30));

        labelLogoGym.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_jgym/Logo_jGymPeque.png"))); // NOI18N
        getContentPane().add(labelLogoGym, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 180));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registrarse");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 610, 120, 30));

        botonRegCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_jgym/usuariocopia.png"))); // NOI18N
        botonRegCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegClienteMouseClicked(evt);
            }
        });
        getContentPane().add(botonRegCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 80, 80));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Acceso empleados");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        botonAccesoEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_jgym/accesoPeque2 (1).png"))); // NOI18N
        botonAccesoEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(botonAccesoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 120, 120));

        fondoBotones.setBackground(new java.awt.Color(28, 27, 27));
        fondoBotones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fondoBotones.setOpaque(true);
        getContentPane().add(fondoBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 140, 270));

        jLabel2.setBackground(new java.awt.Color(13, 117, 117));
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 660));

        fondoFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_jgym/fondo2 (1).jpg"))); // NOI18N
        getContentPane().add(fondoFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelSalirMouseClicked

    private void botonRegClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegClienteMouseClicked
        
    }//GEN-LAST:event_botonRegClienteMouseClicked

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonAccesoEmpleados;
    private javax.swing.JLabel botonRegCliente;
    private javax.swing.JDialog dialogRegistro;
    private javax.swing.JLabel fondoBotones;
    private javax.swing.JLabel fondoFrame;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelLogoGym;
    private javax.swing.JLabel labelSalir;
    // End of variables declaration//GEN-END:variables
}
