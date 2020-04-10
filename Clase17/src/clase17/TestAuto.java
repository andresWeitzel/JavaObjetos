/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * FRAMEWORK COLLECTION-->package del framework java.util
 * INTERFAZ LIST
 */
package clase17;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class TestAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VECTORES
         System.out.println("\n**Vector de la clase Auto**");
       Auto[] autos=new Auto[4];
        autos[0]=new Auto("Fiat","Palio","Verde");
         autos[1]=new Auto("WMW","Gol","Blanco");
          autos[2]=new Auto("Renault","Clio","Rojo");
           autos[3]=new Auto("Fiat","Uno","Gris");
        
           //foreach
           for(Auto auto:autos){
               System.out.println(auto);
               
           }
       /**
        * FRAMEWORK COLLECTION7☻☻♥♠○◘•
        * INTERFAZ LIST
        */
       //la interfaz List no implementa constructores por eso es que no se puede 
       //instanciar objetos, sol manejar listas
       //Las listas no trabajan con indice
        System.out.println("\n☻☻FRAMEWORK COLLECT    ION☻☻\n");
        System.out.println("♠♠Interfaz List♠♠\n");
        System.out.println("\n**Listas**");       
       List lista1=new ArrayList();
       lista1.add(new Auto("Peugeot","asd","Blanco"));
       lista1.add(new Auto("Falcon","aabhsj","Negro"));
       lista1.add(34);
       lista1.add(565);
       lista1.remove(3);
  
       //Ejecutamos la llista
       for(Object lista:lista1){
           System.out.println(lista);       
       }
       
        System.out.println("\n**Listas con vectores**"); 
        //Copiar los autos del vector Auto a la lista lista1
       for(Auto auto:autos){
           lista1.add(auto);
       }
        //Ejecutamos la lista con vector
       for(Object lista:lista1){
           System.out.println(lista);       
       }
        System.out.println("\n**Usando el metodo foreach para recorrer la lista y los vectores**");
       //Interfaz Iterable, por cada elemento de la lista tendre una variable llamda item
       //lista1.forEach(item->System.out.println(item));
       //Abreviacion del metodo foreach
       lista1.forEach(System.out::println);
       
       System.out.println("\n**Copiamos los elementos del Tipo Auto de la lista1 a la lista2**");
       //Uso de Generics <>
       //Especificar tipos de datos de una lista 
       List <Auto> lista2=new ArrayList();
       lista2.add(new Auto("Renault","Clio","Rojo"));
       
       //Traemos los elemntos de las respectivas posiciones
       Auto auto1=(Auto)lista1.get(0);
       Auto auto2=lista2.get(0);
       
       //Copiamos los autos de lista1 a lista2
       lista1.forEach(item->{
           if(item instanceof Auto){
               lista2.add((Auto)item);               
       }});
       //Recorremos la lista y la imprimimos
       lista2.forEach(System.out::println);
    
    
    }
  }
