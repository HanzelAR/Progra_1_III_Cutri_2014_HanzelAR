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
public class ListaPalabras {
    
     private NodoPalabras raiz;
    
    public void Insertar(NodoPalabras elemento)
    {
        NodoPalabras nuevo;
        nuevo=new NodoPalabras();
        nuevo.setPalabra(elemento.getPalabra());
        
        if(raiz==null)
        {
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }
        else
        {
            NodoPalabras auxiliar=raiz;
            while (auxiliar.getSiguiente()!=null) {
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }        
    }     
    
    public boolean Duplicado(String palabra)
    {
        NodoPalabras auxiliar=raiz;
        while (auxiliar!=null) {
            if(auxiliar.getPalabra().equals(palabra))
                return true;
            else
                auxiliar=auxiliar.getSiguiente();
        }
        return false;
    }
    
    public String Imprimir()
    {
        String retorno="";
        NodoPalabras auxiliar=raiz;
        while (auxiliar!=null) {
            retorno+=auxiliar.getPalabra() +"\n";
            auxiliar=auxiliar.getSiguiente();
        }
        return retorno;
    }
    
}
