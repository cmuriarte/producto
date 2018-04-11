/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parreglo;

import java.util.Scanner;


/**
 *
 * @author muriarte
 */
public class Ejer2 {    
    int arreglo[]=new int[5];
    Scanner teclado=new Scanner(System.in);
    int suma=0;
    int resta=0;
    float promedio;
    int numero=0;
    int mayor=0;
    int menor=0;
    int ordenar=0;
    //metodo carga numero enteros 
    public void carga(){                                             
        for (int i = 0; i < arreglo.length; i++) {                                                                                                               
                arreglo[i]=teclado.nextInt();                                        
          }                       
    }
    
  //metodo  resta/suma/promedio
    public void suma(){
        for (int i = 0; i < arreglo.length; i++) {            
            suma=suma+arreglo[i];            
        }
        System.out.println("La suma es : "+suma);
    }    
        
     public void resta(){         
        for (int i = 0; i < arreglo.length; i++) {
            resta=resta-arreglo[i];
        }
        System.out.println("La resta es : "+resta);
     }   
        
    public void promedio(){                    
        promedio=suma/5;        
        System.out.println("El promedio es : "+promedio);            
    }
    //metodo busca el mayor   
    public void mayor(){
        mayor=arreglo[0];
       for (int i=1;i<arreglo.length;i++){                      
           if (mayor < arreglo[i]){
               mayor=arreglo[i];               
           }                                  
       }        
        System.out.println("El nro mayor es : "+mayor);      
       
   } 
    
    //Metodo busca el menor
    public void menor(){
        menor=arreglo[0];        
        for (int i = 1; i < arreglo.length; i++) {            
            if (menor > arreglo[i]){
                menor=arreglo[i];
            }            
        }        
        System.out.println("EL nro menor es :"+menor );        
    }
    
    
    //Metodo Ordenar el arreglo
    public void ordenar(){
        
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i; j < arreglo.length; j++) {
                
                if (arreglo[j]>arreglo[j+1]){
                    ordenar=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=ordenar;                                          
                  }
                
            }
            
        }
        
        
        System.out.println("Arreglo Ordenado");
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
            
        }
        
        
    }
    
}
