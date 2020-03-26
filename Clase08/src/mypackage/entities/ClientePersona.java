
package mypackage.entities;

public class ClientePersona extends Persona {

    private int numero;
    private Cuenta cuenta;

    public ClientePersona(int numero, Cuenta cuenta, String nombre, String apellido, int edad, Direccion direccion) {
        super(nombre, apellido, edad, direccion);
        this.numero = numero;
        this.cuenta = cuenta;
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un cliente!");
    }
    
    
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()+ "ClientePersona{" + "numero=" + numero + ", cuenta=" + cuenta + '}';
    }
    
    
    
}
