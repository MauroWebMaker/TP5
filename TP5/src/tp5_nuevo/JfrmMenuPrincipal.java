package tp5_nuevo;

import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 * @author Grupo 11
 */
public class JfrmMenuPrincipal extends javax.swing.JFrame {
    
    public static TreeMap<Long, Cliente> directorio = new TreeMap<>();

    public JfrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Clientes = new javax.swing.JMenu();
        AgregarCliente = new javax.swing.JMenuItem();
        BorrarCliente = new javax.swing.JMenuItem();
        Directorio = new javax.swing.JMenu();
        BuscarClientesXCiudad = new javax.swing.JMenuItem();
        BuscarTelefonoXApellido = new javax.swing.JMenuItem();
        Ciudades = new javax.swing.JMenu();
        AgregarCiudad = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();
        Salirrrr = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(102, 102, 102));
        Escritorio.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        Escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        Clientes.setText("Clientes");

        AgregarCliente.setText("Agregar Cliente");
        AgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarClienteActionPerformed(evt);
            }
        });
        Clientes.add(AgregarCliente);

        BorrarCliente.setText("Borrar Cliente");
        BorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarClienteActionPerformed(evt);
            }
        });
        Clientes.add(BorrarCliente);

        jMenuBar1.add(Clientes);

        Directorio.setText("Directorio");

        BuscarClientesXCiudad.setText("Buscar Clientes por Ciudad");
        BuscarClientesXCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClientesXCiudadActionPerformed(evt);
            }
        });
        Directorio.add(BuscarClientesXCiudad);

        BuscarTelefonoXApellido.setText("Buscar Telefono por Apellido");
        BuscarTelefonoXApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTelefonoXApellidoActionPerformed(evt);
            }
        });
        Directorio.add(BuscarTelefonoXApellido);

        jMenuBar1.add(Directorio);

        Ciudades.setText("Ciudades");

        AgregarCiudad.setText("Agregar Ciudad");
        AgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCiudadActionPerformed(evt);
            }
        });
        Ciudades.add(AgregarCiudad);

        jMenuBar1.add(Ciudades);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Salirrrr.setText("Salir");
        Salirrrr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirrrrActionPerformed(evt);
            }
        });
        Salir.add(Salirrrr);

        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarClienteActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        JIfrmAgregarCliente aux = new JIfrmAgregarCliente();
        aux.setVisible(true);
        Escritorio.add(aux);
        Escritorio.moveToFront(aux);
    }//GEN-LAST:event_AgregarClienteActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
    }//GEN-LAST:event_SalirActionPerformed

    private void SalirrrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirrrrActionPerformed
        int aux = JOptionPane.showConfirmDialog(rootPane, "Seguro que desea salir ?", "Estas seguro ??", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (aux == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_SalirrrrActionPerformed

    private void BorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarClienteActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        JIfrmBorrarCliente aux = new JIfrmBorrarCliente();
        aux.setVisible(true);
        Escritorio.add(aux);
        Escritorio.moveToFront(aux);
    }//GEN-LAST:event_BorrarClienteActionPerformed

    private void BuscarClientesXCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClientesXCiudadActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        JIfrmBuscarClientesXCiudad aux = new JIfrmBuscarClientesXCiudad();
        aux.setVisible(true);
        Escritorio.add(aux);
        Escritorio.moveToFront(aux);
    }//GEN-LAST:event_BuscarClientesXCiudadActionPerformed

    private void BuscarTelefonoXApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTelefonoXApellidoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        JIfrmBuscarTelefonoXApellido aux = new JIfrmBuscarTelefonoXApellido();
        aux.setVisible(true);
        Escritorio.add(aux);
        Escritorio.moveToFront(aux);
    }//GEN-LAST:event_BuscarTelefonoXApellidoActionPerformed

    private void AgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCiudadActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        JIfrmAgregarCiudad aux = new JIfrmAgregarCiudad();
        aux.setVisible(true);
        Escritorio.add(aux);
        Escritorio.moveToFront(aux);
    }//GEN-LAST:event_AgregarCiudadActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JfrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarCiudad;
    private javax.swing.JMenuItem AgregarCliente;
    private javax.swing.JMenuItem BorrarCliente;
    private javax.swing.JMenuItem BuscarClientesXCiudad;
    private javax.swing.JMenuItem BuscarTelefonoXApellido;
    private javax.swing.JMenu Ciudades;
    private javax.swing.JMenu Clientes;
    private javax.swing.JMenu Directorio;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem Salirrrr;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
