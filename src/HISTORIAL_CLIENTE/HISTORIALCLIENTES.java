/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HISTORIAL_CLIENTE;
public class HISTORIALCLIENTES extends javax.swing.JPanel {

    int num;
    public HISTORIALCLIENTES() {
        initComponents();
        encabezado();
        
        num =0;
    }

   public void encabezado() {
        textareaventas.setText("");
        //Insertar encabezado al textarea
        textareaventas.append("");
        textareaventas.append("N°     CODIGO        DNI        DIRECCION        ENVIO    FECHA     PAGO TOTAL " + "\n");
        textareaventas.append("----------------------------------------------------------------------------------------------\n");

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textareaventas = new javax.swing.JTextArea();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel1.setText("BIENVENIDO al HISTORIAL DE CLIENTES...");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 0, 540, 40);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setText("Para ver historial del cliente:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 10, 220, 19);

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setText("Ingrese su DNI:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 40, 110, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("BUSCAR CLIENTE");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(260, 50, 130, 30);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(120, 50, 130, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 40, 580, 90);

        textareaventas.setColumns(20);
        textareaventas.setRows(5);
        jScrollPane2.setViewportView(textareaventas);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 140, 670, 330);

        add(jPanel1);
        jPanel1.setBounds(10, 10, 780, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    public static javax.swing.JTextArea textareaventas;
    // End of variables declaration//GEN-END:variables
}
