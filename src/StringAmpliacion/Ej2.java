/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StringAmpliacion;

import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ej2 {

   
    public static void main(String[] args) {
        
       Scanner tec = new Scanner(System.in);
       
       String entrada=tec.nextLine();
       
       String sEspac =entrada.replace(" ", "");
       String rev="";
       
        
        
        for (int i = sEspac.length()-1; i >=0 ; i--) {
            
            rev=rev+sEspac.charAt(i);
            
        }
       
        
        
        String espejo = sEspac+rev;
        
        System.out.println("Cadena espejo: "+espejo);
    }
    
}
