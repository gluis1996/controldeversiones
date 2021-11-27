package REGISTRO_VENTAS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class REGISTRO_VENTAS extends javax.swing.JPanel {
    DefaultTableModel modelo;
    String cabecera []={"PRODCUTO","CANTIDAD","PRECIO UNIT.","SUB TOTAL"};
    String data [][] = {};
    clientes cl;
    clientes arregloclientes[];
    int num;int nump;

    public REGISTRO_VENTAS() {
        initComponents();
        arregloclientes = new clientes[10000];
        num = 0;
        nump = 0;
        modelo = new DefaultTableModel(data,cabecera);
        tabla.setModel(modelo);
    }

    void grabararchivo(clientes cl) {
        try {
            FileWriter fw = new FileWriter("src\\REGISTRO_VENTAS\\registro_cliente.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(cl.dni + "|" + cl.nombres + "|" + cl.direccion);
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la grabacion", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    void extraerdtos() {
        String linea;
        try (FileReader fr = new FileReader("src\\REGISTRO_VENTAS\\registro_cliente.txt");
                BufferedReader br = new BufferedReader(fr);) {

            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "|");
                String dni = st.nextToken();
                String nombre = st.nextToken();
                String direccion = st.nextToken();
                cl = new clientes(dni, nombre, direccion);
                arregloclientes[num] = cl;
                num++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en extraer");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BTN_BUSCAR_CLIENTE = new javax.swing.JButton();
        BTN_REGISTRARCLIENTE = new javax.swing.JButton();
        BTN_AGREGAR_COMPRA = new javax.swing.JButton();
        BTN_BUSCAR_PRODUCTO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxenvios = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BTN_AÑADIR = new javax.swing.JButton();
        txtprecioUnit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcodigoproducto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcatproducto = new javax.swing.JTextField();
        txtcolorProducto = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(780, 510));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(780, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        tabla.setBackground(new java.awt.Color(153, 204, 255));
        tabla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        tabla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabla.setForeground(new java.awt.Color(51, 0, 51));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio Unit", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(40, 270, 720, 170);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        BTN_BUSCAR_CLIENTE.setBackground(new java.awt.Color(255, 255, 255));
        BTN_BUSCAR_CLIENTE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_BUSCAR_CLIENTE.setText("BUSCAR AL CLIENTE");
        BTN_BUSCAR_CLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BUSCAR_CLIENTEActionPerformed(evt);
            }
        });

        BTN_REGISTRARCLIENTE.setBackground(new java.awt.Color(255, 255, 255));
        BTN_REGISTRARCLIENTE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_REGISTRARCLIENTE.setText("REGISTRAR CLIENTE");
        BTN_REGISTRARCLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_REGISTRARCLIENTEActionPerformed(evt);
            }
        });

        BTN_AGREGAR_COMPRA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_AGREGAR_COMPRA.setText("GENERAR COMPRA");
        BTN_AGREGAR_COMPRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AGREGAR_COMPRAActionPerformed(evt);
            }
        });

        BTN_BUSCAR_PRODUCTO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_BUSCAR_PRODUCTO.setText("BUSCAR PRODUCT");
        BTN_BUSCAR_PRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BUSCAR_PRODUCTOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_AGREGAR_COMPRA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_BUSCAR_CLIENTE, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(BTN_REGISTRARCLIENTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_BUSCAR_PRODUCTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTN_REGISTRARCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_BUSCAR_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_BUSCAR_PRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_AGREGAR_COMPRA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel2);
        jPanel2.setBounds(570, 35, 190, 180);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel1.setText("REGITRO DE VENTA");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(290, 0, 200, 40);
        jPanel3.add(txtdni);
        txtdni.setBounds(50, 60, 80, 20);

        jLabel3.setText("DNI:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(50, 40, 22, 14);
        jPanel3.add(txtnombres);
        txtnombres.setBounds(140, 60, 210, 20);

        jLabel2.setText("APELLIDOS Y NOMBRES");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(140, 40, 120, 14);

        jLabel4.setText("DIRECCION");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(50, 90, 70, 14);
        jPanel3.add(txtdireccion);
        txtdireccion.setBounds(50, 110, 300, 20);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(50, 160, 460, 2);

        jLabel5.setText("SELECCIONE LOS PRODUCTOS");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(50, 140, 160, 14);
        jPanel3.add(txtcantidad);
        txtcantidad.setBounds(190, 240, 50, 20);

        jLabel6.setText("CANTIDAD");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(190, 220, 60, 14);

        cbxenvios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "PUNO", "JULIACA", "CERRO DE PAZCO" }));
        jPanel3.add(cbxenvios);
        cbxenvios.setBounds(360, 190, 130, 20);

        jLabel7.setText("PRODUCTO");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 170, 70, 14);

        jLabel8.setText("COLOR");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(190, 170, 40, 14);

        jLabel9.setText("ENVIOS");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(360, 170, 60, 14);
        jPanel3.add(jTextField4);
        jTextField4.setBounds(670, 450, 80, 20);

        jLabel10.setText("TOTAL");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(620, 450, 32, 10);

        BTN_AÑADIR.setBackground(new java.awt.Color(255, 255, 255));
        BTN_AÑADIR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTN_AÑADIR.setText("AÑADIR");
        BTN_AÑADIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AÑADIRActionPerformed(evt);
            }
        });
        jPanel3.add(BTN_AÑADIR);
        BTN_AÑADIR.setBounds(590, 220, 120, 30);
        jPanel3.add(txtprecioUnit);
        txtprecioUnit.setBounds(50, 240, 70, 20);

        jLabel11.setText("PRECIO UNIT");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(50, 220, 70, 14);
        jPanel3.add(txtcodigoproducto);
        txtcodigoproducto.setBounds(370, 110, 90, 20);

        jLabel12.setText("CODIGO PRO");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(370, 90, 70, 14);
        jPanel3.add(txtcatproducto);
        txtcatproducto.setBounds(50, 190, 110, 20);
        jPanel3.add(txtcolorProducto);
        txtcolorProducto.setBounds(190, 190, 140, 20);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_BUSCAR_CLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BUSCAR_CLIENTEActionPerformed
        extraerdtos();
        String nombre = "", direccion = "", dni = "";
        for (int i = 0; i < num; i++) {
            if (arregloclientes[i].dni.equalsIgnoreCase(txtdni.getText())) {
                dni = arregloclientes[i].dni;
                nombre = arregloclientes[i].nombres;
                direccion = arregloclientes[i].direccion;
            }
        }
        txtnombres.setText(nombre);
        txtdireccion.setText(direccion);
    }//GEN-LAST:event_BTN_BUSCAR_CLIENTEActionPerformed

    private void BTN_REGISTRARCLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_REGISTRARCLIENTEActionPerformed
        String dni = txtdni.getText();
        String nombre = txtnombres.getText();
        String direccion = txtdireccion.getText();
        clientes cl = new clientes(dni, nombre, direccion);
        arregloclientes[num] = cl;
        grabararchivo(cl);
        num++;
    }//GEN-LAST:event_BTN_REGISTRARCLIENTEActionPerformed
void extraer_pro(){
String linea;
    try (FileReader fr = new FileReader("src\\STOCK\\Stock.txt");
                BufferedReader br = new BufferedReader(fr);) {

            while ((linea = br.readLine()) != null) {
                String palabra[]= linea.split(", ");
              if (palabra[0].equals(txtcodigoproducto.getText())){
                  txtcatproducto.setText(palabra[1]);
                  txtcolorProducto.setText(palabra[5]);
                  txtprecioUnit.setText(palabra[2]);
              }
                
            }
        } catch (Exception e) { JOptionPane.showMessageDialog(null, "ERROR EN BUSCAR PRODCUTO \n"+e);
    }

}
    private void BTN_BUSCAR_PRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BUSCAR_PRODUCTOActionPerformed
            extraer_pro();

    }//GEN-LAST:event_BTN_BUSCAR_PRODUCTOActionPerformed

    private void BTN_AGREGAR_COMPRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AGREGAR_COMPRAActionPerformed
        
    }//GEN-LAST:event_BTN_AGREGAR_COMPRAActionPerformed
    
    private void BTN_AÑADIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AÑADIRActionPerformed
       
    }//GEN-LAST:event_BTN_AÑADIRActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_AGREGAR_COMPRA;
    private javax.swing.JButton BTN_AÑADIR;
    private javax.swing.JButton BTN_BUSCAR_CLIENTE;
    private javax.swing.JButton BTN_BUSCAR_PRODUCTO;
    private javax.swing.JButton BTN_REGISTRARCLIENTE;
    private javax.swing.JComboBox<String> cbxenvios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcatproducto;
    private javax.swing.JTextField txtcodigoproducto;
    private javax.swing.JTextField txtcolorProducto;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtprecioUnit;
    // End of variables declaration//GEN-END:variables
}
