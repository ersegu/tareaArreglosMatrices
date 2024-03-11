/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos_matrices;

/**
 *
 * @author tloz
 */
public class EjMatriz2 {
    
    
    public int [][] RellenarMatriz (){
        int matriz[][]=new int [3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int) (Math.random()*1000)+1;
            }
        }
        
        return matriz;
    }
    
    public String RecorrerMatriz(int pMatriz[][]){
        String r="";
            for (int i = 0; i < pMatriz.length; i++) {
                for (int j = 0; j < pMatriz[i].length; j++) {
                    r+=pMatriz[i][j]+"    ";
                }
                r+="\n";
            }
        return r;
    }
    
    public int NumeroMenor(int pMatriz [][]){
        int numeroMenor=1000;
        
        for (int i = 0; i < pMatriz.length; i++) {
            for (int j = 0; j < pMatriz[i].length; j++) {
                if (pMatriz[i][j]<numeroMenor) {
                    numeroMenor=pMatriz[i][j];
                }
            }
        }
        
        return numeroMenor;
    }
    
}
