/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dav
 */
public class Decodificar {
    //Arreglo para poder hubicar los archivos en la decodificacion mediante un arrayList
     ArrayList<String> arreglo1= new ArrayList<String>();
    ArrayList<String> arreglo2 = new ArrayList<String>();
 
    Scanner sc = new Scanner(System.in);
    //Variables donde se guardan las secuencias de ADN
    String cadena1,cadena2;
    
    /*  
    Guardan las cadenas de ADN que se ingresen para
    Luego mandaran como parametro esas mismos Strings para 
    los metodos que descompondran la cadena y guardar asi como un arreglo de letras*/
    public void cadenas() {
        System.out.println("Secuencias de ADN de formas de vida diferentes "+
                " "+"Ingrese la primera secuencia de ADN:");
        cadena1 = sc.nextLine();
        System.out.println("Ingrese la segunda secuencia de ADN:");
        cadena2 = sc.nextLine();
        
        secuencia1(cadena1);
        secuencia2(cadena2);
        buscador();
    }

    public void secuencia1(String secuencia1) {
        String[] c1 = secuencia1.split("");

        for (int i = 0; i < secuencia1.length(); i++) {
            int a = 0;
            for (int j = 0; j < secuencia1.length() - i; j++) {
                String tmp = "";
                for (int k = 0; k < i + 1; k++) {
                    a = j + k;
                    tmp += c1[a];
                }
                arreglo1.add(tmp);
            }
        }

    }

    public void secuencia2(String secuencia2) {
        String[] c2 = secuencia2.split("");

        for (int i = 0; i < secuencia2.length(); i++) {
            int a = 0;
            for (int j = 0; j < secuencia2.length() - i; j++) {
                String tmp = "";

                for (int k = 0; k < i + 1; k++) {
                    a = j + k;
                    tmp += c2[a];
                }
                arreglo2.add(tmp);
            }
        }

    }
    /*Se busca las letras en los dos arreglos que sean comunes 
    y consecutivas; se guarda en un String que sera la cadena respuesta*/
    public void buscador() {
       String Secuencia = "";
        for (int j = 0; j < arreglo1.size(); j++) {
            for (int i = 0; i < arreglo2.size(); i++) {        
                if(arreglo1.get(j).equals(arreglo2.get(i))){
                    Secuencia = arreglo1.get(j);
                }
            }
        }
        System.out.println("\n"+Secuencia+" "+"Es el conjunto ordenado de bases adyacentes de mayor tamaño que se encuentra en ambas formas de vida");
    }
}
