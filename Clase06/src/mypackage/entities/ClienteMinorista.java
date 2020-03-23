package mypackage.entities;

public class ClienteMinorista {
    
    private int nro;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;

    public ClienteMinorista(int nro, String nombre, String apellido,int nroCuenta) {
        this.nro = nro;
        this.nombre = nombre;
        this.apellido = apellido;     
        //Creando un objeto cuenta nos aseguramos que la cuenta solo sea de este cliente y no haya otra preeexistente
        cuenta=new Cuenta(nroCuenta,"$"); 
    }

 
    public int getNro() {
        return nro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "ClienteMinorista{" + "nro=" + nro + ", nombre=" + nombre + ", apellido=" + apellido + ", " + cuenta + '}';
    }
    
    
    
}
