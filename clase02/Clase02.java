

//11/03/20.
//Literales->Buscar(se utilizan con true o false, no hace falta utilizar la sentencia new).
//Cada booleano utiliza 1 byte de almacenaje, aunque utilize realmente 1 bit(True or false).
        /*

Tipos de datos primitivos-->
boolean(1 byte),
byte(1 byte),
short(2 bytes),
int(4 bytes), el grappet de int en Integer(Los int son objetos de la clase Integer).
long(8 bytes,para poder ontener un int dentro de este tipo de dato long se debe colocar al final de la literar del long seria "L"-->(long lo=3000000L))
char(2 bytes,unicode(caracteres), las literales '' representan un caracter, con  "" es un string),
float(32 bytes,la literal para este tipo de dato es un f al final del valor de la variable float fl=8.85F).
double(64bytes, posee mayor precision, no se coloca literal por convencion.),
//var(Se implementa en jdk11 )(no es un tipo de dato como tal,pero la literal que nosotros le asignemos correrespondera al tipo de dato).//



Tipo de dato NO primitivo-->
String(el valor del objeto que se guarda en un vector es privdo y se utiliza un metodo publico que me permite el acceso a este objeto vector encapsulado(lenght)).

Metodos de la clase String hay diversos tipo toLowerCase,toUpperCase, etc. que nos ahorran la escritura de programacion
estructurada(tipo if forech,etc).se usan siempre y cuando tenga el objeto creado.

         */

package clase02;
public class Clase02 {
    
    public static void main(String[] args) {
        // Tipo de datos Referenciados (Objetos de clases)
         
        // Tipo de datos primitivos (Definidos por el lenguaje)
        
        //Tipo de datos enteros
        
        //Tipo de datos boolean     1 byte
        boolean bo= true;
        System.out.println(bo);       
        bo=false;
        System.out.println(bo);
        
        //Tipo de datos byte        1 byte
        byte by=120;
        System.out.println(by);
        by=-120;
        System.out.println(by);
        
        
        //Tipo de datos short       2 bytes
        short sh=2000;
        System.out.println(sh);
        
        //Tipo de datos int(Integer)    4 bytes
        int in=2000000000; 
        in=sh;
        //by=sh;
        System.out.println(in);
        
        //Tipo de datos long        8 bytes
        long lo=3000000000L;
        System.out.println(lo);
        
        //Tipo de datos char (unicode) 2bytes
        char ch=65;
        System.out.println(ch);
        ch+=32;
        System.out.println(ch);
        ch='f';
        System.out.println(ch);
        
        //Tipo de datos de punto flotante
        
        //Tipo de datos float 32 bits
        float fl=8.85f;
        System.out.println(fl);
        
        //Tipo de datos double 64 bits
        double dl=8.85;
        System.out.println(dl);
        dl=8.85d;
        System.out.println(dl);
        
        fl=10;
        dl=10;
                
        System.out.println(fl/3);
        System.out.println(dl/3);
        
        fl=100;
        dl=100;
                
        System.out.println(fl/3);
        System.out.println(dl/3);
        
        //Clase String
        String st="hola";
        System.out.println(st.length());
        System.out.println(st);
        
        
        /*
        Clase String
        
        Hasta JDK 9 almacena en un char[]           "hola" ocupa 8 bytes
        A partir de JDK 10 almacena en un byte[]    "hola" ocupa 4 bytes
        
        
        */
        
        
        //Tipo de datos var Java 9 o superior
        //Delega el tipo de datos en la literal que se le asigna.
        //La literal infiere en el tipo de datos.
        
        var var1=100;           // int
        //var1="Hola";          // error
        var1=200;
        
        var var2=true;          //boolean
        var var3="hola";        //String
        var var4=10L;           //long
        var4=1;
        var var5='a';           //char;
        var var6=2.25;          //double
        var var7=2.25d;         //double
        var var8=2.25f;         //float
        
        String texto="Cadena de texto!";
        System.out.println(texto);
        
        //recorrer el vector texto
        for(int a=0;a<texto.length();a++){
            System.out.print(texto.charAt(a));
        }
        System.out.println();
        
        //Imprimir texto en mayusculas
        for(int a=0;a<texto.length();a++){
            char car=texto.charAt(a);
            if(car>=97 && car<=122) car-=32;
            System.out.print(car);
        }
        System.out.println();
        
        //Operador Ternario ?
        for(int a=0;a<texto.length();a++){
            char car=texto.charAt(a);
            System.out.print((car>=97 && car<=122)?car-=32:car);
        }
        System.out.println();
        
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        
        //uso de literales de lenguaje
        metodo("2"); //imprime 2
        metodo('2'); //imprime 1
        metodo(2);   //imprime 3
        metodo(2L);  //imprime 4
        metodo(3.25); //imprime 6
        metodo(3.25d); //imprime 6
        metodo(3.25f); //imprime 5
      
        
    }//end main
    
    public static void metodo(char ch){
        System.out.println("1");
    }
    public static void metodo(String s){
        System.out.println("2");
    }
    public static void metodo(int i){
        System.out.println("3");
    }
    public static void metodo(long l){
        System.out.println("4");
    }
    public static void metodo(float f){
        System.out.println("5");
    }
    public static void metodo(double d){
        System.out.println("6");
    }
    
}//end class


