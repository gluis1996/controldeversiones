package STOCK;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import STOCK.Nodo;

public class VISTAStockk extends javax.swing.JPanel {
    
    DefaultTableModel miModelo;
    String[] cabecera={"ID","NOMBRE","PRECIO","CATEGORIA","COLOR","CANTIDAD️"};
    String[][] data={};
    
    public Nodo lc;
    public Nodo pFound;
    int num = 0;
    
    Nodo DN;
    Nodo dn[];

    public VISTAStockk() {
        initComponents();
        dn = new Nodo[1000];
        lc = pFound = null;
                
        miModelo = new DefaultTableModel(data, cabecera);
        jTablestock.setModel(miModelo);
        ExtraerdeArchivo();
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtf_precio = new javax.swing.JTextField();
        jtf_cantidad = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_ID = new javax.swing.JTextField();
        jcb_color = new javax.swing.JComboBox<>();
        jcb_categoria = new javax.swing.JComboBox<>();
        jbt_guardar = new javax.swing.JButton();
        jbt_eliminar = new javax.swing.JButton();
        jbt_modificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablestock = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jbt_mostrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Stock de productos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 510, 50));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setText("ID:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 20, -1));

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 60, -1));

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel5.setText("Precio:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 50, -1));

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel6.setText("Categoria:");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, -1));

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad:");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 70, -1));

        jtf_precio.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jtf_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 80, 30));

        jtf_cantidad.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jtf_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 80, 30));

        jtf_nombre.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jtf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 210, 30));

        jtf_ID.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jtf_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 80, 30));

        jcb_color.setBackground(new java.awt.Color(153, 153, 153));
        jcb_color.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jcb_color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROJA", "AZUL", "NEGRO", "BLANCO", "ROSA", "VERDE" }));
        jcb_color.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jcb_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 110, 30));

        jcb_categoria.setBackground(new java.awt.Color(153, 153, 153));
        jcb_categoria.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jcb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POLERA CORTA", "POLERA CIERRE", "POLO CORTO", "POLO MANGALARGA", "PANTALON JEAN", "PANTALON POLAR", "SHORTs" }));
        jcb_categoria.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jcb_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 190, 30));

        jbt_guardar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jbt_guardar.setText("GUARDAR");
        jbt_guardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 110, 40));

        jbt_eliminar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jbt_eliminar.setText("ELIMINAR");
        jbt_eliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 110, 40));

        jbt_modificar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jbt_modificar.setText("MODIFICAR");
        jbt_modificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 110, 40));

        jLabel9.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("..............................................................................");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 780, 40));

        jTablestock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablestock);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 780, 320));

        jLabel10.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel10.setText(" Color:");
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 50, -1));

        jbt_mostrar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jbt_mostrar.setText("BUSCAR");
        jbt_mostrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbt_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_mostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 110, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 800, 515));
    }// </editor-fold>//GEN-END:initComponents

    void mostarEntabla(Nodo lc){
       Object Fila [] = {lc.id,lc.nombre,lc.precio,lc.categoria,lc.color,lc.cantidad};
       miModelo.addRow(Fila);
    }
    
    private void jbt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_guardarActionPerformed
        // TODO add your handling code here:
        String id=jtf_ID.getText();
        String nombre=jtf_nombre.getText().toUpperCase();
        String precio=jtf_precio.getText().toUpperCase();
        String categoria=jcb_categoria.getSelectedItem().toString();  
        String color=jcb_color.getSelectedItem().toString();
        String cantidad=jtf_cantidad.getText().toUpperCase();
              
        lc = InsertarFinal(lc,id,nombre,precio,categoria,color,cantidad);
        dn[num] = lc;        
        GrabarArchivo(lc);
        LimpiarEntradas();       
        VerDatos();
       
    }//GEN-LAST:event_jbt_guardarActionPerformed

    private void jbt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_modificarActionPerformed
        // TODO add your handling code here:
        pFound.id=jtf_ID.getText();
        pFound.nombre=jtf_nombre.getText();
        pFound.precio=jtf_precio.getText();
        pFound.categoria=jcb_categoria.getSelectedItem().toString();
        pFound.color=jcb_color.getSelectedItem().toString();
        pFound.cantidad=jtf_cantidad.getText();
               
        Desabilitar();
        LimpiarEntradas();
        VerDatos();
        
        //GrabarArchivo(lc);
    }//GEN-LAST:event_jbt_modificarActionPerformed

    private void jbt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_eliminarActionPerformed
        // TODO add your handling code here:
        Eliminar();
        LimpiarEntradas();
        VerDatos();
        if(lc==null){
            JOptionPane.showMessageDialog(this, "La lista esta vacia");       
        }
        Desabilitar();  
        //ExtraerdeArchivo();
        
    }//GEN-LAST:event_jbt_eliminarActionPerformed

    private void jbt_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_mostrarActionPerformed
        // TODO add your handling code here:
        String id=jtf_ID.getText();
        if(id.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo por favor");
        }else{
            pFound=Buscar(lc,id);
            
            if(pFound!=null){               
              jtf_nombre.setText(pFound.nombre);
              
              if(pFound.categoria.equalsIgnoreCase("POLERA CORTA")){
                  jcb_categoria.setSelectedIndex(0);           
              }else if(pFound.categoria.equalsIgnoreCase("POLERA CIERRE")){
                  jcb_categoria.setSelectedIndex(1);
              }else if(pFound.categoria.equalsIgnoreCase("POLO CORTO")){
                  jcb_categoria.setSelectedIndex(2);
              }else if(pFound.categoria.equalsIgnoreCase("POLO MANGALARGA")){
                  jcb_categoria.setSelectedIndex(3);
              }else if(pFound.categoria.equalsIgnoreCase("PANTALON JEAN")){
                  jcb_categoria.setSelectedIndex(4);
              }else if(pFound.categoria.equalsIgnoreCase("PANTALON POLAR")){
                  jcb_categoria.setSelectedIndex(5);
              }else if(pFound.categoria.equalsIgnoreCase("SHORTs")){
                  jcb_categoria.setSelectedIndex(6);
              } 
                        
              if(pFound.color.equalsIgnoreCase("ROJO")){
                  jcb_color.setSelectedIndex(0);           
              }else if(pFound.color.equalsIgnoreCase("AZUL")){
                  jcb_color.setSelectedIndex(1);
              }else if(pFound.color.equalsIgnoreCase("NEGRO")){
                  jcb_color.setSelectedIndex(2);
              }else if(pFound.color.equalsIgnoreCase("BLANCO")){
                  jcb_color.setSelectedIndex(3);
              }else if(pFound.color.equalsIgnoreCase("ROSA")){
                  jcb_color.setSelectedIndex(4);
              }else if(pFound.color.equalsIgnoreCase("VERDE")){
                  jcb_color.setSelectedIndex(5);
              }
              
              jtf_precio.setText(pFound.precio); 
              jtf_cantidad.setText(pFound.cantidad);
              
              Habilitar();
              
            }else{
                JOptionPane.showMessageDialog(this, "El ID: "+id+ ", NO esta en la lista" );
            }
        }
    }//GEN-LAST:event_jbt_mostrarActionPerformed

    Nodo Buscar(Nodo lc, String cod)
    {   Nodo actual;
        boolean encontrado = false;
        actual = lc;
        
        while((actual.enlace!=lc)&&(!encontrado)){
            encontrado=actual.enlace.id.equalsIgnoreCase(jtf_ID.getText().trim());
            if(!encontrado){
                actual=actual.enlace;
            }
        }
        
        return actual.enlace;
    }
    
    Nodo InsertarFinal(Nodo lc, String ide, String nom, String pre, String catg, String col, String cantda)
    {
        Nodo nuevo= new Nodo(ide,nom,pre,catg,col,cantda);
        
        if(lc!=null){
            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;
        }
        lc = nuevo;
        return lc;
    }
    
    void Eliminar(){
        Nodo actual;
        boolean encontrado = false;
        actual=lc;
        
        while((actual.enlace!=lc)&&(!encontrado))
        {
            encontrado = actual.enlace.id.equalsIgnoreCase(jtf_ID.getText().trim());
            if(!encontrado){
                actual=actual.enlace;
            }
        }
        //verificando el dato
        encontrado = actual.enlace.id.equalsIgnoreCase(jtf_ID.getText().trim());
        //enlace de nodo anterior con el siguiente
        if(encontrado){
            Nodo p;
            p = actual.enlace;
            if(lc==lc.enlace) lc=null;
            else 
            {   if(p==lc)
                   lc = actual;//Se borra el elemento referenciado por lc
                   //el nuevo acceso a la lista en el anterior
                   actual.enlace = p.enlace;
            }
        }
        VerDatos();
    }
    
    void VerDatos(){
        String id,nombre,precio,categoria,color,cantidad;
        float s;
        vaciar_tabla();//limpiando la tabla
        Nodo p;//puntero 
        
        if(lc!=null){
            //num=0;
            p=lc.enlace;
            
            do{
                id = p.id;
                nombre = p.nombre;
                precio = p.precio;
                categoria = p.categoria;
                color = p.color;
                cantidad = p.cantidad;              
                //num++;
                
                Object[] fila={id,nombre,precio,categoria,color,cantidad};
                miModelo.addRow(fila);
                
                p = p.enlace;
                
            }while(p!=lc.enlace);
        }
    }
    
    void vaciar_tabla(){
        int filas=jTablestock.getRowCount();
        
        for(int i=0; i<filas; i++){
            miModelo.removeRow(0);
        }
    }
    
    void LimpiarEntradas(){
        jtf_nombre.setText(" ");
        jtf_precio.setText(" ");
        jcb_categoria.setSelectedIndex(0);
        jcb_color.setSelectedIndex(0);
        jtf_cantidad.setText(" ");
        jtf_ID.requestFocus();
    }
    
    void Habilitar(){
        jbt_modificar.setEnabled(true);
        jbt_eliminar.setEnabled(true);
        jbt_guardar.setEnabled(false);
    }
    
    void Desabilitar(){
        jbt_modificar.setEnabled(false);
        jbt_eliminar.setEnabled(false);
        jbt_guardar.setEnabled(true);
    }
    
  /*  void GrabarArchivo(Nodo lc) {
        try {
            FileOutputStream out= new FileOutputStream("Stock.txt");
            ObjectOutputStream salida = new ObjectOutputStream(out);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA GRABACION", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }*/
    
 /*   void ExtraerdeArchivo() {
        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("Stock.txt"));
            mostarEntabla(lc) = (mostarEntabla(lc)) leer.readObject();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA LECTURA");
        }
    }*/
    
 
    void GrabarArchivo(Nodo lc) {
        try {
            FileWriter fw = new FileWriter("Stock.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            //"ID","NOMBRE","PRECIO","CATEGORIA","COLOR","CANTIDAD️"
            pw.println(lc.id+"|"+lc.nombre+"|"+lc.precio+"|"+lc.categoria+"|"+lc.color+"|"+lc.cantidad);
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA GRABACION", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    void ExtraerdeArchivo() {
        String linea;
        try (FileReader fr = new FileReader("Stock.txt");
                BufferedReader br = new BufferedReader(fr);) {

            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "|");
                String id = st.nextToken();
                String nombre = st.nextToken();
                String precio = st.nextToken();
                String categoria = st.nextToken();
                String color = st.nextToken();
                String cantidad = st.nextToken();
                lc = new Nodo(id,nombre,precio,categoria,color,cantidad);
                //dn[num] = DN;
                mostarEntabla(lc);
                //num++;
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL EXTRAER");
        }

    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablestock;
    private javax.swing.JButton jbt_eliminar;
    private javax.swing.JButton jbt_guardar;
    private javax.swing.JButton jbt_modificar;
    private javax.swing.JButton jbt_mostrar;
    private javax.swing.JComboBox<String> jcb_categoria;
    private javax.swing.JComboBox<String> jcb_color;
    private javax.swing.JTextField jtf_ID;
    private javax.swing.JTextField jtf_cantidad;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_precio;
    // End of variables declaration//GEN-END:variables
}
