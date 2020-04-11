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
public class AsignacionInstructor {
    String asignacion_vigente;
    Instructor instructor;

    public AsignacionInstructor(String asignacion_vigente, Instructor instructor) {
        this.asignacion_vigente = asignacion_vigente;
        this.instructor = instructor;
    }

    public String getAsignacion_vigente() {
        return asignacion_vigente;
    }

    public void setAsignacion_vigente(String asignacion_vigente) {
        this.asignacion_vigente = asignacion_vigente;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Asignacion Instructor{" + "asignacion_vigente=" + asignacion_vigente + ", instructor=" + instructor + '}';
    }
    
    
    
    
    
    
}
