
package tp5;

/**
 *
 * @author Patricia
 */
public class Tp5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[]= new int[] {12, 3, 45, 66};
        
        int arrBi [][]= new int [][]{{33, 2, 47, 7}, {12,22,78}, {9,3}};
        
        String frase = "La vida es bella";
        
        String palabra="La casa de mi abuela es muy arquitectónica";
        char p ='a';
        
        
        Arreglo.sumarLista(arr);
    
        Arreglo.buscarMayor(arrBi);
        
        Arreglo.cuentaVocales(frase);
        
        Arreglo.cuentaCaracter(palabra, p);
}
}