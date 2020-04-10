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
public class Profesor extends Persona{
    
    private String materia_profesor;

    public Profesor(String materia_profesor, String nombre, String genero, int edad) {
        super(nombre, genero, edad);
        this.materia_profesor = materia_profesor;
    }

    
    @Override
    public void faltas(int faltas) {
        //Suponemos que el 20% de faltas es 5
        int nro_max_faltas=5;
        
        if(faltas >= nro_max_faltas){
            System.out.println("El profesor "+this.getNombre()+" ha superado el numero maximo de faltas!!");
        }else{
             System.out.println("El profesor "+this.getNombre()+" tiene "+faltas+" faltas, le restan "+(nro_max_faltas - faltas)+" faltas!!");    
        }
         }

    public String getMateria() {
        return materia_profesor;
    }

    public void setMateria(String materia_profesor) {
        this.materia_profesor = materia_profesor;
    }

    @Override
    public String toString() {
        return "Profesor{" +super.toString()+ "materia=" + materia_profesor + '}';
    }

   
  
    
    
}
