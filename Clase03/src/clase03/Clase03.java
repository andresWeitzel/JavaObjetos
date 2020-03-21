package clase03;

public class Clase03 {

    public static void main(String[] args) {

        /*
        Archivo .java contiene los siguientes miembros-->clases,interfaces,enumerados a partir de jdk9 puede contener modulos.
        
        Un solo miembro de archivo puede ser publico y dicho miembro tiene qe tener el mismo nombre que el archivo .java
        
        Un miembro de archivo que no es publico, no puede ser accecido desde clases de otro paquete 
        
        Identificadore:Son los nombres que le ponemos a las cosas en java(Clases,objetos, variables, constantes)
        
        Para los identificadores se deben usar letras(<127) o numeros, se permte el simbolo pesos y guion bajo, otro caracter no
        
        Un identificador puede iniciar su nombre con letra o simbolo peso o guion bajo, no puede iniciar el nombre con un numero
        
        Ejemplo de identificadores validos->
        int numero1
        int $1numero
        int numero_1
        
        Ejemplo de identificadores no validos->
        int 1numero
        int 1numero#1
        
 
        */
 
    /*
      ¿QUE ES UNA CLASE?
        Todo lo sustantivo es una clase y representa una idea generica de la realidad
        Los adejtivos seran los atributos.
        Los verbos seran los metodos
        Cada clase representa una plantilla para crear objetos
        Los nomrebs de clases deben escribirse en singular con la primera letra en mayuscula
        
        Ejemplos de clases-->
        Alumno, Cliente, Cuenta, Aula
        
        ¿Clases en java?
        Cada clase en java es un objeto de la clase Class.Esta clase representa todas las clases.
        Para los diseños de las clases en java se utiliza un uml como partida, luego las modificaciones de este se documentan coom javadoc
        
        ¿Que son los atributos?
        Los atributos son variables contenidos dentro de la clase.Se utilizan para descubrir la clase,y tiene un tipo de datos asocidos.
        Las clases declaran los atreibutos, y los objetos completan el estado.
        
        El estado de un objeto es el valor de sus atributos
        
        Atributos en Java?
        Los atributos de java tiene un proceso de inicializaciopn automatico
        Los atributos numericos se inicializan en 0, los String se inicilizan en null.
        Los atributos en java son objetos de la clase java.lang.reflect.Field
        
        
        ¿Que son los metodos?
        Son acciones(verbos) que realiza la clase.Pueden tener parametros de salida y entrada
        
        ¿Metodos en java?
         Son objetos de la clase java.lang.reflect.Method
        
        ¿Que son los objetos?
        Los objetos son instancias de una clase y representan una situacion en particular, tiene estado propio
        
        ¿Objetos en java?
        Pertenecen a una clase, todos los objetos de java pueden ser contenidos en una variable de la clase Object.
        Con la palabra "new" creamos un objeto indicando el constructor de clase 
        
        
        Sobrecarga de Metodos:
        La sobrecarga se produce cuando una clase tiene metodos con el mismo nomrbe pero diferente firma de parametros.
        
        Metodos constructores:
        Son metodos que inicilizam un objeto, no tiene devoucion de datos, pueden ser sobrecargados, si la clase no tiene un metodo
        por defecto se creara en tiempo de conpilacion.
        El metodo constructor tiene el mismo nombre que la clase y es el unico metodo que inicia con mayuscula 
        
        
        
        
        */
    
    
    
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
        
         System.out.println(auto3.marca+" "+auto3.modelo+" "+auto3.color+" "+auto3.velocidad);
        
       
        
        int x;
        //x=0; //Los primitivos no pueden ser nuleables
        //System.out.println(x);//La variables debe ser inicializada
    }
    
}
