/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MatricesAmpliacion;

import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ej1 {

    
    public static void main(String[] args) {
       
        Scanner tec = new Scanner (System.in);
        int mat[][]=new int[2][2];
        
        for (int i = 0; i < mat.length; i++) {
            
            for (int j = 0; j < mat[i].length; j++) {
                
                mat[i][j]=tec.nextInt();
                
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            
            System.out.println(mat[i][i]);
            
        }
        
        
    }
    
}
