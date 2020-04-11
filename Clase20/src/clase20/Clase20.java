/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase20;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author andre
 */
public class Clase20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         System.out.println("\n☻☻FRAMEWORK COLLECTION☻☻\n");
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
       
       
        System.out.println("\n♠♠Interfaz Queue♠♠\n");
        /*Permite representar una cola*/
        Queue <Auto> colaAutos;
        
        System.out.println("\n••Implementamos la clase ArrayDequeu••");
        colaAutos=new ArrayDeque();
        
        //Encolamos objetos(agregar a la cola)
        //Eswte metodo nos permite encolar elemnetos
        colaAutos.offer(new Auto("Fiat","Liohuji","Morado"));
        
        
        //Con el metodo addAll(implementado en todo el collection) encolamos toda  una lista
        colaAutos.addAll(lista1);
        
        lista1.forEach(System.out::println);
        
         System.out.println("\n--Longitud de la cola sin encolar: "+colaAutos.size()+"\n");
        
        
        
        /*Desencolamos elementos, el while lo utilizamossiempre que la lista tenga elementos,
        iteramos siempre y cuando la cola no este vacia
        los elementos seran desencolados 1 por uno ya que es una cola y de forma ordenada y la longitud de la cola sera cero
        */
        while(!colaAutos.isEmpty()){
            //El metodo poll() desencola un elemento
            System.out.println("Sacando elemento...");
            System.out.println(colaAutos.poll());
            
        }
               
        
        System.out.println("\n--Longitud de la cola encolada: "+colaAutos.size());
        
        
        
    }
    
}
