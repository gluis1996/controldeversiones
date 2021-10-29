
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class VISTA extends javax.swing.JFrame {

    int ejex;
    int ejey;

    public VISTA() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BARRA_SUPERIOR = new javax.swing.JPanel();
        CERRAR = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtpassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BARRA_SUPERIOR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BARRA_SUPERIORMouseDragged(evt);
            }
        });
        BARRA_SUPERIOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BARRA_SUPERIORMousePressed(evt);
            }
        });

        CERRAR.setBackground(new java.awt.Color(204, 204, 255));
        CERRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        CERRAR.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        salir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setText("X");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CERRARLayout = new javax.swing.GroupLayout(CERRAR);
        CERRAR.setLayout(CERRARLayout);
        CERRARLayout.setHorizontalGroup(
            CERRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CERRARLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CERRARLayout.setVerticalGroup(
            CERRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CERRARLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BARRA_SUPERIORLayout = new javax.swing.GroupLayout(BARRA_SUPERIOR);
        BARRA_SUPERIOR.setLayout(BARRA_SUPERIORLayout);
        BARRA_SUPERIORLayout.setHorizontalGroup(
            BARRA_SUPERIORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BARRA_SUPERIORLayout.createSequentialGroup()
                .addComponent(CERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 726, Short.MAX_VALUE))
        );
        BARRA_SUPERIORLayout.setVerticalGroup(
            BARRA_SUPERIORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CERRAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(BARRA_SUPERIOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/AVATARP.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cabecera0752.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 70));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel3.setText("Password:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel6.setText("Username:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtusername.setForeground(new java.awt.Color(204, 204, 204));
        txtusername.setText("Ingrese su nombre de usuario");
        txtusername.setToolTipText("");
        txtusername.setBorder(null);
        txtusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusernameMousePressed(evt);
            }
        });
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 270, 30));

        jCheckBox1.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jCheckBox1.setText("Recordar");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jButton1.setBackground(new java.awt.Color(85, 110, 230));
        jButton1.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log in");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 270, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 270, -1));

        txtpassword.setForeground(new java.awt.Color(204, 204, 204));
        txtpassword.setText("********");
        txtpassword.setBorder(null);
        txtpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpasswordMousePressed(evt);
            }
        });
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 270, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 338, 380));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/DASH.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ECLIPCE.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //https://es.stackoverflow.com/questions/248516/login-por-medio-de-txt
        //http://ocw.udl.cat/enginyeria-i-arquitectura/programacio-2/continguts-1/4-manejo-bai81sico-de-archivos-en-java.pdf
        String usua = txtusername.getText();
        String pass = txtpassword.getText();
        DASHBOARD ds = new DASHBOARD();

        String linea;
        boolean con = false;

        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));) {
            while ((linea = br.readLine()) != null) {
                String palabra[] = linea.split(" ");
                if (palabra[0].equals(usua) && palabra[1].equals(pass)) {
                    JOptionPane.showMessageDialog(null, "BIENBENIDO");
                    con = true;
                    dispose();
                    ds.setVisible(true);
                }
            }
            if (!con) {
                JOptionPane.showMessageDialog(null, "verifique el nombre del usuario o contraseña");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "error en la bd");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BARRA_SUPERIORMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BARRA_SUPERIORMousePressed
        ejex = evt.getX();
        ejey = evt.getY();
    }//GEN-LAST:event_BARRA_SUPERIORMousePressed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void BARRA_SUPERIORMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BARRA_SUPERIORMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - ejex, y - ejey);
    }//GEN-LAST:event_BARRA_SUPERIORMouseDragged

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        CERRAR.setBackground(Color.red);
        salir.setForeground(Color.WHITE);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        CERRAR.setBackground(new Color(204, 204, 255));
        salir.setForeground(Color.black);
    }//GEN-LAST:event_salirMouseExited

    private void txtusernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusernameMousePressed
        if (txtusername.getText().equals("Ingrese su nombre de usuario")) {
            txtusername.setText("");
            txtusername.setForeground(Color.black);
        }else if (String.valueOf(txtpassword.getPassword()).isEmpty()) {
            txtpassword.setText("********");
            txtpassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtusernameMousePressed

    private void txtpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordMousePressed
        if (String.valueOf(txtpassword.getPassword()).equals("********")) {
            txtpassword.setText("");
            txtpassword.setForeground(Color.black);
        }else if (txtusername.getText().equals("Ingrese su nombre de usuario")) {
            txtusername.setText("");
            txtusername.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtpasswordMousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(VISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VISTA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VISTA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BARRA_SUPERIOR;
    private javax.swing.JPanel CERRAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel salir;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
