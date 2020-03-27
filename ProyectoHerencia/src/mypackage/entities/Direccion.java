
package mypackage.entities;


public class Direccion { 
    
    private String calle;
    private String piso;
    private String departamento;
    private String ciudad;
    private int numero;

    
    /**
     *Este constructor se utiliza solamente para la ciudad autonoma de BS AS. 
     */
    public Direccion(String calle, String piso, String departamento,int numero) {
        this.calle = calle;
        this.piso = piso;
        this.departamento = departamento;
        this.ciudad="CABA";
        this.numero = numero;
        
        
    }

    public Direccion(String calle, String piso, String departamento, String ciudad, int numero) {
        this.calle = calle;
        this.piso = piso;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", departamento=" + departamento + ", ciudad=" + ciudad + '}';
    }
    
    
    
    
    
    
}
