package arreglos_matrices;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tloz
 */
public class EjArreglo1y2 {
    String r;
    
    public int [] rellenarArreglo (int pTamanho){
        int arreglo[]=new int [pTamanho];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+i+" del arreglo"));
        }
        
        return arreglo;
    }
    
    public String MostrarArreglo (int pArreglo[]){
        r="";
        
        for (int i = 0; i < pArreglo.length; i++) {
            r+="El numero de la posicion "+i+" del arreglo es: "+pArreglo[i]+"\n";
        }
        
        return r;
    
    }
    
    public String BuscarArreglo (int pNumero, int pArreglo[]){
        r="";
        
        for (int i = 0; i < pArreglo.length; i++) {
            if (pArreglo[i]==pNumero) {
                r+="El numero "+pNumero+" se encuentra en la posicion: "+i+" dentro del arreglo.\n";
            }
        }
        
        if (r.equals("")) {
            r="El numero "+ pNumero+" no se encuentra en el arreglo";
        }
        
        return r;
    }
    
}
