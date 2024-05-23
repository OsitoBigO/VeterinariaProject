/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author secacad-sistemas
 */
public class FrmClientes extends javax.swing.JInternalFrame{

    /**
     * Creates new form Forma1
     */
    public FrmClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jtxtcorreocli = new javax.swing.JTextField();
        jtxtIdnicli = new javax.swing.JTextField();
        jbtnEliminar = new javax.swing.JButton();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnConsultar = new javax.swing.JButton();
        jbtnActualizar = new javax.swing.JButton();
        jtxtnombrecli = new javax.swing.JTextField();
        jtxtmascotanom = new javax.swing.JTextField();
        jtxtIdcliente = new javax.swing.JTextField();
        jtxttelefonocli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jlblCantidadregistros = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblDatos.setBackground(new java.awt.Color(255, 255, 204));
        jtblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtblDatos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 890, 430));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 255, 255)), "REGISTRO CLIENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 20))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtcorreocli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORREO CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(jtxtcorreocli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 250, 60));

        jtxtIdnicli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(jtxtIdnicli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 150, 60));

        jbtnEliminar.setBackground(new java.awt.Color(94, 133, 210));
        jbtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setText("ELIMINAR");
        jPanel1.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 120, 50));

        jbtnRegistrar.setBackground(new java.awt.Color(94, 133, 210));
        jbtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegistrar.setText("REGISTRAR");
        jPanel1.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, 50));

        jbtnConsultar.setBackground(new java.awt.Color(94, 133, 210));
        jbtnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConsultar.setText("CONSULTAR");
        jbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 120, 50));

        jbtnActualizar.setBackground(new java.awt.Color(94, 133, 210));
        jbtnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setText("ACTUALIZAR");
        jPanel1.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 120, 50));

        jtxtnombrecli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(jtxtnombrecli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 60));

        jtxtmascotanom.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE MASCOTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(jtxtmascotanom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 250, 60));

        jtxtIdcliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(jtxtIdcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 60));

        jtxttelefonocli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TELEFONO CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(jtxttelefonocli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, 60));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 300, 550));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel2.setText("LISTA DE CLIENTES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jlblCantidadregistros.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jlblCantidadregistros.setText("Cantidad de Registros :");
        jPanel2.add(jlblCantidadregistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 540, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jbtnActualizar;
    public javax.swing.JButton jbtnConsultar;
    public javax.swing.JButton jbtnEliminar;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JLabel jlblCantidadregistros;
    public javax.swing.JTable jtblDatos;
    public javax.swing.JTextField jtxtIdcliente;
    public javax.swing.JTextField jtxtIdnicli;
    public javax.swing.JTextField jtxtcorreocli;
    public javax.swing.JTextField jtxtmascotanom;
    public javax.swing.JTextField jtxtnombrecli;
    public javax.swing.JTextField jtxttelefonocli;
    // End of variables declaration//GEN-END:variables
}