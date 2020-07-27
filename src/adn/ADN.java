/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adn;

import Interfaz.INterfazADN;

/**
 *
 * @author dav
 */
public class ADN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Para mostrar la interfaz
         INterfazADN entrada = new INterfazADN();
         entrada.show();  
       //Para mostrar la logica del programa mediante consola    
       /*  Decodificar lc = new Decodificar();
        lc.cadenas();*/
    }
    
}
