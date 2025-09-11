package TP5;

import java.util.Map;
import java.awt.event.ItemEvent;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/*
 * @author Grupo 11
 */
public class JIfrmBuscarTelefonoXApellido extends javax.swing.JInternalFrame {

    private DefaultTableModel tablita = new DefaultTableModel();
    private DefaultListModel<String> listita = new DefaultListModel<>();

    public JIfrmBuscarTelefonoXApellido() {
        initComponents();
        armarCabeceraApellido();
        ListaApellido.setModel(listita);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Botonsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaApellido = new javax.swing.JTable();
        apellidoo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaApellido = new javax.swing.JList<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Buscar Telefono por Apellido");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Apellido:");

        Botonsalir.setText("Salir");
        Botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonsalirActionPerformed(evt);
            }
        });

        TablaApellido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Apellido", "Nombre", "Dirección", "Ciudad", "Telefono"
            }
        ));
        jScrollPane2.setViewportView(TablaApellido);

        apellidoo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidooKeyReleased(evt);
            }
        });

        jScrollPane1.setViewportView(ListaApellido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Botonsalir)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellidoo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(apellidoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(Botonsalir)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonsalirActionPerformed

    private void apellidooKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidooKeyReleased
        tablita.setRowCount(0);
        for (Map.Entry<Long, Cliente> auxi : JfrmMenuPrincipal.directorio.entrySet()) {
            Cliente auxiC = auxi.getValue();
            Long auxiL = auxi.getKey();

            if (auxiC.getApellido().toLowerCase().startsWith(apellidoo.getText().toLowerCase())) {
                tablita.addRow(new Object[]{auxiC.getDNI(), auxiC.getApellido(), auxiC.getNombre(), auxiC.getDireccion(), auxiC.getCiudad(), auxiL});
            }
        }
        
        listita.clear();
        for (Map.Entry<Long, Cliente> auxi : JfrmMenuPrincipal.directorio.entrySet()) {
            Cliente auxiC = auxi.getValue();

            String apellidoIngresado = apellidoo.getText();
            String apellidoCliente = String.valueOf(auxiC.getApellido());
            if (apellidoCliente.startsWith(apellidoIngresado)) {
                listita.addElement(apellidoCliente);
            }
        }
        
        
    }//GEN-LAST:event_apellidooKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botonsalir;
    private javax.swing.JList<String> ListaApellido;
    private javax.swing.JTable TablaApellido;
    private javax.swing.JTextField apellidoo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraApellido() {
        tablita.addColumn("DNI");
        tablita.addColumn("Apellido");
        tablita.addColumn("Nombre");
        tablita.addColumn("Direccion");
        tablita.addColumn("Ciudad");
        tablita.addColumn("Telefono");
        TablaApellido.setModel(tablita);
    }
}
