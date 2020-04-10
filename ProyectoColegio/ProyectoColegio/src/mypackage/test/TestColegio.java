/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.test;

import mypackage.entities.*;
import mypackage.test.*;

/**
 *
 * @author andre
 */
public class TestColegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\n♦♦Test Colegio♦♦\n");
        System.out.println("\n**Estudiantes**");
        System.out.println("--Estudiante1--");
        Estudiantes estudiante1=new Estudiantes(7.0, "Marcelo", "M", 19);
        System.out.println(estudiante1);
        estudiante1.faltas(2);
        
        System.out.println("--Estudiante2--");
        Estudiantes estudiante2=new Estudiantes(2.3, "Jimena", "F", 17);
        System.out.println(estudiante2);
        estudiante2.faltas(1);
    
        System.out.println("\n**Profesores**");
        System.out.println("--Profesor1--");
        Profesor profesor1=new Profesor("Matematica", "Gustavo", "M", 45);
        System.out.println(profesor1);
        profesor1.faltas(0);
        
        System.out.println("--Profesor2--");
        Profesor profesor2=new Profesor("Filosofia","Lorena", "F", 27);
        System.out.println(profesor2);
        profesor2.faltas(3);
        
        System.out.println("\n**Aula**");
        System.out.println("--Aula01--");
        Aula aula1=new Aula("ERT-8790", "Matematica",45, profesor1.getMateria(), profesor1.getNombre(), profesor1.getGenero(), profesor1.getEdad());
        
        System.out.println(aula1);
        aula1.disponibilidad();
        aula1.estudiantesAprobados(estudiante1);
        aula1.estudiantesAprobados(estudiante2);
        
        
        System.out.println("--Aula02--");
        Aula aula2=new Aula("ERT-5645", "Filosofia",36, profesor1.getMateria(), profesor1.getNombre(), profesor1.getGenero(), profesor1.getEdad());
        
        System.out.println(aula2);
        aula2.disponibilidad();
       
        
    
    }
    
}
