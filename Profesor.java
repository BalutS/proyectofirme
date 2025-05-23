package com.modelo;

import java.io.Serializable;

public class Profesor extends Persona implements Serializable {
   private static final long serialVersionUID = 1L;
   private Curso curso;

   public Profesor() {
   }

   public Profesor(Curso curso, String nombre, int edad, int cedula, int codigo, String tipo) {
      super(nombre, edad, cedula, codigo, tipo);
      this.curso = curso;
   }

   public void calificarEstudiante(int codEst, String asig, Calificacion cal) {
      this.getCurso().buscarEstudiante(codEst).buscarAsignatura(asig).agregarCalificacion(cal);
   }

   public String listarEstudiantes() {
      return this.getCurso().listarEstudiantes();
   }

   public String toString() {
      String var10000 = super.toString();
      return var10000 + this.getCurso().toString();
   }

   public Curso getCurso() {
      return this.curso;
   }

   public void setCurso(Curso curso) {
      this.curso = curso;
   }
}
