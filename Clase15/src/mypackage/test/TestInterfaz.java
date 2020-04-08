/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.test;

import java.util.Scanner;
import mypackage.implementation.ArchivoBinario;
import mypackage.implementation.ArchivoTexto;
import mypackage.interfaces.I_Archivo;

/**
 *
 * @author andre
 */
public class TestInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //Creamos una referencia a la interfaz, puede contener objetos de cualquiera de sus implementaciones
        I_Archivo archivo=null;
        
        /*Permitir que el usuario que tipo de archivo quiere usar*/
        System.out.println("Ingrese si desea ArchivoBinario o ArchivoTexto: ");
        String in=new Scanner(System.in).next();
        
        //FORMA ESTRUCTURADA
        /*if(in.equalsIgnoreCase("ArchivoTexto")){
            archivo=new ArchivoTexto();
        }
         if(in.equalsIgnoreCase("ArchivoBinario")){
            archivo=new ArchivoBinario();
        }*/
        
        //FORMA NO ESTRUCTURADA
        //Con esto creamos un objetos de lo que desee el usuario
       /* archivo=(I_Archivo)Class
                .forName("mypackage.implementation."+in)
                .newInstance();
        */
       
        //Modificamos el codigo anterior para sacarnos de encima el metodo deprecado
         archivo=(I_Archivo)Class
                .forName("mypackage.implementation."+in)
                .getConstructors()[0].newInstance();/*Pedimos los constructores de las
         clases, estos devuelven los datos en arrays e instanciamos estos constructores para
         utilizar los objetos
        */
        
        //Imprimimos la info en consola
        archivo.setText("");
        System.out.println(archivo.getText());
        archivo.info(); 
        
    }
    
}
