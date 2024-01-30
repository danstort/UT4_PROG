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
public class Ej1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int plus4 = 0;
        int moins4 = 0;
        int position = 0;

        String frase;

        frase = tec.nextLine() + " ";

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {

                if ((i - position) < 4) {

                    moins4++;
                    position = i + 1;

                } else if ((i - position) >= 4) {

                    plus4++;
                    position = i + 1;

                }

            }

        }
        System.out.println("mayores que 4 " + plus4 + " y " + moins4 + " menos de 4.");
        
        
    }
}
