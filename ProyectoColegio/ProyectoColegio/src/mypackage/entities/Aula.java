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
public class Aula extends Profesor{
    
    private String identificador;
    private String materia_aula;
    private int cantidad_alumnos;
    //private Profesor profesor;

    public Aula(String identificador, String materia_aula, int cantidad_alumnos, String materia_profesor, String nombre, String genero, int edad) {
        super(materia_profesor, nombre, genero, edad);
        this.identificador = identificador;
        this.materia_aula = materia_aula;
        this.cantidad_alumnos = cantidad_alumnos;
    }
    
    public void disponibilidad(){
        if(materia_aula.equals(super.getMateria())){
            //Si la materia del profesor es igual a la del aula
            System.out.println("Aula disponible!");
        }else{
            System.out.println("Aula no disponible!(No encontramos un profesor de "+materia_aula+" )");
        }
        
    }
    //Le paso el tipo de estudiante que quiero que me compare la calificacion
    public void estudiantesAprobados(Estudiantes estudiante){
        if(estudiante.getCalificacion() >= 7.0){
            System.out.println("El estudiante "+estudiante.getNombre()+" esta aprobado!");
        }else{
            System.out.println("El estudiante "+estudiante.getNombre()+" esta desaprobado!Debe superar los 7.0 puntos");
        }
        
      
        
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getMateria_aula() {
        return materia_aula;
    }

    public void setMateria_aula(String materia_aula) {
        this.materia_aula = materia_aula;
    }

    public int getCantidad_alumnos() {
        return cantidad_alumnos;
    }

    public void setCantidad_alumnos(int cantidad_alumnos) {
        this.cantidad_alumnos = cantidad_alumnos;
    }

    @Override
    public String toString() {
        return "Aula{" + "identificador=" + identificador + ", materia_aula=" + materia_aula + ", cantidad_alumnos=" + cantidad_alumnos +super.toString()+ '}';
    }

   
    
    
    
    
}
