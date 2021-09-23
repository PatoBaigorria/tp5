/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author Patricia
 */
public class Arreglo {
    
    
    
    public static void sumarLista(int arr[]){
        int suma=0;
        double prom=0;
        
        for (int i=0; i<arr.length; i++){
            suma+=arr[i];
        }
        prom=(double)suma/arr.length;
        
        System.out.println("La suma del Arreglo es: "+suma+" y el Promedio es: "+prom);
    }
    
    public static void buscarMayor(int arrBi[][]){
        int mayor=0;
               
        for(int i=0; i<arrBi.length; i++){ 
            for(int j=0; j<arrBi[i].length; j++)
                if(arrBi[i][j]>mayor){
                    mayor=arrBi[i][j];
                }
           }
            System.out.println("El entero más grande es: "+mayor);
 
    }
    
    public static void cuentaVocales(String frase){
        int contVocales=0;
        
        for(int i=0; i<frase.length(); i++){
            if((frase.charAt(i)=='a')||(frase.charAt(i)=='e')||(frase.charAt(i)=='i')||(frase.charAt(i)=='o')||(frase.charAt(i)=='u')){
                contVocales++;
            }
            
        }
        System.out.println("La Cantidad Total de Vocales es: "+contVocales);
    }
    
    public static void cuentaCaracter(String palabra, char p){
        
        int contPal=0;
        
        for(int i=0; i<palabra.length(); i++){
            if (palabra.charAt(i)=='a'){
                contPal++;
            }
           }
        System.out.println("La Cantidad Total que se repite el carácter a es: "+contPal);
    }
}
