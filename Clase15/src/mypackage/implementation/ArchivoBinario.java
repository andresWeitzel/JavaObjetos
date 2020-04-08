/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.implementation;

import mypackage.interfaces.I_Archivo;

/**
 *
 * @author andre
 */
public class ArchivoBinario implements I_Archivo {

    @Override
    public void setText(String text) {
        System.out.println("Escribiendo ArchivoBinario");}

    @Override
    public String getText() {
     return "ArchivoBinario";        
    }
}
