
package mypackage.test;

import mypackage.entities.ClientePersona;
import mypackage.entities.Cuenta;
import mypackage.entities.Direccion;
import mypackage.entities.Empleado;
import mypackage.entities.Persona;


public class TestHerencia {

    public static void main(String[] args) {
        
        System.out.println("\n***PROYECTO HERENCIA****\n");
        System.out.println("--Cuenta1--");
        Cuenta cuenta1=new Cuenta(1,"$");
        cuenta1.depositar(30000);
        cuenta1.debitar(11000);
        System.out.println(cuenta1);
            
        System.out.println("--Cuenta2--");
        Cuenta cuenta2=new Cuenta(2,"$");
        cuenta2.depositar(50000);
        cuenta2.debitar(17000);
        System.out.println(cuenta2);
        
        
        System.out.println("\n--Direccion1--");
        Direccion direccion1=new Direccion("Benjamin","PB","PB",567);
        System.out.println(direccion1);
        
        System.out.println("--Direccion2--");
        Direccion direccion2=new Direccion("Almirante","4","B","Mar del Plata",987);
        System.out.println(direccion2);
    
       
        System.out.println("\n--Persona1--");
        Persona persona1=new Persona("Hector","Alvarez",48,direccion1);//direccion1 es de tipo Object
        System.out.println(persona1);
        persona1.saludar();
        
        System.out.println("--Persona2--");
        Persona persona2=new Persona("Marcela", "Gutierrez", 19,new Direccion("Martinez de Hoz", "7", "G", 8734));
        System.out.println(persona2);
        persona2.saludar();
        
        
        
        System.out.println("--Persona3--");
        Persona persona3=new Persona("Ana","Alvarez",48,persona1.getDireccion());
        System.out.println(persona3);
        persona3.saludar();
        
      
      
       System.out.println("\n--Empleado1--");
        Empleado empleado1=new Empleado(1212, 45000, "Josefina", "Contreras", 19,new Direccion("Las Verturias","1", "y", "Bahia Blanca",1980));
        System.out.println(empleado1);
        empleado1.saludar();
        

        System.out.println("\n--Cliente1--");
        ClientePersona cliente1=new ClientePersona(18, new Cuenta(1239, "us$"), new Persona("Jaime", "Cruz", 22,new Direccion("Camino de la cruz", "1", "u",1878)));
        System.out.println(cliente1);
        cliente1.saludar();
        
        
         /*
    POLIMORFISMO-->
    
     El polimorfismo ocurre cuando una clase tiene diferentes comportamientos
    Hay dos clases de polimorfismo(sin redefinicion de metodos y con redefinicion de metodos)
    
    Polimorfismo sin redefinicion de metodos ocurre cuando una clase tiene metodos que se llaman
    igual pero tienen distinto comportamiento, a esta situacion tambien se la llama sobrecarga de metodos
    
    Polimorfismo con redefinion de metodos es cuando se crean clases hijas de una clase por que decide
    sobreescribir y modificar el comportamiento(Sobreescritura de metodos).
    
    */
         /*Al tener la clase abstracta de persona soolo podre crear variables de referencia de persona
           Podre usar constructores de clases hijas, porque adentro de una variable persona
         yo opdre almacenar cualquier objeto de cualquier clase hija.Esto se por herencia de objetos
         
         */
         System.out.println("\n--APLICANDO POLIMORFISMO--\n");
         System.out.println("\n--Empleado de la variable referencial persona1--");
         Persona personaPolimorfica1=new Empleado(1211, 23000, "Manuel", "Perez", 24, direccion2);
         System.out.println(personaPolimorfica1);
         
         
        
        
       
        
        
    
    
    
    
    
    }
    
}
