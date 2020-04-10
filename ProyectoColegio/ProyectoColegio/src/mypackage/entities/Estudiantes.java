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
public class Estudiantes extends Persona {

    private double calificacion;

    public Estudiantes(double calificacion, String nombre, String genero, int edad) {
        super(nombre, genero, edad);
        this.calificacion = calificacion;
    }
    
    
     @Override
    public void faltas(int faltas) {
     //Suponemos que el 50% de faltas es 9
        int nro_max_faltas=9;
        
        if(faltas >= nro_max_faltas){
            System.out.println("El estudiante "+this.getNombre()+" ha superado el numero maximo de faltas!!");
        }else{
             System.out.println("El estudiante "+this.getNombre()+" tiene "+faltas+" faltas, le restan "+(nro_max_faltas - faltas)+" faltas!!");    
        } }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +super.toString()+ "calificacion=" + calificacion + '}';
    }
    
   
    
}
