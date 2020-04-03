/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.test;

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
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos una referencia a la interfaz, puede contener objetos de cualquiera de sus implementaciones
        I_Archivo archivo=null;
        
        //Un objeto de la clase ArchivoBinario y cualquier clase puede ser contenido dentro de una variable de referencia de la interfaz
        archivo=new ArchivoBinario();
       
        archivo.setText("");
        System.out.println(archivo.getText());
        archivo.info();
       
        
    }
    
}
