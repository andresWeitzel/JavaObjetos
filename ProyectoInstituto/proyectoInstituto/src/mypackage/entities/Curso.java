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
public class Curso {
    
    private String tipo_curso;
    private String turno;//mañana tarde o noche

    public Curso(String tipo_curso, String turno) {
        this.tipo_curso = tipo_curso;
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTipo_curso() {
        return tipo_curso;
    }

    public void setTipo_curso(String tipo_curso) {
        this.tipo_curso = tipo_curso;
    }

    @Override
    public String toString() {
        return "Curso{" + "tipo_curso=" + tipo_curso + ", turno=" + turno + '}';
    }
   
    
   
}
