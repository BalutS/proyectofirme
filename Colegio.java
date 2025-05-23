package com.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Colegio implements Serializable {
   private static final long serialVersionUID = 1L;
   private String nombre;
   private ArrayList<Persona> personas;
   private ArrayList<Curso> cursos;
   private ArrayList<Asignatura> asignaturas;

   public Colegio(String nombre) {
      this.nombre = nombre;
      this.personas = new ArrayList();
      this.cursos = new ArrayList();
      this.asignaturas = new ArrayList();
   }

   public void agregarEstudiante(Estudiante est) {
      this.personas.add(est);
   }

   public void agregarProfesor(Profesor prof) {
      this.personas.add(prof);
   }

   public void agregarCurso(Curso curso) {
      this.cursos.add(curso);
   }

   public void agregarAsignatura(Asignatura asig) {
      this.asignaturas.add(asig);
   }

   public void agregarCursoAProfesor(int codigo, int grado, int grupo) {
      this.buscarProfesor(codigo).setCurso(this.buscarCurso(grado, grupo));
      this.buscarCurso(grado, grupo).setProfesor(this.buscarProfesor(codigo));
   }

   public void agregarEstudianteACurso(int codigo, int grado, int grupo) {
      this.buscarCurso(grado, grupo).getEstudiantes().add(this.buscarEstudiante(codigo));
      this.buscarEstudiante(codigo).setCurso(this.buscarCurso(grado, grupo));
   }

   public void agregarAsignaturaAEstudiante(int codigo, String nombre) {
      this.buscarEstudiante(codigo).getAsignaturas().add(this.buscarAsignatura(nombre));
   }

   public Profesor buscarProfesor(int cod) {
      Profesor prof = null;
      Iterator var3 = this.personas.iterator();

      while(var3.hasNext()) {
         Persona persona = (Persona)var3.next();
         if (persona.getCodigo() == cod) {
            prof = (Profesor)persona;
         }
      }

      return prof;
   }

   public Estudiante buscarEstudiante(int cod) {
      Estudiante est = null;
      Iterator var3 = this.personas.iterator();

      while(var3.hasNext()) {
         Persona persona = (Persona)var3.next();
         if (persona.getCodigo() == cod) {
            est = (Estudiante)persona;
         }
      }

      return est;
   }

   public Curso buscarCurso(int grado, int grupo) {
      Curso cur = null;
      Iterator var4 = this.cursos.iterator();

      while(var4.hasNext()) {
         Curso curso = (Curso)var4.next();
         if (curso.getGrado() == grado && curso.getGrupo() == grupo) {
            cur = curso;
         }
      }

      return cur;
   }

   public Asignatura buscarAsignatura(String nombre) {
      Asignatura asig = null;
      Iterator var3 = this.asignaturas.iterator();

      while(var3.hasNext()) {
         Asignatura asignatura = (Asignatura)var3.next();
         if (asignatura.getNombre().equalsIgnoreCase(nombre)) {
            asig = asignatura;
         }
      }

      return asig;
   }

   public String reporteEstudiante(int codigo) {
      return this.buscarEstudiante(codigo).reporteAcademico();
   }

   public String infoCurso(int grado, int grupo) {
      return this.buscarCurso(grado, grupo).infoCurso();
   }

   public String listarTodosLosCursos() {
      String lis = "";

      Curso curso;
      for(Iterator var2 = this.cursos.iterator(); var2.hasNext(); lis = lis + curso.infoCurso() + "\n\n") {
         curso = (Curso)var2.next();
      }

      return lis;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public ArrayList<Persona> getPersonas() {
      return this.personas;
   }

   public void setPersonas(ArrayList<Persona> personas) {
      this.personas = personas;
   }

   public ArrayList<Curso> getCursos() {
      return this.cursos;
   }

   public void setCursos(ArrayList<Curso> cursos) {
      this.cursos = cursos;
   }

   public ArrayList<Asignatura> getAsignaturas() {
      return this.asignaturas;
   }

   public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
      this.asignaturas = asignaturas;
   }
}
