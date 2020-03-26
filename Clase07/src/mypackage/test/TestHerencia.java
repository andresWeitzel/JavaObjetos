
package mypackage.test;

import mypackage.entities.Cuenta;
import mypackage.entities.Direccion;
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
        
        
        
        
        
       
        
        
    
    
    
    
    
    }
    
}
