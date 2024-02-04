/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PatronesAmpliacion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Ej3 {

    
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Pattern p = Pattern.compile("(@)[0-9]*[a-zA-Z]*");
        Matcher m = p.matcher(tec.nextLine());
        
        if(m.find()){
        
            System.out.println("Valido");
            
        } else {
            System.out.println("No valido");
        }

    }
    
}
