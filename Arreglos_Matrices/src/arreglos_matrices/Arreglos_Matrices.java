/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos_matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author tloz
 */
public class Arreglos_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Arreglos - Ejercicio 1
        
            EjArreglo1y2 ejA1 = new EjArreglo1y2();
            int arreglo[];

            //Solicitar el tamaño del arreglo y llenarlo.
            arreglo=ejA1.rellenarArreglo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo")));
        
            //Mostrar el arreglo
            JOptionPane.showMessageDialog(null,ejA1.MostrarArreglo(arreglo));

        //Arreglos - Ejercicio 2
            
            //Buscar un numero dentro del arreglo e indicar la posicion de dicho numero.
            JOptionPane.showMessageDialog(null, ejA1.BuscarArreglo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea buscar en el arreglo")), arreglo));
        
        //Arreglos - Ejercicio 3
            
            EjArreglo3 ejA3 = new EjArreglo3();
            int arreglo1[]={1000,2500,4000,500,6000};
            int arreglo2[]={500,2000,3000,600,4500,7400};
            int arreglo3[]={5000,3200,1300,4500};
            int arreglo4[]={700,1400,1600,7000,10000,300,3000};
            int arreglo5[]={2400,3100,4000,500,3600,4700,7500};
            
            int vendedor=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de vendedor del cual desea sumar las ventas"));
            switch (vendedor) {
            case 1:
                JOptionPane.showMessageDialog(null, ejA3.TotalVentas(vendedor, arreglo1));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, ejA3.TotalVentas(vendedor, arreglo2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, ejA3.TotalVentas(vendedor, arreglo3));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, ejA3.TotalVentas(vendedor, arreglo4));
                break;
            case 5:
                JOptionPane.showMessageDialog(null, ejA3.TotalVentas(vendedor, arreglo5));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Numero de vendedor invalido.");
        }
        
        //Matrices - Ejercicio 1
        
            EjMatriz1 ejM1 = new EjMatriz1();
            
            int matriz[][];
            
            //Solicitar el tamaño de la matriz y llenarla.
            matriz=ejM1.RellenarMatriz(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz")));
            
            //Calcular la suma de las 4 esquinas.
            JOptionPane.showMessageDialog(null, "La suma de las 4 esquinas es igual a: "+ejM1.SumarEsquinas(matriz));
            
            //Calcular la suma de la diagonal
            JOptionPane.showMessageDialog(null, "La suma de la diagonal es igual a: "+ejM1.SumarDiagonal(matriz));
            
            //Calcular la suma de la diagonal Inversa
            JOptionPane.showMessageDialog(null, "La suma de la diagonal inversa es igual a: "+ejM1.SumarDiagonalInversa(matriz));
            
            //Obtener el numero mayor de toda la matriz
            JOptionPane.showMessageDialog(null, "El numero mayor de la matriz es: "+ejM1.NumeroMayor(matriz));
        
        //Matrices - Ejercicio 2
        
            EjMatriz2 ejM2 = new EjMatriz2();
                        
            //Se llena la matriz con numeros al azar del 1 al 1000
            matriz=ejM2.RellenarMatriz();
            
            //Se recorre la matriz
            JOptionPane.showMessageDialog(null, ejM2.RecorrerMatriz(matriz));
            
            //Obtener el numero menor de toda la matriz
            JOptionPane.showMessageDialog(null, "El numero menor de la matriz es: "+ejM2.NumeroMenor(matriz));
            
        
        
    }
    
}
