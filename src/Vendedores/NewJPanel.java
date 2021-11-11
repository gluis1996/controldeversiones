package Vendedores;

public class NewJPanel extends javax.swing.JPanel {

    public NewJPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtCodigo = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jboxSeguro = new javax.swing.JComboBox<>();
        jboxArea = new javax.swing.JComboBox<>();
        jtxtHorasE = new javax.swing.JTextField();
        jtxtSueldobase = new javax.swing.JTextField();

        jtxtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jtxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoActionPerformed(evt);
            }
        });

        jtxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        jboxSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "AFP", "SNP", " " }));
        jboxSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Seguro"));

        jboxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "SISTEMAS", "ADMINISTRACIÓN", "MARKETING", " " }));
        jboxArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Area"));

        jtxtHorasE.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas Extras"));

        jtxtSueldobase.setBorder(javax.swing.BorderFactory.createTitledBorder("Sueldo Base"));
        jtxtSueldobase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSueldobaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jboxSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxtSueldobase, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtxtHorasE, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jboxArea, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jboxSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSueldobase, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtHorasE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jboxArea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(295, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed

    private void jtxtSueldobaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSueldobaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSueldobaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jboxArea;
    private javax.swing.JComboBox<String> jboxSeguro;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtHorasE;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtSueldobase;
    // End of variables declaration//GEN-END:variables
}
