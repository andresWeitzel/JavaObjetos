/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase16;

/**
 *
 * @author andre
 */
public class TestAuto {
    public static void main(String[] args) {
        
        //VECTORES
        System.out.println("\n**Vector del tipo autos de la clase Auto**");
        Auto[] autos=new Auto[4];
        autos[0]=new Auto("Fiat","Palio","Verde");
         autos[1]=new Auto("WMW","Gol","Blanco");
          autos[2]=new Auto("Renault","Clio","Rojo");
           autos[3]=new Auto("Fiat","Uno","Gris");
        
           //foreach
           for(Auto auto:autos){
               System.out.println(auto);
               
           }
    
        System.out.println("\n**Vector del tipo Object de la clase Auto**");
        int[] vector=new int[4];
        
        for(int vectores:vector){
        System.out.println(vectores);
        
        }

    }
    
}
