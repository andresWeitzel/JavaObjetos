
package mypackage.test;

import java.util.List;
import mypackage.entities.ClienteMayorista;
import mypackage.entities.ClienteMinorista;
import mypackage.entities.Cuenta;

 /*Crearemos un objeto Mock, este nos servira para detectar posibles errores*/

public class Test {

    public static void main(String[] args) {
        System.out.println("///Proyecto Relaciones///");
        
        System.out.println("\n--Cuenta 1--");        
        Cuenta cuenta1=new Cuenta(1234,"$");
        cuenta1.depositar(40000);
        cuenta1.debitar(20000);
        
        System.out.println(cuenta1);
        
       
        System.out.println("\n--Cuenta 2--");
        Cuenta cuenta2=new Cuenta(1235,"us$");
        
        cuenta2.depositar(400);
        cuenta2.debitar(200);
        
        System.out.println(cuenta2);
        
        
        
        System.out.println("\n--Cliente Minorista 1--");   
        ClienteMinorista clienteMinorista1=new ClienteMinorista(1,"Jose","Gutierrez",1236);
        
        clienteMinorista1.getCuenta().depositar(30000);
        clienteMinorista1.getCuenta().debitar(10000);
        
        System.out.println(clienteMinorista1);
        
        
        
        
        System.out.println("--Clase Mayorista 1--");
        ClienteMayorista clienteMayorista1=new ClienteMayorista(1,"Qumica","Alburgue 564");
        
        //Creamos una variable llamada cuentas que es una lista de cuentas
        List<Cuenta> cuentas=clienteMayorista1.getCuentas();
        
        cuentas.add(new Cuenta(10,"$"));
        cuentas.add(new Cuenta(11,"us$"));
        cuentas.add(new Cuenta(12,"R$"));
        
        //El .get(indice) corresponde al arrayList
        //pesos
        cuentas.get(0).depositar(60);
        cuentas.get(0).debitar(12);
        //dolares
        cuentas.get(1).depositar(5000);
        //reales
        cuentas.get(2).depositar(400);
    
        System.out.println(clienteMayorista1);
        
        for(int a=0; a<cuentas.size(); a++){
            System.out.println(cuentas.get(a));
            
        }
    }
    
}
