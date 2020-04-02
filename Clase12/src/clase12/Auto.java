/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

/**
 *
 * @author andre
 */
public class Auto {

    //Methods gettter and setter velocidad
    public static int getVelocidad() {
        return velocidad;
    }

    public static void setVelocidad(int aVelocidad) {
        velocidad = aVelocidad;
    }
    //atributos finales, no podra cambiarse el valor sera constante, no tendra metodo setter
    private final String marca;
    private final String modelo;
    private final String color;
    private static int velocidad;

    //Constructor
    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //Method acelerar(int)
    public static void acelerar(int kilometros){
        velocidad+=kilometros;
    }
    //Method frenar(int)
    public static void frenar(int kilometros){
        velocidad-=kilometros;
        
    }
    

    //Getters  
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    
    
    
}
