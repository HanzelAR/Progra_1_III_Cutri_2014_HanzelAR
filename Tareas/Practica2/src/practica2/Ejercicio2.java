/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
    int N;
    
    public Ejercicio2(int N){
        this.N=N;
    }
    
    public int UltimoN(){
        int NN=N;
    do{if(N>10){
         NN=NN-10;
    }else{
        NN=N;
    }
  
    }while(NN>10);
    
    return NN;
}
    public int evalua(){
        int resul=0;
        if(UltimoN()==2||UltimoN()==5||UltimoN()==8){
            resul=N*N;
        }else{
        if(UltimoN()==4||UltimoN()==7||UltimoN()==9){
            resul=N*5;
        }
        }
        if(UltimoN()==0||UltimoN()==1||UltimoN()==3||UltimoN()==6){
            resul=N;
        }
        return resul;
    }
}