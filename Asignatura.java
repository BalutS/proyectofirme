package com.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Asignatura {
   private String nombre;
   private ArrayList<Calificacion> calificaciones;

   public Asignatura(String nombre) {
      this.nombre = nombre;
      this.calificaciones = new ArrayList();
   }

   public void agregarCalificacion(Calificacion cal) {
      this.getCalificaciones().add(cal);
   }

   public String listarCalificaiones() {
      String lis = "";

      Calificacion calificacion;
      for(Iterator var2 = this.getCalificaciones().iterator(); var2.hasNext(); lis = lis + calificacion.toString() + "\n") {
         calificacion = (Calificacion)var2.next();
      }

      return lis;
   }

   public float promedio() {
      float sum = 0.0F;

      Calificacion calificacion;
      for(Iterator var2 = this.calificaciones.iterator(); var2.hasNext(); sum += calificacion.getNota()) {
         calificacion = (Calificacion)var2.next();
      }

      return sum / (float)this.calificaciones.size();
   }

   public String toString() {
      String var10000 = this.nombre;
      return "Asignatura{nombre=" + var10000 + ", calificaciones=" + this.promedio() + "}";
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public ArrayList<Calificacion> getCalificaciones() {
      return this.calificaciones;
   }

   public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
      this.calificaciones = calificaciones;
   }
}
