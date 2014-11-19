/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz2;

/**
 *
 * @author Usuario
 */
public class ListaNumero {
    private NodoNumero raiz;
    
    public void Insertar(NodoNumero elemento){
        NodoNumero nuevo;
        nuevo=new  NodoNumero();
        nuevo.setNumero(elemento.getNumero());
        
        if(raiz==null){
            nuevo.setSiguiente(null);
            raiz=nuevo;
        }else{
            NodoNumero auxiliar=raiz;
            while(auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    public String ContadorNumros(){
        int contador1=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        int contador5=0;
        int contador6=0;
        int contador7=0;
        int contador8=0;
        int contador9=0;
        int contador10=0;
        String retorno="";
        
        NodoNumero auxiliar=raiz;
          while(auxiliar!=null){
              if(auxiliar.getNumero()==1){
               contador1++;   
              }
                if(auxiliar.getNumero()==2){
               contador2++;   
              }
                  if(auxiliar.getNumero()==3){
               contador3++;   
              }
                    if(auxiliar.getNumero()==4){
               contador4++;   
              }
                      if(auxiliar.getNumero()==5){
               contador5++;   
              }
                        if(auxiliar.getNumero()==6){
               contador6++;   
              }
                          if(auxiliar.getNumero()==7){
               contador7++;   
              }
                            if(auxiliar.getNumero()==8){
               contador8++;   
              }
                              if(auxiliar.getNumero()==9){
               contador9++;   
              }
                                if(auxiliar.getNumero()==10){
               contador10++;   
              }
                auxiliar=auxiliar.getSiguiente();
            }
          retorno+=contador1 +" Repeticiones de 1 "+"\n";
          retorno+=contador2 +" Repeticiones de 2 "+"\n";
          retorno+=contador3 +" Repeticiones de 3 "+"\n";
          retorno+=contador4 +" Repeticiones de 4 "+"\n";
          retorno+=contador5 +" Repeticiones de 5 "+"\n";
          retorno+=contador6 +" Repeticiones de 6 "+"\n";
          retorno+=contador7 +" Repeticiones de 7 "+"\n";
          retorno+=contador8 +" Repeticiones de 8 "+"\n";
          retorno+=contador9 +" Repeticiones de 9 "+"\n";
          retorno+=contador10 +" Repeticiones de 10 ";
          
          return retorno;
    }
    
}
