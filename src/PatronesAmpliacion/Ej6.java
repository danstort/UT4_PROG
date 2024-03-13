package PatronesAmpliacion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej6 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Dominios dominio = Dominios.es;
        
        String esdominio=".es";

        Pattern p = Pattern.compile("\\.[a-zA-z]{2,3}");
        Matcher m = p.matcher(esdominio);
        if (m.matches()) {

            System.out.println("Se cumple");
        } else {
            System.out.println("No se cumple");
        }

    }

}

enum Dominios {
    es,
    com,
    edu,
    org;
}
