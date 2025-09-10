package TP5;

import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author Grupo 11
 */
public class JIfrmBorrarCliente extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultListModel<String> modeloLista = new DefaultListModel<>();

    public JIfrmBorrarCliente() {
        initComponents();
        armarCabeceraDni();
        ListaDni.setModel(modeloLista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDni = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaDni = new javax.swing.JTable();
        Boton_borrarCliente = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Borrar Cliente");

        dni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dniFocusGained(evt);
            }
        });
        dni.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                dniCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                dniInputMethodTextChanged(evt);
            }
        });
        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });
        dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("DNI:");

        ListaDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ListaDniKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(ListaDni);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TablaDni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Apellido", "Nombre", "Dirección", "Ciudad", "Telefono"
            }
        ));
        TablaDni.setEnabled(false);
        jScrollPane3.setViewportView(TablaDni);

        Boton_borrarCliente.setText("Borrar Cliente/s");
        Boton_borrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_borrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(Boton_borrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_borrarCliente)
                    .addComponent(jButton2))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Boton_borrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_borrarClienteActionPerformed
        String dniSeleccionado = ListaDni.getSelectedValue();

        if (dniSeleccionado != null) {
            int dni = Integer.parseInt(dniSeleccionado);
            Long clave = null;

            for (Map.Entry<Long, Cliente> auxi : JfrmMenuPrincipal.directorio.entrySet()) {
                if (auxi.getValue().getDNI() == dni) {
                    clave = auxi.getKey();
                    JfrmMenuPrincipal.directorio.remove(clave);
                    modeloLista.removeElement(dniSeleccionado); // limpia la lista
                    modelo.setRowCount(0); //limpia la tabla
                    JOptionPane.showMessageDialog(this, "Cliente correspondiente al dni: " + dni + " ha sido eliminado", "Cliente Eliminado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        } else {
            JOptionPane.showInternalMessageDialog(this, "Seleccione DNI para eliminar", "Oleeeeee", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_Boton_borrarClienteActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed

    }//GEN-LAST:event_dniActionPerformed

    private void dniCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dniCaretPositionChanged

    }//GEN-LAST:event_dniCaretPositionChanged

    private void dniInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dniInputMethodTextChanged

    }//GEN-LAST:event_dniInputMethodTextChanged

    private void dniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dniFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dniFocusGained

    private void dniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniKeyReleased
        modelo.setRowCount(0); // esto va limpiando la tabla, para que solo muestre los que coincidan en el momento, y no el historial de los que coincidieron
        for (Map.Entry<Long, Cliente> auxi : JfrmMenuPrincipal.directorio.entrySet()) {
            Cliente auxiC = auxi.getValue();
            Long auxiL = auxi.getKey();
            String dniIngresado = dni.getText();
            String dniCliente = String.valueOf(auxiC.getDNI());
            if (dniCliente.startsWith(dniIngresado)) {
                modelo.addRow(new Object[]{auxiC.getDNI(), auxiC.getApellido(), auxiC.getNombre(), auxiC.getDireccion(), auxiC.getCiudad(), auxiL});

            }
        }

        modeloLista.clear();
        for (Map.Entry<Long, Cliente> auxi : JfrmMenuPrincipal.directorio.entrySet()) {
            Cliente auxiC = auxi.getValue();

            String dniIngresado = dni.getText();
            String dniCliente = String.valueOf(auxiC.getDNI());
            if (dniCliente.startsWith(dniIngresado)) {
                modeloLista.addElement(dniCliente);
            }
        }
    }//GEN-LAST:event_dniKeyReleased

    private void ListaDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ListaDniKeyReleased


    }//GEN-LAST:event_ListaDniKeyReleased

    private void dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_dniKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_borrarCliente;
    private javax.swing.JList<String> ListaDni;
    private javax.swing.JTable TablaDni;
    private javax.swing.JTextField dni;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraDni() {
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Telefono");
        TablaDni.setModel(modelo);
    }

}
