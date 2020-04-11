/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author andre
 */
public class Clase19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          System.out.println("\n☻☻FRAMEWORK COLLECTION☻☻\n");
        System.out.println("♠♠Interfaz List♠♠\n");
        System.out.println("\n**implementamos la clase Listas**");       
        
       //List  lista1=new ArrayList();
       List <Auto> lista1=new ArrayList();
       
       lista1.add(new Auto("Peugeot","asd","Blanco"));
       lista1.add(new Auto("Falcon","aabhsj","Negro"));
       lista1.add(new Auto("BMW","fgnhk","Gris"));
       lista1.add(new Auto("Ferrari","n.5","Bordo"));
       lista1.remove(new Auto("Cupe","uipol","Blanco"));
       
       lista1.forEach(System.out::println);
       
        System.out.println("\n♠♠Interfaz Set♠♠\n");
        System.out.println("\n••Implementamos la clase HashSet••");
         
        Set <Auto> setAutos;
       
       setAutos=new HashSet();
       
        //Con el metodo addAll nos ahorramos el recorrido de la lista
       setAutos.addAll(lista1);
       
       setAutos.forEach(System.out::println);
       
        
    
       System.out.println("\n••Implementamos la clase LinkedHashSet••");

       setAutos=new LinkedHashSet();
       
       /*
       //Agregamos los elementos al setAutos haciendo el recorrido de listas
       lista1.forEach(setAutos::add);
       */
       
       //Con el metodo addAll nos ahorramos el recorrido de la lista
       setAutos.addAll(lista1);
       
       setAutos.forEach(System.out::println);
       
       
       System.out.println("\n♠♠Interfaz SortedSet♠♠\n");
       System.out.println("\n••Implementamos la clase TreeSet••");
       
       /*Usando el metodo Comparable<Auto> de la clase Auto nos ahorramos que la lista1
       sea de tipo String para poder utilizar esta clase*/
       setAutos=new TreeSet();
       
        //Con el metodo addAll nos ahorramos el recorrido de la lista
       setAutos.addAll(lista1);
       
       setAutos.forEach(System.out::println);
       
    }
    
}
