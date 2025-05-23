package com.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Estudiante extends Persona implements Serializable {
   private static final long serialVersionUID = 1L;
   private Curso curso = new Curso();
   private ArrayList<Asignatura> asignaturas;

   public Estudiante(ArrayList<Asignatura> asignaturas, String nombre, int edad, int cedula, int codigo, String tipo) {
      super(nombre, edad, cedula, codigo, tipo);
      this.asignaturas = asignaturas;
   }

   public Asignatura buscarAsignatura(String nombre) {
      Asignatura asig = null;
      Iterator var3 = this.getAsignaturas().iterator();

      while(var3.hasNext()) {
         Asignatura asignatura = (Asignatura)var3.next();
         if (asignatura.getNombre().equalsIgnoreCase(nombre)) {
            asig = asignatura;
         }
      }

      return asig;
   }

   public String reporteAcademico() {
      String var10000 = this.toString();
      return var10000 + "\n Asignaturas: \n" + this.promedioAsignaturas() + "\n Promedio General:" + this.promedioGeneral();
   }

   private String promedioAsignaturas() {
      String lis = "";

      Asignatura asignatura;
      for(Iterator var2 = this.asignaturas.iterator(); var2.hasNext(); lis = asignatura.toString() + "\n") {
         asignatura = (Asignatura)var2.next();
      }

      return lis;
   }

   private float promedioGeneral() {
      float sum = 0.0F;

      Asignatura asignatura;
      for(Iterator var2 = this.asignaturas.iterator(); var2.hasNext(); sum += asignatura.promedio()) {
         asignatura = (Asignatura)var2.next();
      }

      return sum / (float)this.asignaturas.size();
   }

   public String toString() {
      String var10000 = super.toString();
      return var10000 + ", curso:" + this.curso.toString();
   }

   public ArrayList<Asignatura> getAsignaturas() {
      return this.asignaturas;
   }

   public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
      this.asignaturas = asignaturas;
   }

   public Curso getCurso() {
      return this.curso;
   }

   public void setCurso(Curso curso) {
      this.curso = curso;
   }
}
