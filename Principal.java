package com.vista;

import com.vista.Principal.1;
import com.vista.Principal.2;
import com.vista.Principal.3;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

public class Principal extends JFrame {
   private JButton btnContinue;
   private JPanel jPanel1;
   private JComboBox<String> rolComboBox;
   private JLabel rolLabel;
   private JLabel titulo;

   public Principal() {
      this.initComponents();
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.titulo = new JLabel();
      this.rolLabel = new JLabel();
      this.rolComboBox = new JComboBox();
      this.btnContinue = new JButton();
      this.setDefaultCloseOperation(3);
      this.titulo.setFont(new Font("Segoe UI", 0, 36));
      this.titulo.setText("GESTION COLEGIO");
      this.rolLabel.setFont(new Font("Segoe UI", 0, 24));
      this.rolLabel.setText("SELECCIONA TU ROL:");
      this.rolComboBox.setFont(new Font("Segoe UI", 0, 24));
      this.rolComboBox.setModel(new DefaultComboBoxModel(new String[]{"ADMIN", "DOCENTE", "ESTUDIANTE"}));
      this.rolComboBox.addActionListener(new 1(this));
      this.btnContinue.setFont(new Font("Segoe UI", 0, 18));
      this.btnContinue.setText("CONTINUAR");
      this.btnContinue.addActionListener(new 2(this));
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.btnContinue).addGap(292, 292, 292)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(134, 134, 134).addComponent(this.rolLabel).addGap(28, 28, 28).addComponent(this.rolComboBox, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(206, 206, 206).addComponent(this.titulo))).addContainerGap(145, 32767)));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(40, 40, 40).addComponent(this.titulo).addGap(100, 100, 100).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.rolLabel).addComponent(this.rolComboBox, -2, -1, -2)).addGap(32, 32, 32).addComponent(this.btnContinue).addContainerGap(115, 32767)));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
      this.pack();
   }

   private void btnContinueActionPerformed(ActionEvent evt) {
      String rol = (String)this.rolComboBox.getSelectedItem();
      MenuAdmin mAdmin = new MenuAdmin();
      MenuEstudiante mEstudiante = new MenuEstudiante();
      MenuDocente mDocente = new MenuDocente();
      byte var7 = -1;
      switch(rol.hashCode()) {
      case -1748547086:
         if (rol.equals("DOCENTE")) {
            var7 = 1;
         }
         break;
      case 62130991:
         if (rol.equals("ADMIN")) {
            var7 = 0;
         }
         break;
      case 142399954:
         if (rol.equals("ESTUDIANTE")) {
            var7 = 2;
         }
      }

      switch(var7) {
      case 0:
         mAdmin.setVisible(true);
         mAdmin.setLocationRelativeTo((Component)null);
         break;
      case 1:
         mDocente.setVisible(true);
         mDocente.setLocationRelativeTo((Component)null);
         break;
      case 2:
         mEstudiante.setVisible(true);
         mEstudiante.setLocationRelativeTo((Component)null);
      }

   }

   private void rolComboBoxActionPerformed(ActionEvent evt) {
   }

   public static void main(String[] args) {
      try {
         LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new 3());
   }
}
