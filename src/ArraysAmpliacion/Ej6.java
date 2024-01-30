/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArraysAmpliacion;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int v[] = new int[12];

        for (int i = 0; i < v.length; i++) {

            v[i] = tec.nextInt();

        }

        for (int i = v.length-1; i >= 0; i--) {

            System.out.print(v[i]+" ");

        }
    }

}
