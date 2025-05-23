package com.vista;

import com.modelo.Colegio;
import com.modelo.Dao;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MenuAdmin extends JFrame {
   private JButton jButton1;
   private JButton jButton2;
   private JButton jButton3;
   private JButton jButton4;
   private JLabel jLabel1;
   private JLabel titulo;

   private Colegio colegio;
   private static final String DATA_FILE = "colegio.dat";

   public MenuAdmin() {
      this.initComponents();
      this.colegio = Dao.cargarDatos(DATA_FILE);
      if (this.colegio == null) {
         this.colegio = new Colegio("Mi Colegio Predeterminado"); // Or any default name
         System.out.println("No se encontraron datos existentes. Se ha creado una nueva instancia de Colegio.");
      } else {
         System.out.println("Datos de Colegio cargados exitosamente desde " + DATA_FILE);
      }

      this.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            Dao.guardarDatos(colegio, DATA_FILE);
            System.out.println("Datos de Colegio guardados exitosamente en " + DATA_FILE);
            super.windowClosing(e);
         }
      });
   }

   public Colegio getColegio() {
      return this.colegio;
   }

   private void initComponents() {
      this.jLabel1 = new JLabel();
      this.titulo = new JLabel();
      this.jButton1 = new JButton();
      this.jButton2 = new JButton();
      this.jButton3 = new JButton();
      this.jButton4 = new JButton();
      this.setDefaultCloseOperation(3);
      this.jLabel1.setFont(new Font("Segoe UI", 0, 24));
      this.jLabel1.setText("MENU ADMIN");
      this.titulo.setFont(new Font("Segoe UI", 0, 36));
      this.titulo.setText("GESTION COLEGIO");
      this.jButton1.setText("Agregar Docente");
      this.jButton2.setText("Agregar Estudiante");
      this.jButton3.setText("Listar Docente");
      this.jButton4.setText("Listar Estudiante");
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1, -2, 164, -2).addGap(274, 274, 274)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(209, 209, 209).addComponent(this.titulo)).addGroup(layout.createSequentialGroup().addGap(73, 73, 73).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jButton2, -1, -1, 32767).addComponent(this.jButton1, -1, -1, 32767)).addGap(30, 30, 30).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jButton4, -1, -1, 32767).addComponent(this.jButton3, -2, 132, -2)))).addContainerGap(209, 32767)));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(17, 17, 17).addComponent(this.titulo).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel1).addGap(60, 60, 60).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jButton1).addGap(18, 18, 18).addComponent(this.jButton2)).addGroup(layout.createSequentialGroup().addComponent(this.jButton3).addGap(18, 18, 18).addComponent(this.jButton4))).addContainerGap(178, 32767)));
      this.pack();
   }
}
