/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;

/**
 *
 * @author andre
 */
public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Auto() {
    }

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        
    }

    public void acelerar(int kilometros){
        velocidad+=kilometros;
    }
    public void acelerar(){
        
    }
    public void frenar(){
        
    }
    public void frenar(int kilometros){
        
    }
    
    
    
    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidad=" + velocidad + '}';
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
}
