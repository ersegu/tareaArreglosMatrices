/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos_matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author tloz
 */
public class EjMatriz1 {
    
    public int [][] RellenarMatriz (int pTamanho){
        int matriz[][]=new int [pTamanho][pTamanho];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+i+","+j+" de la matriz"));
            }
        }
        
        return matriz;
    }
    
    public int SumarEsquinas(int pMatriz[][]){
        int esquina1, esquina2, esquina3, esquina4;
        
        esquina1=pMatriz[0][0];
        esquina2=pMatriz[0][pMatriz[0].length-1];
        esquina3=pMatriz[pMatriz.length-1][0];
        esquina4=pMatriz[pMatriz.length-1][pMatriz.length-1];
        
        return (esquina1+esquina2+esquina3+esquina4);
    }
    
    public int SumarDiagonal(int pMatriz [][]){
        int suma=0;
        
        for (int i = 0; i < pMatriz.length; i++) {
            suma+=pMatriz[i][i];
        }
        
        return suma;
    }
    
    public int SumarDiagonalInversa(int pMatriz [][]){
        int suma=0;
        
        for (int i = 0; i < pMatriz.length; i++) {
            suma+=pMatriz[i][pMatriz.length-(i+1)];
        }
        
        return suma;
    }
    
    public int NumeroMayor(int pMatriz [][]){
        int numeroMayor=0;
        
        for (int i = 0; i < pMatriz.length; i++) {
            for (int j = 0; j < pMatriz[i].length; j++) {
                if (pMatriz[i][j]>numeroMayor) {
                    numeroMayor=pMatriz[i][j];
                }
            }
        }
        
        return numeroMayor;
    }
    
}
