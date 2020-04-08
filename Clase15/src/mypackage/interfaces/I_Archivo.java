/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.interfaces;

/**
 *
 * @author andre
 */
public abstract interface I_Archivo {
    /*Las interfaces se caracterizan porque dentro de ellas se colocan los nombres de los metodos con sus parametros
    que se pueden utilzar pero la funcion de cada metodo la crea cada programador que utilize este metodo
    todos los metodos que se colocan en la interfaz son abstractos y publicos*/
    
    
    public abstract void setText(String text);
   
    public abstract String getText();
    
    //Java8 se puede utilizar un modificador default
    //si posee el modificador default puede tener codigo dentro
    public default void info(){
        System.out.println("Esta es la Interfaz I_Archivo");
    }
    
    
    
}
