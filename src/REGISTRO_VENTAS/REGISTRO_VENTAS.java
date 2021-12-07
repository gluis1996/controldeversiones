package REGISTRO_VENTAS;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import HISTORIAL_CLIENTE.*;

public class REGISTRO_VENTAS extends javax.swing.JPanel {

    DefaultTableModel modelo;
    //CLIENTES REGISTRO
    clientes cl;
    clientes arregloclientes[];
    //REGSITRO DE VENTAS
    String cabecera[] = {"N°", "PRODCUTO", "CANTIDAD", "PRECIO UNIT.", "SUB TOTAL"};
    String data[][] = {};
    REGITRAS_VENTA_NODO inicio, fin;
    int num;
    File Fichero;
    File FicheroVenta;
    File FicheroHistorial;
    GuardarVentas objetosGuardarVentas = new GuardarVentas();
    HISTORIAL_VENTAS objGuardarHistorial = new HISTORIAL_VENTAS();
    //ARRAY LIST
    ArrayList<REGITRAS_VENTA_NODO> listaVenta = new ArrayList<>();
    ArrayList<Nodo_Historial>listaHistorial = new ArrayList<>();
    

    public REGISTRO_VENTAS() {
        initComponents();
        arregloclientes = new clientes[1000];

        modelo = new DefaultTableModel(data, cabecera);
        tabla.setModel(modelo);
        Fichero = new File("src\\STOCK\\Stock.txt");
        
    }

    /*INSENTAR AL INICIO LA VENTA
    REGITRAS_VENTA_NODO insertarAlInicio(REGITRAS_VENTA_NODO inicio, String dni, String nombres, String direccion, String codigoProducto, String producto, String color, String envio, int cantidad, double precio_unit) {
        REGITRAS_VENTA_NODO nuevo = new REGITRAS_VENTA_NODO(dni, nombres, direccion, codigoProducto, producto, color, envio, cantidad, precio_unit);
        nuevo.siguiente = inicio;
        inicio = nuevo;
        return inicio;

    }*/
    //MOSTRAR EN LA TABLA
    void mostrarEnTabla(REGITRAS_VENTA_NODO rvn) {
        Object fila[] = {num + 1, rvn.producto, rvn.cantidad, rvn.precio_unit, rvn.sub_total()};
        modelo.addRow(fila);
    }


    /*void VerDatos() {
        String dni, nombres, direccion, codigoProducto, producto, color, envios;
        int cantidad;
        Double precio_unit;
        num = 0;
        REGITRAS_VENTA_NODO aux = inicio;
        modelo.removeRow(ERROR);
        while (aux != null) {
            dni = aux.dni;
            nombres = aux.nombres;
            direccion = aux.direccion;
            codigoProducto = aux.codigoProducto;
            producto = aux.producto;
            color = aux.color;
            envios = aux.envio;
            cantidad = aux.cantidad;
            precio_unit = aux.precio_unit;
            num++;
            String numera = String.valueOf(num);
            Object fila[] = {numera, producto, cantidad, precio_unit, aux.sub_total()};
            modelo.addRow(fila);
            aux = aux.siguiente;
        }

    }*/
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
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BTN_AÑADIR = new javax.swing.JButton();
        txtprecioUnit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcodigoproducto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDescripcionProduc = new javax.swing.JTextField();
        txtcolorProducto = new javax.swing.JTextField();
        txtcodigoVenta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

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
        txtdni.setBounds(50, 60, 80, 22);

        jLabel3.setText("DNI:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(50, 40, 23, 16);
        jPanel3.add(txtnombres);
        txtnombres.setBounds(140, 60, 210, 22);

        jLabel2.setText("CODIGO:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(450, 40, 50, 16);

        jLabel4.setText("DIRECCION");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(50, 90, 70, 16);
        jPanel3.add(txtdireccion);
        txtdireccion.setBounds(50, 110, 300, 22);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(50, 160, 460, 3);

        jLabel5.setText("SELECCIONE LOS PRODUCTOS");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(50, 140, 160, 16);
        jPanel3.add(txtcantidad);
        txtcantidad.setBounds(190, 240, 50, 22);

        jLabel6.setText("FECHA");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(320, 220, 60, 16);

        cbxenvios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "PUNO", "JULIACA", "CERRO DE PAZCO" }));
        jPanel3.add(cbxenvios);
        cbxenvios.setBounds(360, 190, 130, 22);

        jLabel7.setText("DESCRIPCION PRO");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 170, 110, 16);

        jLabel8.setText("COLOR");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(190, 170, 40, 16);

        jLabel9.setText("ENVIOS");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(360, 170, 60, 16);
        jPanel3.add(txtTotal);
        txtTotal.setBounds(670, 450, 80, 20);

        jLabel10.setText("TOTAL");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(620, 450, 35, 10);

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
        txtprecioUnit.setBounds(50, 240, 70, 22);

        jLabel11.setText("PRECIO UNIT");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(50, 220, 70, 16);
        jPanel3.add(txtcodigoproducto);
        txtcodigoproducto.setBounds(370, 110, 90, 22);

        jLabel12.setText("CODIGO PRO");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(370, 90, 70, 16);
        jPanel3.add(txtDescripcionProduc);
        txtDescripcionProduc.setBounds(50, 190, 110, 22);
        jPanel3.add(txtcolorProducto);
        txtcolorProducto.setBounds(190, 190, 140, 22);
        jPanel3.add(txtcodigoVenta);
        txtcodigoVenta.setBounds(450, 60, 90, 22);

        jLabel13.setText("APELLIDOS Y NOMBRES");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(140, 40, 120, 16);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(470, 110, 30, 30);
        jPanel3.add(txtFecha);
        txtFecha.setBounds(320, 240, 110, 22);

        jLabel14.setText("CANTIDAD");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(190, 220, 60, 16);

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
        clientes cli = new clientes(dni, nombre, direccion);
        arregloclientes[num] = cli;
        grabararchivo(cli);
        num++;
    }//GEN-LAST:event_BTN_REGISTRARCLIENTEActionPerformed

    private void BTN_BUSCAR_PRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BUSCAR_PRODUCTOActionPerformed
        extraer_pro();

    }//GEN-LAST:event_BTN_BUSCAR_PRODUCTOActionPerformed

    private void BTN_AGREGAR_COMPRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AGREGAR_COMPRAActionPerformed
       String nombre = txtcodigoVenta.getText();
        FicheroVenta = new File("src\\FicheroVentas\\"+nombre+".txt");  
        FicheroHistorial = new File ("src\\HISTORIAL_CLIENTE\\HISORIALVENTA.txt");
        String codigo_venta = txtcodigoVenta.getText();
        String dni = txtdni.getText();
        String direccion = txtdireccion.getText();
        String Envio = cbxenvios.getSelectedItem().toString();
        String FEcha = txtFecha.getText();
        Double Ptotal = Double.parseDouble(txtTotal.getText());
       
        Nodo_Historial nh = new Nodo_Historial(codigo_venta, dni, direccion, Envio, FEcha, Ptotal);
        listaHistorial.add(nh);
        objGuardarHistorial.GuardarVenta(FicheroHistorial, listaHistorial);
        
        String cod = txtcodigoproducto.getText();
        //int cantidad = Integer.parseInt(txtcantidad.getText());
        //registarVentasEnElFichero(cod, cantidad);
        objetosGuardarVentas.EscribirVenta(FicheroVenta,listaVenta);
        JOptionPane.showMessageDialog(null, "Venta Registrada Exitosamente");
        limpiar_todo();

    }//GEN-LAST:event_BTN_AGREGAR_COMPRAActionPerformed

    private void BTN_AÑADIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AÑADIRActionPerformed
        String dni = txtdni.getText();
        String nombres = txtnombres.getText();
        String direccion = txtdireccion.getText();
        String codigoProducto = txtcodigoproducto.getText();
        String producto = txtDescripcionProduc.getText();
        String color = txtcolorProducto.getText();
        String envios = cbxenvios.getSelectedItem().toString();
        int cantidad = Integer.parseInt(txtcantidad.getText());
        Double precio_unit = Double.parseDouble(txtprecioUnit.getText());
        REGITRAS_VENTA_NODO venta = new REGITRAS_VENTA_NODO(dni, nombres, direccion, codigoProducto, producto, color, envios, cantidad, precio_unit);
        listaVenta.add(venta);
        double sueldo_ba = 0;
        Double pagototal;
        for (int i = 0; i < listaVenta.size(); i++) {
            sueldo_ba = sueldo_ba+listaVenta.get(i).sub_total();
        }
        txtTotal.setText(String.valueOf(sueldo_ba));
        mostrarEnTabla(venta);
        registarVentasEnElFichero(codigoProducto, cantidad);
        JOptionPane.showMessageDialog(null, "PRODUCTO "+producto+ " Añadido");
        limpiar_produtos();

    }//GEN-LAST:event_BTN_AÑADIRActionPerformed
    void limpiar_produtos(){
    txtcodigoproducto.setText("");
    txtDescripcionProduc.setText("");
    txtcolorProducto.setText("");
    cbxenvios.setSelectedIndex(0);
    txtprecioUnit.setText("");
    txtcantidad.setText("");
    txtcodigoproducto.requestFocus();
    
    }
    void limpiar_todo(){
    txtdni.setText("");
    txtnombres.setText("");
    txtcodigoVenta.setText("");
    txtdireccion.setText("");    
    txtcodigoproducto.setText("");
    txtDescripcionProduc.setText("");
    txtcolorProducto.setText("");
    cbxenvios.setSelectedIndex(0);
    txtprecioUnit.setText("");
    txtcantidad.setText("");
    txtFecha.setText("");
    txtdni.requestFocus();
    
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       VistaStock vs = new VistaStock();
       vs.setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed
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

    //METODOS PARA PRODUCTOS
    void extraer_pro() {
        String linea;
        Boolean bandera = true;
        try (FileReader fr = new FileReader("src\\STOCK\\Stock.txt");
                BufferedReader br = new BufferedReader(fr);) {

            while ((linea = br.readLine()) != null ) {
                String palabra[] = linea.split(", ");
                if (palabra[0].equals(txtcodigoproducto.getText())&& bandera == true) {
                    txtDescripcionProduc.setText(palabra[1]);
                    txtcolorProducto.setText(palabra[5]);
                    txtprecioUnit.setText(palabra[2]);
                    
                }else {
                    bandera = false;
                                       
                }
                   
            }
            if (bandera == false){
                JOptionPane.showMessageDialog(null, "No Registra");
            }else {
                JOptionPane.showMessageDialog(null, "Producto encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN BUSCAR PRODCUTO \n" + e);
        }

    }

    void registarVentasEnElFichero(String codigo, int cantidad) {
        File FicheroN = new File("src\\STOCK\\auxiliar.txt");
        try {
            FileReader fr = new FileReader(Fichero);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(FicheroN);
            BufferedWriter bw = new BufferedWriter(fw);
            String linea;

            while ((linea = br.readLine()) != null) {
                String separador = Pattern.quote(", ");
                String f[] = linea.split(separador);
                int da1;
                String ax = "";
                if (f[0].equals(codigo)) {
                    da1 = Integer.parseInt(f[4]) - cantidad;
                    f[4] = String.valueOf(da1);
                    ax = f[0] + ", " + f[1] + ", " + f[2] + ", " + f[3] + ", " + f[4] + ", " + f[5];
                    linea = ax;
                    System.out.println("Valor modificado " + ax);
                }
                bw.write(linea + "\n");
                System.out.println(linea);

            }
            br.close();
            fr.close();
            bw.close();
            fw.close();
            String nombraantiguo = Fichero.getName();
            borrar(Fichero);
            FicheroN.renameTo(Fichero);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    void borrar(File Ffichero) {
        try {
            // Comprovamos si el fichero existe  de ser así procedemos a borrar el archivo
            if (Ffichero.exists()) {
                Ffichero.delete();
                System.out.println("Ficherro Borrado");
            } else {
                System.out.println("Fichero no encontrado");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_AGREGAR_COMPRA;
    private javax.swing.JButton BTN_AÑADIR;
    private javax.swing.JButton BTN_BUSCAR_CLIENTE;
    private javax.swing.JButton BTN_BUSCAR_PRODUCTO;
    private javax.swing.JButton BTN_REGISTRARCLIENTE;
    private javax.swing.JComboBox<String> cbxenvios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtDescripcionProduc;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigoVenta;
    private javax.swing.JTextField txtcodigoproducto;
    private javax.swing.JTextField txtcolorProducto;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtprecioUnit;
    // End of variables declaration//GEN-END:variables
}
