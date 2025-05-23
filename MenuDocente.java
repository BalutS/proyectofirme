package com.vista;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;

public class MenuDocente extends JFrame {
   public MenuDocente() {
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
