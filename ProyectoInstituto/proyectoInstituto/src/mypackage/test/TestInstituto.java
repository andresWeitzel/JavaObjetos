/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.test;

import mypackage.entities.*;

/**
 *
 * @author andre
 */
public class TestInstituto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\n♣♣PROYECTO INSTITUTO♣♣\n");
        System.out.println("--Alumnos--");
        System.out.println("••Alumno1••");
        Alumno alumno1=new Alumno("Jaime", "Rodriguez", 19, "Las caucas 456",new Curso("Matematicas", "Mañana"));
        System.out.println(alumno1);
        System.out.println("••Alumno2••");
        Alumno alumno2=new Alumno( "Juanita", "Perez", 21, "Las magnolias 123",new Curso("Historia", "Tarde"));
        System.out.println(alumno2);
        System.out.println("••Alumno3••");
        Alumno alumno3=new Alumno( "Francisco", "Contreras", 26, "Marisconi 129",new Curso("Matematicas", "Mañana"));
        System.out.println(alumno3);
        System.out.println("••Alumno4••");
        Alumno alumno4=new Alumno( "Jimena", "Castro", 23, "Las heras 876",new Curso("Matematicas", "Mañana"));
        System.out.println(alumno4);
        
        System.out.println("\n--Asignacion Alumnos--");
        System.out.println("••Asignacion Alumno1••");
        AsignacionAlumnos asignacionAlumno1=new AsignacionAlumnos("Verdadera",alumno1);
        System.out.println(asignacionAlumno1);
        System.out.println("••Asignacion Alumno2••");
        AsignacionAlumnos asignacionAlumno2=new AsignacionAlumnos("Falsa",alumno2);//No asignado a ningun curso, ya que hay menos de 3 alumnos
        System.out.println(asignacionAlumno2);
        System.out.println("••Asignacion Alumno3••");
        AsignacionAlumnos asignacionAlumno3=new AsignacionAlumnos("Verdadera",alumno3);
        System.out.println(asignacionAlumno3);
        System.out.println("••Asignacion Alumno4••");
        AsignacionAlumnos asignacionAlumno4=new AsignacionAlumnos("Verdadera",alumno4);
        System.out.println(asignacionAlumno4);
        
        System.out.println("\n--Regularidad Alumnos--");
        System.out.println("••Regularidad Alumno1••");
        Regularidad regularidadAlumno1=new Regularidad(true, alumno1);
        System.out.println(regularidadAlumno1);
        System.out.println("••Regularidad Alumno2••");
        Regularidad regularidadAlumno2=new Regularidad(false, alumno2);//No posee la condicon de regularidad ya que no esta asignado al curso
        System.out.println(regularidadAlumno2);
        System.out.println("••Regularidad Alumno3••");
        Regularidad regularidadAlumno3=new Regularidad(true, alumno3);
        System.out.println(regularidadAlumno3);
        System.out.println("••Regularidad Alumno4••");
        Regularidad regularidadAlumno4=new Regularidad(true, alumno4);
        System.out.println(regularidadAlumno4);
        
       
        
        System.out.println("\n--Instructores--");
        System.out.println("••Instructor1••");
        Instructor instructor1=new Instructor("Alvar", "Donatello", 45, "Los sauces 490",new Curso("Matematicas","Mañana"));
        System.out.println(instructor1);
        System.out.println("••Instructor2••");
         Instructor instructor2=new Instructor("Jose", "Don Bosco", 53, "Algarrobo 401",new Curso("Historia","Tarde"));
        System.out.println(instructor2);
        
          System.out.println("\n--Asignacion Instructores--");
        System.out.println("••Asignacion Instructor1••");
        AsignacionInstructor asignacionInstructor1=new AsignacionInstructor("Verdadera",instructor1);//3 inscriptos
        System.out.println(asignacionAlumno1);
        System.out.println("••Asignacion Instructor2••");
        AsignacionInstructor asignacionInstructor2=new AsignacionInstructor("Falsa",instructor2);//1 solo inscripto
        System.out.println(asignacionAlumno2);
     
        
        System.out.println("\n--Aula--");
        System.out.println("••Aula01••");
        Aula aula1=new Aula("C4",12,34,2,38,3);
        System.out.println(aula1);
        System.out.println("••Aula02••");
        Aula aula2=new Aula("G5",6,12,2,15,1);
        System.out.println(aula2);
        
        
         System.out.println("\n--Calendario Alumnos--");
        System.out.println("••Calendario Alumno 1••");
        CalendarioAlumnos calendarioAlumnos1=new CalendarioAlumnos(asignacionAlumno1, aula1.getid(), alumno1.getCurso(),"10-06-2020");
        System.out.println(calendarioAlumnos1);
        System.out.println("••Calendario Alumno 3••");
        CalendarioAlumnos calendarioAlumnos3=new CalendarioAlumnos(asignacionAlumno3, aula1.getid(), alumno3.getCurso(),"10-06-2020");
        System.out.println(calendarioAlumnos3);
        System.out.println("••Calendario Alumno 4••");
        CalendarioAlumnos calendarioAlumnos4=new CalendarioAlumnos(asignacionAlumno4, aula1.getid(), alumno4.getCurso(),"10-06-2020");
        System.out.println(calendarioAlumnos4);
        
         System.out.println("\n--Calendario Instructor--");
        System.out.println("••Calendario Instructor 1••");
        CalendarioInstructor calendarioInstructor1=new CalendarioInstructor(asignacionInstructor1, aula1, instructor1.getCurso(), "10-06-2020");
        System.out.println(calendarioInstructor1);
        
        
        
        
        
    }
    
}
