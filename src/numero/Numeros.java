/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numero;

/**
 *
 * @author alum.fial1
 */
public class Numeros {
     private int [] numeros;
    private int[] numero;
   
     public Numeros (int[] numeros){
         for(int i=0;i<numeros.length;i++){
             this.numeros[i]=numeros[i];
             
         }
     }
  
     public int maximo(int[] numero){
      int max=0;
      for (int i = 0 ; i <numero.length;i++){
          if (numero[i]>max){
              max=numero[i];
              
          }
      }
        

