/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practialistas1;

/**
 *
 * @author Usuario
 */
public class NodoPalabras {
    
     private String palabra;
      private NodoPalabras siguiente;
      
      public NodoPalabras()
      {
          palabra="";
          siguiente=null;
      }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    } 

    /**
     * @return the siguiente
     */
    public NodoPalabras getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPalabras siguiente) {
        this.siguiente = siguiente;
    }
    
}
