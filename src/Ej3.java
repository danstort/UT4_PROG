
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        String p1;
        int c1 = 0;
        int w1 = 0;

        p1 = tec.nextLine() + " ";  //Introduzco un espacio para cuando sea una sola palabra no se produzca un error en el for.

        int n = 0;

        for (int i = 0; n == 0; i++) {

            if (p1.charAt(i) == ' ') {
                n = i + 1;  //Pongo +1 para que no me coja un espacio en la primera palabra.
            }
        }

        String fWord = p1.substring(0, n);
        fWord=fWord.replace(" ", "");

        if (fWord.length() == p1.length()) {
            System.out.println(fWord);
        } else {
            String lWord = p1.substring(n);

            System.out.println(lWord + fWord);
        }

    }

}
