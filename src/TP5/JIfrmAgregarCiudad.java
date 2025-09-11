package TP5;

import javax.swing.JOptionPane;

/*
 * @author Grupo 11
 */
public class JIfrmAgregarCiudad extends javax.swing.JInternalFrame {

    public JIfrmAgregarCiudad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreCiudad = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(660, 340));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Agregar Ciudad");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre de la Ciudad:");

        nombreCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCiudadActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(nombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1)))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(Guardar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 459, Short.MAX_VALUE)
                    .addComponent(Salir)
                    .addGap(23, 23, 23)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(245, 245, 245)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Guardar)
                        .addComponent(Salir))
                    .addContainerGap(36, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if (!nombreCiudad.getText().isEmpty()) {
            JfrmMenuPrincipal.ciudadesAgregadas.add(nombreCiudad.getText());
            JOptionPane.showMessageDialog(this, "Se agrego correctamente la Ciudad: "+nombreCiudad.getText(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            nombreCiudad.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "No puede ingresar datos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void nombreCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCiudadActionPerformed
        
    }//GEN-LAST:event_nombreCiudadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nombreCiudad;
    // End of variables declaration//GEN-END:variables
}
