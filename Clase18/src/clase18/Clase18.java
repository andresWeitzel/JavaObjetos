/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author andre
 */
public class Clase18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("\n☻☻FRAMEWORK COLLECTION☻☻\n");
        System.out.println("♠♠Interfaz Set♠♠\n");
        
        //Usamos el mismo nombre de la interfaz paa aplicar polimorfimo
        Set <String> set;
        
        System.out.println("\n••Implementamos la clase HashSet••");
        
        set=new HashSet();//Sin orden preestablecido
        
        set.add("Lunes");
        set.add("Martes");
        set.add("Miercoles");
        set.add("Jueves");
        set.add("Viernes");
        set.add("Sabado");
        set.add("Domingo");
        
        /*Recordar que el metodo foreach esta en la interfaz iterable y por ende en todas
        las impementaciones del framework, lo valo de esta implementacion es que no hay un orden preestablecido para que nos muestre el indice de las listas*/
        set.forEach(System.out::println);
        
        
        System.out.println("\n••Implementamos la clase LinkedHashset••");
        
        set=new LinkedHashSet();//Con orden preestablecido
        
        set.add("Lunes");
        set.add("Martes");
        set.add("Miercoles");
        set.add("Jueves");
        set.add("Viernes");
        set.add("Sabado");
        set.add("Domingo");
    
        set.forEach(System.out::println);
        
         System.out.println("\n♠♠Interfaz SortedSet♠♠\n");
         //Cuando utilizo la clase string del generics(<String>) debe implementar esta interfaz la interfaz comparable
         
         
         System.out.println("\n••Implementamos la clase TreeSet••");
         //Es una implementacion para almacenar un arbol por orden natural, los elementos aparecen ordenados alafabeticamenete
         
         set=new TreeSet();
         
         set.add("Lunes");
        set.add("Martes");
        set.add("Miercoles");
        set.add("Jueves");
        set.add("Viernes");
        set.add("Sabado");
        set.add("Domingo");
    
        set.forEach(System.out::println);
         
    }
    
}
