package mypackage.entities;

import java.util.ArrayList;
import java.util.List;

public class ClienteMayorista {
    private int nro;
    private String razonSocial;
    private String direccion;
    private List<Cuenta> cuentas;

    public ClienteMayorista(int nro, String razonSocial, String direccion) {
        this.nro = nro;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.cuentas=new ArrayList();
        
    }

    public int getNro() {
        return nro;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    @Override
    public String toString() {
        return "ClienteMayorista{" + "nro=" + nro + ", razonSocial=" + razonSocial + ", direccion=" + direccion + '}';
    }
    
    
    
    
}
