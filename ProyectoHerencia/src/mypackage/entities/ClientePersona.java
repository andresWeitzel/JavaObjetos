
package mypackage.entities;

public class ClientePersona extends Cliente {

    private int numero;
    private Cuenta cuenta;
    private Persona datosPersonales;

    public ClientePersona(int numero, Cuenta cuenta, Persona datosPersonales) {
        this.numero = numero;
        this.cuenta = cuenta;
        this.datosPersonales = datosPersonales;
    }
    

    

    public void saludar(){
        System.out.println("Hola soy un cliente!");
    }
    
   
}
