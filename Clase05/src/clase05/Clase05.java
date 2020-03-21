package clase05;

import javax.swing.JOptionPane;

public class Clase05 {

    public static void main(String[] args) {

        System.out.println("--Auto1--");
        Auto auto1=new Auto();//Esto se considera viejo, deprecado
        
        auto1.marca="Ford";
        auto1.modelo="Ka";
        auto1.color="Rojo";
        
        auto1.acelerar();   
        auto1.acelerar();
        auto1.acelerar();
        
        auto1.frenar();
        
        auto1.acelerar(45);
        
        System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);
        
        /////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("--Auto2--");
        Auto auto2=new Auto();
        
        auto2.marca="Fiat";
        auto2.modelo="Idea";
        auto2.color="Gris";
        
        for(int a=0; a<=400; a++){
            auto2.acelerar();
            
        }
        System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.color+" "+auto2.velocidad);
        
         /////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("--Auto3--");
        
        Auto auto3=new Auto("Reanult","kangoo","Gris");
        
        auto3.acelerar(20);
        
         auto3.imprimirVelocidad();
         System.out.println(auto3.obtenerVelocidad());
         
         //JOptionPane.showMessageDialog(null, auto3.obtenerVelocidad());
         
         //El metodo toString esta declaado en la clase Object (clase Padre), sera sobreescrito en cada clase declarada
         System.out.println(auto3.toString());
         System.out.println(auto3);
         
         ///////////////////////////////////////////////////////////////////////////////////////
         System.out.println("--Empleado1--");
         Empleado empleado1=new Empleado(1,"Juan","Gomez",400);
         System.out.println(empleado1.toString());
         
         empleado1.setApellido("Juan");
         
        
       
        
        
        
    }
    
}
