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
public class CalendarioInstructor {
    
     private AsignacionInstructor asignacionInstructor;
    private Aula asignacion_aula;
    private Curso curso;
    private String fecha_comienzo_curso;

    public CalendarioInstructor(AsignacionInstructor asignacionInstructor, Aula asignacion_aula, Curso curso, String fecha_comienzo_curso) {
        this.asignacionInstructor = asignacionInstructor;
        this.asignacion_aula = asignacion_aula;
        this.curso = curso;
        this.fecha_comienzo_curso = fecha_comienzo_curso;
    }

    public AsignacionInstructor getAsignacionInstructor() {
        return asignacionInstructor;
    }

    public void setAsignacionInstructor(AsignacionInstructor asignacionInstructor) {
        this.asignacionInstructor = asignacionInstructor;
    }

    public Aula getAsignacion_aula() {
        return asignacion_aula;
    }

    public void setAsignacion_aula(Aula asignacion_aula) {
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
        return "CalendarioInstructor{" + "asignacionInstructor=" + asignacionInstructor + ", asignacion_aula=" + asignacion_aula + ", curso=" + curso + ", fecha_comienzo_curso=" + fecha_comienzo_curso + '}';
    }
    
    
    
}
