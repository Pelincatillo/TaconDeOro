/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package edt5y6tacondeoro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class HacerPedido extends javax.swing.JDialog {

    private SistemaVP mipadre = null;
    DefaultTableModel dtmArticulos = null;
    DefaultTableModel dtmCarrito = null;
    DefaultTableModel dtmTalla = null;

    /**
     * Creates new form HcacerPedido
     */
    public HacerPedido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        parent.setVisible(false);
        mipadre = (SistemaVP) parent;
        SistemaVP.hazConexion();
        conexionBD();
        dtmCarrito = new DefaultTableModel();
        dtmCarrito.addColumn("Nombre");
        dtmCarrito.addColumn("PrecioxCTD");
        dtmCarrito.addColumn("Cantidad");
        dtmCarrito.addColumn("Talla");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spn_cantidad = new javax.swing.JSpinner();
        btn_pedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_articulos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_añadirCarrito = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_talla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_carrito = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btn_pedido.setText("Realizar pedido");
        btn_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidoActionPerformed(evt);
            }
        });

        tbl_articulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_articulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_articulosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_articulos);

        jLabel1.setText("Cantidad");

        jLabel2.setText("Talla");

        jLabel3.setText("Articulos");

        btn_añadirCarrito.setText("Añadir al carro");
        btn_añadirCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirCarritoActionPerformed(evt);
            }
        });

        jLabel4.setText("Carro");

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        tbl_talla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane4.setViewportView(tbl_talla);

        tbl_carrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_carrito);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_añadirCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spn_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_pedido, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_añadirCarrito))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spn_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(btn_pedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelar)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        mipadre.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void tbl_articulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_articulosMouseClicked
        // TODO add your handling code here:
        int i = tbl_articulos.getSelectedRow();
        String nombre = (String) dtmArticulos.getValueAt(i, 0);
        if (nombre.contains("Bolso")) {
            jScrollPane4.setVisible(false);
        } else {
            jScrollPane4.setVisible(true);
            obtenerTallas(nombre);
            tbl_talla.setModel(dtmTalla);
        }
        // tbl_talla.setModel(dtmTalla);
    }//GEN-LAST:event_tbl_articulosMouseClicked

    private void btn_añadirCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirCarritoActionPerformed
        // TODO add your handling code here:
        int i = tbl_articulos.getSelectedRow();
        int j = tbl_talla.getSelectedRow();
        tbl_carrito.setModel(dtmCarrito);
        float precio = (float) dtmArticulos.getValueAt(i, 1);
        int ctd = (int) spn_cantidad.getValue();
        Object[] lineaPedido = new Object[4];
        lineaPedido[0] = dtmArticulos.getValueAt(i, 0);
        if (ctd == 0) {
            ctd = 1;
            lineaPedido[1] = precio * ctd;
        } else {
            lineaPedido[1] = precio * ctd;
        }
        lineaPedido[2] = ctd;
        if (tbl_talla.isRowSelected(j)) {
            lineaPedido[3] = dtmTalla.getValueAt(j, 0);
        } else {
            lineaPedido[3] = "Sin talla";
        }
        dtmCarrito.addRow(lineaPedido);
    }//GEN-LAST:event_btn_añadirCarritoActionPerformed

    private void btn_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidoActionPerformed
        // TODO add your handling code here:
        //guardar lo del carrito para meterlo luego de haber creado el socio o selecionarlo
        Indentificacionsoc idensoc = new Indentificacionsoc(this, true);
        idensoc.setVisible(true);
    }//GEN-LAST:event_btn_pedidoActionPerformed
    public void conexionBD() {
        Statement s = null;
        ResultSet rs = null;
        Connection co = null;
        dtmArticulos = new DefaultTableModel();
        dtmArticulos.addColumn("Nombre");
        dtmArticulos.addColumn("Precio");
        tbl_articulos.setModel(dtmArticulos);
        co = mipadre.hazConexion();
        try {
            s = co.createStatement();
            rs = s.executeQuery("select nombre, precio from articulo");
            while (rs.next()) {
                Object[] fila = new Object[2];
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                dtmArticulos.addRow(fila);
            }
        } catch (SQLException ex) {
            System.out.println("Error. " + ex.getMessage());
        } finally {
            try {
                s.close();
                co.close();
            } catch (SQLException ex) {
                Logger.getLogger(HacerPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void obtenerTallas(String nombre) {
        Statement s = null;
        ResultSet rs = null;
        Connection co = null;
        co = mipadre.hazConexion();
        dtmTalla = new DefaultTableModel();
        dtmTalla.addColumn("Talla");
        try {
            s = co.createStatement();
            rs = s.executeQuery("select talla from articulo where nombre=" + "'" + nombre + "'");
            while (rs.next()) {
                Object[] fila = new Object[1];
                fila[0] = rs.getObject(1);
                dtmTalla.addRow(fila);
            }
        } catch (SQLException ex) {
            System.out.println("Error. " + ex.getMessage());
        } finally {
            try {
                s.close();
                co.close();
            } catch (SQLException ex) {
                Logger.getLogger(HacerPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(HacerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HacerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HacerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HacerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HacerPedido dialog = new HacerPedido(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadirCarrito;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_pedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner spn_cantidad;
    private javax.swing.JTable tbl_articulos;
    private javax.swing.JTable tbl_carrito;
    private javax.swing.JTable tbl_talla;
    // End of variables declaration//GEN-END:variables
}
