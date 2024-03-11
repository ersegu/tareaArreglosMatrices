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
public class EjArreglo3 {
    
    public String TotalVentas(int pVendedor, int pArreglo[]){        
        return "El total vendido por el vendedor "+pVendedor+" es de: "+SumarVentas(pArreglo);
    }
    
    private double SumarVentas (int pArreglo[]){
        double suma=0;
        
        for (int i = 0; i < pArreglo.length; i++) {
            suma+=pArreglo[i];
        }
        
        return suma;
    }
    
    
}
