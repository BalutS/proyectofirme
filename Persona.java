package com.modelo;

public class Persona {
   private String nombre;
   private int edad;
   private int cedula;
   private int codigo;
   private String tipo;

   public Persona() {
   }

   public Persona(String nombre, int edad, int cedula, int codigo, String tipo) {
      this.nombre = nombre;
      this.edad = edad;
      this.cedula = cedula;
      this.codigo = codigo;
      this.tipo = tipo;
   }

   public String toString() {
      String var10000 = this.getNombre();
      return "nombre: " + var10000 + ", edad: " + this.getEdad() + ", cedula: " + this.getCedula() + ", codigo: " + this.getCodigo() + ", codigo: " + this.getTipo();
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getEdad() {
      return this.edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public int getCedula() {
      return this.cedula;
   }

   public void setCedula(int cedula) {
      this.cedula = cedula;
   }

   public int getCodigo() {
      return this.codigo;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   public String getTipo() {
      return this.tipo;
   }

   public void setTipo(String tipo) {
      this.tipo = tipo;
   }
}
