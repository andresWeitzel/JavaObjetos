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
public class AsignacionAlumnos {
    
    private String asignacion_vigente;
    private Alumno alumno;

    public AsignacionAlumnos(String asignacion_vigente, Alumno alumno) {
        this.asignacion_vigente = asignacion_vigente;
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String getAsignacion_vigente() {
        return asignacion_vigente;
    }

    public void setAsignacion_vigente(String asignacion_vigente) {
        this.asignacion_vigente = asignacion_vigente;
    }

    @Override
    public String toString() {
        return "Asignaciones Alumnos{" + "asignacion_vigente=" + asignacion_vigente + ", alumno=" + alumno + '}';
    }
    

   
    

    
    
}
