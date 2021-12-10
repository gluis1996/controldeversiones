package DETALLE_VENTAS;

import java.io.*;

public class Detalle_Ventass extends javax.swing.JPanel {

    public Detalle_Ventass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnumeroboleta = new javax.swing.JTextField();
        jbtnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DETALLES DE VENTAS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 40));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("-------------------------------------------------");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 350, 10));

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("BUSCAR BOLETA DE VENTAS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresar N° de boleta de venta:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));
        add(txtnumeroboleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 100, 30));

        jbtnbuscar.setText("BUSCAR");
        jbtnbuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbuscarActionPerformed(evt);
            }
        });
        add(jbtnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 130, 40));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 800, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbuscarActionPerformed
        String codigo = txtnumeroboleta.getText();
        mostrarVentas(codigo);
        
        
        
    }//GEN-LAST:event_jbtnbuscarActionPerformed
void mostrarVentas (String codigo){

    try {
        FileReader fr = new FileReader("src\\FicheroVentas\\"+codigo+".txt");
        BufferedReader br = new BufferedReader(fr);
        String linea ;
        
        while ((linea = br.readLine())!= null){
            String fila [] =linea.split(", ");
            jTextArea1.append("DNI:        "+fila[0]+" =====>"+" NOMBRE: "+fila[1]+"\n");            
            jTextArea1.append("DIRECCION:  "+fila[2]+"\n");
            jTextArea1.append("CODIGO:     "+fila[3]+" =====>"+" NOMBRE PRODUCTO:  "+fila[4]+" =====> COLOR : "+fila[5]+"\n");
            jTextArea1.append("DESTINO:    "+fila[6]+"\n");
            jTextArea1.append("CANTIDAD:   "+fila[7]+"\n");
            jTextArea1.append("PRECIO U.:  "+fila[8]+"\n");
            jTextArea1.append("SUBTOTAL:   "+fila[9]+"\n");
            jTextArea1.append("************************************************************************"+"\n"+"\n");
        }
        
    } catch (Exception e) {
    }

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnbuscar;
    private javax.swing.JTextField txtnumeroboleta;
    // End of variables declaration//GEN-END:variables
}
