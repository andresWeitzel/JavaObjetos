/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Clase11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Clase System
        
        //atributos .out .err .in
        System.out.println("Hola 1");
        System.out.println("Hola 2");
        System.out.println("Hola 3");
        System.out.println("Hola 4");
        System.out.println("Hola 5");
        System.out.println("Hola 6");
        System.out.println("Hola 7");
        /*En cada ejecucion puede aparecer en cualquier parte, por que lo controla el sistema de video, se dice 
        que es un streaming de salida de sincronizado */
        System.err.println("Error");
        
        /*El atributo in representa un atributo de entrada en la clase System, es un
        atributo sincronizado, permite ingresa rdatos desde la terminal del sistema
        este metodo detiene el hilo de ejecucion
        */
        //System.out.println("Ingrese su nombre: ");
        //String nombre=new Scanner(System.in).next();
        //System.out.println("Hola "+nombre);
        
        //Metodo eexit()
        System.exit(0);
        System.out.println("Esta sentencia no se ejecuta!");
        
        /*DICCIONARIO DE PROPIEDADES getenv(), DEVUELVE UN DICCIONARIO DE PROPIEDADES DEL sistema
        */
        System.out.println(System.getenv());
        
        //Propiedades en linux
        System.out.println(System.getenv("XDG_SESSION_DESKTOP"));
        System.out.println(System.getenv("LOGNAME"));
        System.out.println(System.getenv("PWD"));
        System.out.println(System.getenv("LANGUAGE"));
        System.out.println(System.getenv("USER"));
        System.out.println(System.getenv("HOME"));
        
        
        
        /*DICCIONARIO DE PROPIEDADES getProperties*/ 
        System.out.println(System.getProperties());
              
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        

    
    }
    
}
