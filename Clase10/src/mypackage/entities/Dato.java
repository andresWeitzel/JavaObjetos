/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.entities;

/**
 *
 * @author andre
 */
public class Dato {
    
    private int dato;

    public Dato(int dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Dato{"+"Valor: " + dato + '}';
    }

    
    /*Utilizaremos redefinicon de metodos para que dos objetos con dos comportamientos diferentes
    sean considerados iguales*/
    
   /* @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.dato;
        return hash;
    }*/
   
   /* @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dato other = (Dato) obj;
        if (this.dato != other.dato) {
            return false;
        }
        return true;
    }*/
    
    
    //Metodo Resumido?
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Dato)) return false;
        return this.hashCode()== obj.hashCode();
    }
    
     //Metodo Resumido?
    @Override
    public int hashCode() {
        return toString().hashCode();
    }


    
    

   
    
    
    
    
}
