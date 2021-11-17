package Vendedores;

import Vendedores.Vendedores;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.table.TableColumn;

public class Lista_Vendedores extends javax.swing.JPanel {

DefaultTableModel ModeloTabla;
Vendedores UnEmp;
Vendedores[] ArregloEmp;
String[] cabecera={"N","Codigo","Nombre","DNI","F. de nacimiento","Usuario","Contraseña"};

String[][] data={};
        
int NumEmp;
    
    public Lista_Vendedores() {
        initComponents();
        ArregloEmp=new Vendedores[100];
        ModeloTabla=new DefaultTableModel(data,cabecera);
        jtblDatos.setModel(ModeloTabla);
        CambiarTamañoColumnas();
        NumEmp=0;
        ExtraerDeArchivo();
    }
     
    void InsertarenTabla(Vendedores UnEmp){
      DecimalFormat df2= new DecimalFormat("####.00");
     
      Object[]fila={NumEmp+1, UnEmp.codigo,UnEmp.nombre,UnEmp.dni,
          UnEmp.f_nacimiento,UnEmp.usuario,UnEmp.contraseña,};
          
      ModeloTabla.addRow(fila);
      }
  void LimpiarEntradas(){
      jtxtCodigo.setText("");
      jtxtNombre.setText("");
      jtxtDNI.setText("");
      jtxtFnacimiento.setText("");
      jtxtUsuario.setText("");
      jtxtContraseña.setText("");
      jtxtCodigo.requestFocus();
  }

  void GrabarEnArchivo(Vendedores e){
    try{
        FileWriter fw= new FileWriter("src/Empleados/Empleados.txt",true);
        PrintWriter pw= new PrintWriter(fw);
        pw.println(e.codigo+", "+e.nombre+", "+e.dni+", "+e.f_nacimiento+
                ", "+e.usuario+", "+e.contraseña);
        pw.close();
      } catch (Exception ex){
          JOptionPane.showMessageDialog(null,"Error en la grabación...."+ex);
    }
  }
    
void CambiarTamañoColumnas(){
        TableColumn column=null;
        column = jtblDatos.getColumnModel().getColumn(0);
        column.setPreferredWidth(30);
        column = jtblDatos.getColumnModel().getColumn(1);
        column.setPreferredWidth(60);
        column = jtblDatos.getColumnModel().getColumn(2);
        column.setPreferredWidth(150);
        column = jtblDatos.getColumnModel().getColumn(3);
        column.setPreferredWidth(110);
    }
    
        void ExtraerDeArchivo(){
        String linea;
        try{
           FileReader fr= new FileReader("src/Vendedores/Vendedores.txt");
           BufferedReader br= new BufferedReader(fr);
           while ((linea=br.readLine())!=null){
               StringTokenizer st=new StringTokenizer(linea,",");
               String cod=st.nextToken();
               String nom=st.nextToken();
               String dni=st.nextToken();
               String f_nacimiento=st.nextToken();
               String usuario=st.nextToken();
               String contraseña=st.nextToken();
               
               UnEmp= new Vendedores(cod,nom,dni,f_nacimiento,usuario,contraseña);
               
               ArregloEmp[NumEmp]=UnEmp;
               InsertarenTabla(UnEmp);
               NumEmp++;
           }
           br.close();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error en la lectura del archivo...."+ex);
        }
           
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtCodigo = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jbtnGrabar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtDNI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jtxtContraseña = new javax.swing.JTextField();
        jtxtFnacimiento = new javax.swing.JTextField();

        jtxtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));
        jtxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoActionPerformed(evt);
            }
        });

        jtxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        jbtnGrabar.setText("GRABAR");
        jbtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setText("LIMPIAR");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnSalir.setBackground(new java.awt.Color(255, 51, 51));
        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jtxtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));

        jtxtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        jtxtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDNIActionPerformed(evt);
            }
        });

        jtblDatos.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
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
        jtblDatos.setToolTipText("");
        jScrollPane1.setViewportView(jtblDatos);

        jtxtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));

        jtxtFnacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de nacimiento"));
        jtxtFnacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFnacimientoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jtxtDNI, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jtxtFnacimiento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jtxtContraseña, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(97, 97, 97)
                .add(jbtnGrabar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jtxtCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtxtNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtxtUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(38, 38, 38)
                        .add(jbtnSalir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jbtnLimpiar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 756, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(65, 65, 65)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jtxtCodigo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .add(jtxtNombre)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jtxtUsuario)
                        .add(jbtnSalir, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jbtnLimpiar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jtxtDNI, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .add(jtxtFnacimiento)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jtxtContraseña)
                        .add(jbtnGrabar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 301, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed

    private void jbtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarActionPerformed
        String cod=jtxtCodigo.getText();
        String nom=jtxtNombre.getText();
        String dni=jtxtDNI.getText();
        String f_nacimiento=jtxtFnacimiento.getText();
        String usuario=jtxtUsuario.getText();
        String contraseña=jtxtContraseña.getText();

        UnEmp= new Vendedores(cod,nom,dni,f_nacimiento,usuario,contraseña);

        ArregloEmp[NumEmp]=UnEmp;
        GrabarEnArchivo(UnEmp);
        InsertarenTabla(UnEmp);
        NumEmp++;
        LimpiarEntradas();
    }//GEN-LAST:event_jbtnGrabarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        LimpiarEntradas();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jtxtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDNIActionPerformed

    private void jtxtFnacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFnacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFnacimientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnGrabar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTable jtblDatos;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtContraseña;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtFnacimiento;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
