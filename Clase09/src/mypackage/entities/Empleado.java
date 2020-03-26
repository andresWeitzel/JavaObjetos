package mypackage.entities;



public class Empleado extends Persona{
    
    private int legajo;
    private float sueldoBasico;

    //Al utilizar herencia tenemos que invocar al constructor padre con todos sus atributos
    public Empleado(int legajo, float sueldoBasico, String nombre, String apellido, int edad, Direccion direccion) {
        super(nombre, apellido, edad, direccion);
        this.legajo = legajo;
        this.sueldoBasico = sueldoBasico;
    }

    //Metodo saludar()
    @Override
    public void saludar(){
        System.out.println("Hola soy un empleado!!");
        
    }
    
    //Metodo toString
    /*Con la palabra super podemos invocar un metodo de la clase padre*/
    @Override
    public String toString() {
        return super.toString()+ "Empleado{" + "legajo=" + legajo + ", sueldoBasico=" + sueldoBasico + '}';
    }
    
    
    //Getters and Setters
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    

    
    
}
