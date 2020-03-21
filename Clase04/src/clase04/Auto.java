package clase04;

public class Auto {
    //atributos
    String marca;
    String modelo;
    String color;
    int velocidad;
    
    //Constructores
    //Contructor vacio
    /**
     *  Este metodo esta deprecado por quien Andres Correa el 13/03/2020 por ser inseguro
     * Usar en su reemplazo-->Auto(String marca, String modelo, String color){} 
     * @deprecated
     * 
     */
    @Deprecated//Annotation-->Se utilizan para objetos que estan en desuso
    Auto(){
        
    }
    //Constructor sobrecarcado 
    Auto(String marca, String modelo,String color){//No posee la palabra void porque no devuelve parametros.
        
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        
    }
    //Metodos
    void acelerar(){    //acelerar
     
       acelerar(10);//Invocando  al metodo de la misma clase(acelerarInt)
        
    }
  
    /**
     * 
     * @param kilometros cantidad de kilometros a incrementar la velocidad 
     */
    
    void acelerar(int kilometros){  //acelerarInt
       
        velocidad+=kilometros;
        
         //Control de velocidad
        if(velocidad>100){
            velocidad=100;
        }
           
    }
    
    void acelerar(int r, int x ){   //acelerarIntInt
        
    }
    
    void frenar(){
        velocidad-=10;
    }
    
    void imprimirVelocidad(){
        System.out.println(velocidad);
    }
    
    int obtenerVelocidad(){ //Esta encabezado por este tipo de dato ya que devuelve un valor de tipo entero
        return velocidad;//El valor debe ser el mismo tipo de dato que el metodo
    }
    
    @Override
    public String toString(){
        return marca+" "+modelo+" "+color+" "+velocidad;

    }
    
}

