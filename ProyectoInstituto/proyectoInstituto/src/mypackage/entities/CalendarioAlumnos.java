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
public class CalendarioAlumnos {
    
    private AsignacionAlumnos asignacionAlumnos;
    private String asignacion_aula;
    private Curso curso;
    private String fecha_comienzo_curso;

    public CalendarioAlumnos(AsignacionAlumnos asignacionAlumnos, String asignacion_aula, Curso curso, String fecha_comienzo_curso) {
        this.asignacionAlumnos = asignacionAlumnos;
        this.asignacion_aula = asignacion_aula;
        this.curso = curso;
        this.fecha_comienzo_curso = fecha_comienzo_curso;
    }

    public AsignacionAlumnos getAsignacionAlumnos() {
        return asignacionAlumnos;
    }

    public void setAsignacionAlumnos(AsignacionAlumnos asignacionAlumnos) {
        this.asignacionAlumnos = asignacionAlumnos;
    }

    public String getAsignacion_aula() {
        return asignacion_aula;
    }

    public void setAsignacion_aula(String asignacion_aula) {
        this.asignacion_aula = asignacion_aula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getFecha_comienzo_curso() {
        return fecha_comienzo_curso;
    }

    public void setFecha_comienzo_curso(String fecha_comienzo_curso) {
        this.fecha_comienzo_curso = fecha_comienzo_curso;
    }

    @Override
    public String toString() {
        return "CalendarioAlumnos{" + "asignacionAlumnos=" + asignacionAlumnos + ", asignacion_aula=" + asignacion_aula + ", curso=" + curso + ", fecha_comienzo_curso=" + fecha_comienzo_curso + '}';
    }
    
    
}
