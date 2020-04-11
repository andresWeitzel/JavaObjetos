/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.entities;

/**
 *
 * @author andre
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    /*El curso es independiente de las asignaciones, ya que un alumno puede estar inscripto pero no asignado
     de la misma forma aplica para Instructores, ya que este puede dar determinado curso pero no estar asignado
    para darlo.*/
    private Curso curso;

    public Persona(String nombre, String apellido, int edad, String direccion, Curso curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direccion=" + direccion + ", curso=" + curso + '}';
    }
    
  

   
    
    
}
