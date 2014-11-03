/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase8;

/**
 *
 * @author Usuario
 */
public class ejercicio1 {
    int[] arreglos=new int[8];
    
    public void AgregarValores(int valor){
        for(int i=0;i<arreglos.length;i++){
            if(arreglos[i]==0){
                arreglos[i]=valor;
                break;
            }
        }
    }
   public int ImprimirValores(){
       int n=0,r=0;
       for(int i=0;i<arreglos.length;i++){
           n=arreglos[i];
             r=r+n;
       }
       return r;
   }
   public String AcumulaValores(){
         String tabla="",aum=""; int n=0,sumacontador=-1; int suma=0;
     int nu=0;
     for(int i=0;i<arreglos.length;i++){
         n=arreglos[i];
             suma=suma+n;
     tabla+=arreglos[i]+";";
         if(suma>=36){
             aum+=tabla+"\n";
             tabla="";
             suma=0;
         }
         sumacontador++;
         if(sumacontador>=7){
             
            nu++;
             i=nu-1;
             suma=0;
             tabla="";
             sumacontador=nu-1;
            
         }
     }
        return aum;
   }
   public String CantidadValores(){
       String dato="";
    for(int i=0;i<arreglos.length;i++){
        if(arreglos[i]>=50){
            dato=dato + arreglos[i]+" ";
        }
    }    
    return dato;
   }
}
