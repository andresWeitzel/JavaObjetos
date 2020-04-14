/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author andre
 */
public class Clase21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
          System.out.println("\n☻☻FRAMEWORK COLLECTION☻☻\n");
        System.out.println("♠♠Interfaz List♠♠\n");
       
        System.out.println("\n**implementamos la clase ArrayList**");       
        
       //List  lista1=new ArrayList();
       List <Auto> lista1=new ArrayList();
       
       lista1.add(new Auto("Peugeot","asd","Blanco"));
       lista1.add(new Auto("Falcon","aabhsj","Negro"));
       lista1.add(new Auto("BMW","fgnhk","Gris"));
       lista1.add(new Auto("Ferrari","n.5","Bordo"));
       lista1.remove(new Auto("Cupe","uipol","Blanco"));
       
       lista1.forEach(System.out::println);
       
         System.out.println("\n**Implementamos la clase Stack**");
         
         //Creamos una pila que sera de tipo stack
         Stack<Auto>pilaAutos=new Stack();
         //Apilamos un nuevo auto
         pilaAutos.push(new Auto("Citroen","C5","Verde"));
         //Agregamos mas elementos a la pila
         pilaAutos.addAll(lista1);
         //Imprimimos la pila
         pilaAutos.forEach(System.out::println);
        
        //Logitud de la pila
        System.out.println("Longitud de la pila: "+pilaAutos.size());
        
        //El metodo empty esta definido de la clase vector que se hereda de este
        //Mientras la pila no este vacia
        while(!pilaAutos.isEmpty()){
            //Desapilamos un elemento
            System.out.println(pilaAutos.pop());
            
         //Logitud de la pila desapilada
        System.out.println("Longitud de la pila: "+pilaAutos.size());   
        }
        
         System.out.println("♠♠Interfaz Map♠♠\n");
         //Vectores asociativos, los indices de estos vectores pueden ser Strings, int, etc
        //Dentro del Generic esta interfaz usa k,v que representa key Value, nosotros la declararemos ambas como Strings
         Map<String,String>mapaSemana;
         
         System.out.println("\n**Implementamos la clase HashMap**");
         //implementamos la clase
         mapaSemana=new HashMap();
         
         //Aplicamos la clase
         //Puede haber varios dias repetidos pero no puede haber mismas llaves repetidas
         mapaSemana.put("Lun","Lunes");
         mapaSemana.put("Lun","Martes");
         mapaSemana.put("Mier","Miercoles");
         mapaSemana.put("Jue","Jueves");
         mapaSemana.put("Vier","Viernes");
         mapaSemana.put("Sab","Sabado");
         mapaSemana.put("Dom","Domingo");
         
         //con el metodo get obtengo unn elemento
         //System.out.println(mapaSemana.get("Lun"));
         
         //Con el metodo KeySet() nos devuelve un set con todas las llaves
         //mapaSemana.keySet().forEach(k->System.out.println(k+ " "+ mapaSemana.get(k)));
         //otra forma mas facil de implementarlo el k,v es key value(clave valor)
         mapaSemana.forEach((k,v)->System.out.println(k+" "+v));
    }
    
}
