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
public class Regularidad {
    private boolean condicion_regular;
    private Alumno alumno;

    public Regularidad(boolean condicion_regular, Alumno alumno) {
        this.condicion_regular = condicion_regular;
        this.alumno = alumno;
    }

    public boolean isCondicion_regular() {
        return condicion_regular;
    }

    public void setCondicion_regular(boolean condicion_regular) {
        this.condicion_regular = condicion_regular;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Regularidad{" + "condicion_regular=" + condicion_regular + ", alumno=" + alumno + '}';
    }
    
    
    
}
