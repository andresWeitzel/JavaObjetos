package mypackage.test;

import mypackage.entities.Dato;

public class Test {
    public static void main(String[] args) {
        
        Dato dato1=new Dato(2);
        Dato dato2=dato1;
        //Por mas que dato3 tenga el mismo estado que los dos anteriores al colocar new
        //instanciamos un nuevo objeto en memoria
        Dato dato3=new Dato(2);
        Dato dato4=new Dato(4);
        String string1="2";
        
        System.out.println("\n**Usando el Metodo hashCode()**");
        System.out.println("\n--Imprimimos los Datos--\n");
        Object arrayDatos[] = {dato1,dato2,dato3,dato4};       
        for(Object e: arrayDatos){
            System.out.println(e);
        }
        
        /*El metodo hashcode es un comportamiento heredado de la clase Object
          Este metodo no quiere decir que sea abstracto al no tener texto, y tambien posse
        un modificador de acceso llamdo native, esto quiere decir que esta implementado en lenguaje C. 
        */
        System.out.println("\n--Imprimimos los hash de los Datos--\n");
        Object arrayDatoshash[] = {dato1.hashCode(),dato2.hashCode(),dato3.hashCode(),dato4.hashCode()};       
        
        
        System.out.println("Los hash de cada dato son ");
        for(Object e: arrayDatoshash){
            
            System.out.println(e);
            
        }
        
        
        System.out.println("\n**Usando el Metodo equals()**");
        /*Con equals comparamos objetos y nos devuelve booleano(true or false)*/
        System.out.println(dato1.equals(dato1));
        System.out.println(dato1.equals(dato3));
        
        
        
 
        
        
        
    }
    
}
