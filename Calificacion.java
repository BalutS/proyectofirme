package com.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calificacion implements Serializable {
   private static final long serialVersionUID = 1L;
   private String nombre;
   private float nota;
   private int periodo;
   private LocalDate fecha;

   public Calificacion(String nombre, float nota, int periodo, LocalDate fecha) {
      this.nombre = nombre;
      this.nota = nota;
      this.periodo = periodo;
      this.fecha = fecha;
   }

   public String toString() {
      String var10000 = this.getNombre();
      return var10000 + "{nota:" + this.getNota() + ", periodo:" + this.getPeriodo() + ", fecha:" + this.getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "}";
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public float getNota() {
      return this.nota;
   }

   public void setNota(float nota) {
      this.nota = nota;
   }

   public int getPeriodo() {
      return this.periodo;
   }

   public void setPeriodo(int periodo) {
      this.periodo = periodo;
   }

   public LocalDate getFecha() {
      return this.fecha;
   }

   public void setFecha(LocalDate fecha) {
      this.fecha = fecha;
   }
}
