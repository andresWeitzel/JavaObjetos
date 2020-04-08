/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import mypackage.entities.Auto;

/**
 *
 * @author andre
 */
public class TestApiReflect {
    
    public static void main(String[] args) throws Exception  {
        Class clazz=Class.forName("mypackage.entities.Auto");
        
        //pedimos todos los campos de la clase auto con un array usando la clase Field      
        System.out.println("**Atributos publicos**\n");
        //el metodo getFields deuelve los atributos que son PUBLICOS
        Field[] campos=clazz.getFields();
        
        for(int a=0; a< campos.length; a++){
            System.out.println(campos[a]);
            
        }
        System.out.println("-----------------------------------");
        System.out.println("**Todos los atributos**\n");
        //el metodo getDeclaredFields deuelve todos los atributos
        campos=clazz.getDeclaredFields();
        
        for(int a=0; a< campos.length; a++){
            System.out.println(campos[a]);            
        }
        
        System.out.println("-----------------------------------");
        System.out.println("**Todos los Metodos y los heredados**\n");
        Method[] metodos=clazz.getMethods();
        
        for(int a=0; a< metodos.length; a++){
            System.out.println(metodos[a]);            
        }
        
        System.out.println("-----------------------------------");
        System.out.println("**Todos los Metodos de la clase, no incluyen los heredados**\n");
        metodos=clazz.getDeclaredMethods();
        
         for(int a=0; a< metodos.length; a++){
            System.out.println(metodos[a]);            
        }
         
         System.out.println("-----------------------------------");
        System.out.println("**Todos los Constructores de la clase**\n");
        Constructor[] constructores=clazz.getDeclaredConstructors();
        
        for(int a=0; a< constructores.length; a++){
            System.out.println(constructores[a]);            
        }
        
        System.out.println("--------------------------");
        System.out.println("**Creando Objetos de forma dinamica utilizando el constructor vacio de la clase Auto**\n");
        //Al crear un objeto vacio sin estado debemos castearlo a la clase auto
        Auto auto=(Auto)clazz.getConstructors()[0].newInstance();
        
        /**
         *Invoco sobre el objeto auto el metodo setMarca que recibe un 
        pametro de tipo string y le envio el valor citroen
        * El metodo .invoke lo ejecuta dinamicamente
         */
        clazz.getDeclaredMethod("setMarca", String.class).invoke(auto,"Citroen");
        clazz.getDeclaredMethod("setModelo", String.class).invoke(auto,"C4");
        clazz.getDeclaredMethod("setColor", String.class).invoke(auto,"Blanco");
        
        //metodo acelerar con parametros
        clazz.getDeclaredMethod("acelerar", Integer.TYPE).invoke(auto, 15);
        //metodo acelerar sin parametro
        clazz.getDeclaredMethod("acelerar", null).invoke(auto, null);
        
        //metodo toString() en forma dinamica, esta devolucion es en formato object, no en string
        //pedimos a la clase auto que nos de el metodo tostring
        System.out.println(clazz.getDeclaredMethod("toString", null).invoke(auto,null));
         
         System.out.println("--------------------------");
        System.out.println("**Creando Objetos invocando el constructor parametrico de la clase Auto()**\n");
        //Creamos otro objeto de la clase auto invocando el constructor parametrico
        Auto auto2= (Auto) clazz.getConstructors()[1].newInstance("Fiat","Way","Rojo");
        System.out.println(auto2);
        
        Auto auto3=(Auto) clazz
                .getConstructor(String.class, String.class, String.class)
                .newInstance("Renault","Kangou","Bordo");
        System.out.println(auto3);
    }
    
}
