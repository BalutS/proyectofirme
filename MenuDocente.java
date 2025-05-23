package com.vista;

import com.modelo.Colegio;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;

public class MenuDocente extends JFrame {
   private Colegio colegio;

   public MenuDocente(Colegio colegio) {
      this.colegio = colegio;
      this.initComponents();
   }

   private void initComponents() {
      this.setDefaultCloseOperation(3);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGap(0, 720, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGap(0, 405, 32767));
      this.pack();
   }
}
