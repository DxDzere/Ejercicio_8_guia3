/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8_guia3;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_8_guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int elem;
        
        System.out.println("Ingrese la cantidad de elemento que tendra el cuadrado");
        elem = leer.nextInt();
        
        for (int i = 0; i < elem; i++) {
            for (int j = 0; j < elem; j++) {
                if(i==0 || i==elem-1){
                    System.out.print("*");
                }else if(j==0 || j==elem-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
