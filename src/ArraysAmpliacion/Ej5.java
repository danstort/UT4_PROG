/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysAmpliacion;

import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ej5 {
    
    public static void main(String[] args){
    
        Scanner tec = new Scanner (System.in);
        
        int cont=0;
        char v []=new char [7];
        
        for (int i = 0; i < 7; i++) {
            
            v[i]=tec.nextLine().charAt(0);
            
            
        }
        
        char v2;
        
        for (int i = 0; i < 7; i++) {
            
            v2=v[i];
            
            if (v2== 'a'|v2== 'e'|v2== 'i'|v2== 'o'|v2== 'u'){
            
                cont++;
                
            }
            
            
        }
        
        System.out.println("Vocales="+cont);
    }
}
