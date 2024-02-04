/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PatronesAmpliacion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        String entrada = tec.nextLine();
        Pattern p = Pattern.compile("(.com|.es|.edu)");
        Matcher m = p.matcher(entrada);

        while (m.find()) {

            int a = m.start();
            int b = m.end();

            System.out.println("Dominio: " + entrada.substring(a + 1, b));

        }

    }

}
