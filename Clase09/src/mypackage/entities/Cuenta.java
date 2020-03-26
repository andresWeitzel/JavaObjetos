package mypackage.entities;

//Clase final, no se podra crear una clase hija, por ende no se podra sobreescribir la clase padre
public final class Cuenta {
    
    private int nro;
    private String moneda;
    private float saldo;
    
   

    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda; 
    }
    /**
     * Se modifica el parametro  saldo(erroneo) por  monto(correcto) de la siguiente funcion 
     * presentado en la documentacion UML
     */
    
    public void depositar(float monto){
        this.saldo+=monto;
        
    }
    /**
     * Se modifica el parametro  saldo(erroneo) por monto(correcto) de la siguiente funcion
     * presentado en la documentacion UML
     */
    public void debitar(float monto){
        this.saldo-=monto;
    }
   
    
    
    
    @Override
    public String toString() {
        return "Cuenta{" + "nro_cuenta=" + nro + ", moneda=" + moneda + ", saldo=" + saldo + '}';
    }

    public int getNro_cuenta() {
        return nro;
    }

    public String getMoneda() {
        return moneda;
    }

    public float getSaldo() {
        return saldo;
    }
    
    
    
}
