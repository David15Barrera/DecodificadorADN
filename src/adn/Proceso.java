/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adn;

/**
 *
 * @author dav
 */
public class Proceso {
    public String obtenerResultado(String cadena1, String cadena2, String bases) 
    {
        //Lógica
        String resultado = null;
         if(cadena1.length() >= cadena2.length()){
            for (int r = cadena1.length(); r >= 0; r--)  
                         {
                                  for (int l = 0; l < r; l++){
                                      if (cadena2.contains(cadena1.substring(l, r)) && 
 
                    bases.length() < cadena1.substring(l, r).length())
                                  bases = cadena1.substring(l, r);//s
                                          }
            }
        }else if(cadena2.length() >= cadena1.length()) //la misma condicion pero ahora para ver la cadena 2 sea mayor a la cadena 1
                {

                    for (int r = cadena2.length(); r >= 0; r--)
                    {
            
                      for (int l = 0; l < r; l++) {
                         if (cadena1.contains(cadena2.substring(l, r)) && 
                             bases.length() < cadena2.substring(l, r).length()) {
                               bases = cadena2.substring(l, r);
                                  }
                        }
            
        }
        
    }
    resultado = bases;
    return resultado;
}
    }
