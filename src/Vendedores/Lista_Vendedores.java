package Vendedores;

import javax.swing.JOptionPane;
import java.io.*;

public class Lista_Vendedores extends javax.swing.JPanel {

    NodoV inicio, fin;
    NodoV arreglo[];
    NodoV NV;
    int num;

    public Lista_Vendedores() {
        initComponents();
        arreglo = new NodoV[200];
        encabezado();
        //ExtraerdeArchivo();
    }

    NodoV insertaAlInicio(NodoV inicio, String codigo, String nombre, String fnaci, String dni, String contra, String usuario) {
        NodoV nuevo = new NodoV(codigo, nombre, fnaci, dni, contra, usuario);
        nuevo.siguiente = inicio;
        inicio = nuevo;
        return inicio;
    }

    void LimpiarEntradas() {
        jtxtCodigo.setText("");
        jtxtNombre.setText("");
        jtxtDNI.setText("");
        jtxtFnacimiento.setText("");
        jtxtUsuario.setText("");
        jtxtContraseña.setText("");
        jtxtCodigo.requestFocus();
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
        jtxtContraseña = new javax.swing.JTextField();
        jtxtFnacimiento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

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

        jtxtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));

        jtxtFnacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de nacimiento"));
        jtxtFnacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFnacimientoActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(15, 15, 15)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jScrollPane2)
                    .add(layout.createSequentialGroup()
                        .add(jtxtDNI, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtxtFnacimiento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jtxtContraseña, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(97, 97, 97)
                        .add(jbtnGrabar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jtxtCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtxtNombre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtxtUsuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(38, 38, 38)
                        .add(jbtnSalir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jbtnLimpiar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jtxtCodigo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .add(jtxtNombre)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jtxtUsuario)
                        .add(jbtnSalir, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jbtnLimpiar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jtxtDNI, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .add(jtxtFnacimiento)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jtxtContraseña, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jbtnGrabar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed

    private void jbtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarActionPerformed
        String cod = jtxtCodigo.getText();
        String nom = jtxtNombre.getText();
        String dni = jtxtDNI.getText();
        String f_nacimiento = jtxtFnacimiento.getText();
        String usuario = jtxtUsuario.getText();
        String contraseña = jtxtContraseña.getText();
        inicio = insertaAlInicio(inicio, cod, nom, dni, dni, contraseña, usuario);
        arreglo[num] = inicio;
        num++;
        VerDatos();
        GrabarArchivo(inicio);
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
    void encabezado() {
        jTextArea1.setText("");
        //insertar encabezado
        jTextArea1.append("");//3-3-
        jTextArea1.append("N°  CODIGO      NOMBRES       F.NACIMIENTO         DNI       CONTRASEÑA          USUARIO\n");
        jTextArea1.append("-------------------------------------------------------------------------------------------\n");
    }

    void VerDatos() {
        String codigo, nombre, fnaci, dni, contra, usuario;
        NodoV aux = inicio;
        num = 0;
        encabezado();

        while (aux != null) {
            codigo = aux.codigo;
            nombre = aux.nombre;
            fnaci = aux.fnaci;
            dni = aux.dni;
            contra = aux.contra;
            usuario = aux.usuario;

            num++;
            String numera = String.valueOf(num);

            for (int i = String.valueOf(num).length(); i < 2; i++) {
                numera = " " + numera;
            }
            for (int i = codigo.length(); i < 10; i++) {
                codigo = " " + codigo;
            }
            for (int i = nombre.length(); i < 20; i++) {
                nombre = " " + nombre;
            }
            for (int i = fnaci.length(); i < 20; i++) {
                fnaci = " " + fnaci;
            }
            for (int i = dni.length(); i < 20; i++) {
                dni = " " + dni;
            }
            for (int i = contra.length(); i < 20; i++) {
                contra = " " + contra;
            }
            for (int i = usuario.length(); i < 20; i++) {
                usuario = " " + usuario;
            }

            jTextArea1.append(numera + "    " + codigo
                    + "    " + nombre + "   " + fnaci
                    + "   " + dni + "   " + contra
                    + "   " + usuario + "\n");

            aux = aux.siguiente;
        }
    }

    void GrabarArchivo(NodoV NV) {
        try {
            FileWriter fw = new FileWriter("src/Vendedores/Vendedores.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(NV.codigo + ", " + NV.nombre + ", " + NV.fnaci + ", " + NV.dni + ", " + NV.contra + ", " + NV.usuario);
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA GRABACION", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnGrabar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtContraseña;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtFnacimiento;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
