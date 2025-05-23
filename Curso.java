package com.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Curso implements Serializable {
   private static final long serialVersionUID = 1L;
   private int grado;
   private int grupo;
   private ArrayList<Estudiante> estudiantes;
   private Profesor profesor;

   public Curso() {
   }

   public Curso(int grado, int grupo, ArrayList<Estudiante> estudiantes) {
      this.grado = grado;
      this.grupo = grupo;
      this.estudiantes = estudiantes;
      this.profesor = new Profesor();
   }

   public Estudiante buscarEstudiante(int codigo) {
      Estudiante est = null;
      Iterator var3 = this.estudiantes.iterator();

      while(var3.hasNext()) {
         Estudiante estudiante = (Estudiante)var3.next();
         if (estudiante.getCodigo() == codigo) {
            est = estudiante;
         }
      }

      return est;
   }

   public String listarEstudiantes() {
      String lis = "";

      Estudiante estudiante;
      for(Iterator var2 = this.estudiantes.iterator(); var2.hasNext(); lis = lis + estudiante.toString()) {
         estudiante = (Estudiante)var2.next();
      }

      return lis;
   }

   public String infoCurso() {
      String var10000 = this.toString();
      return var10000 + "\n" + this.profesor.toString() + this.listarEstudiantes();
   }

   public String toString() {
      return "curso: " + this.grado + " - " + this.grupo + "\n profesor";
   }

   public int getGrado() {
      return this.grado;
   }

   public void setGrado(int grado) {
      this.grado = grado;
   }

   public int getGrupo() {
      return this.grupo;
   }

   public void setGrupo(int grupo) {
      this.grupo = grupo;
   }

   public ArrayList<Estudiante> getEstudiantes() {
      return this.estudiantes;
   }

   public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
      this.estudiantes = estudiantes;
   }

   public Profesor getProfesor() {
      return this.profesor;
   }

   public void setProfesor(Profesor profesor) {
      this.profesor = profesor;
   }
}
