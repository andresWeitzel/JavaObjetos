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
public class Instructor extends Persona{

    public Instructor(String nombre, String apellido, int edad, String direccion, Curso curso) {
        super(nombre, apellido, edad, direccion, curso);
    }

    @Override
    public String toString() {
        return super.toString()+"Instructor{" + '}';
    }
    
    
}
