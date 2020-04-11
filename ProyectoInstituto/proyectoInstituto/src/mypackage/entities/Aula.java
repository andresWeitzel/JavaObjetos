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
public class Aula {
    private String id;
    private int escritorios;
    private int sillas;
    private int pizarrones;
    private int computadoras; 
    private int cantidad_alumnos;//minimo 3 alumnos para asignar en calendario y comience

    public Aula(String id,int escritorios, int sillas, int pizarrones, int computadoras, int cantidad_alumnos) {
        this.id=id;
        this.escritorios = escritorios;
        this.sillas = sillas;
        this.pizarrones = pizarrones;
        this.computadoras = computadoras;
        this.cantidad_alumnos = cantidad_alumnos;
    }
    
    
    
    public int getCantidad_alumnos() {
        return cantidad_alumnos;
    }

    public void setCantidad_alumnos(int cantidad_alumnos) {
        this.cantidad_alumnos = cantidad_alumnos;
    }
        public String getid(){
        return id;
    }
    public void setid(String id){
        this.id=id;
    }


    public int getEscritorios() {
        return escritorios;
    }

    public void setEscritorios(int escritorios) {
        this.escritorios = escritorios;
    }

    public int getSillas() {
        return sillas;
    }

    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    public int getPizarrones() {
        return pizarrones;
    }

    public void setPizarrones(int pizarrones) {
        this.pizarrones = pizarrones;
    }

    public int getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(int computadoras) {
        this.computadoras = computadoras;
    }

    @Override
    public String toString() {
        return "Aula{" +"id del Aula "+id+ ", escritorios=" + escritorios + ", sillas=" + sillas + ", pizarrones=" + pizarrones + ", computadoras=" + computadoras + ", cantidad_alumnos=" + cantidad_alumnos + '}';
    }

    
    
}
