import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String[] corrreo = {
                "a222214743@unison.mx",
                "a222314743@uson.mx",
                "a222214743@gmail.com"
        };

        String Expresion = "^[a-zA-Z0-9._%+-]+@(unison\\.mx|uson\\.mx)$";
        Pattern pattern = Pattern.compile(Expresion);
        System.out.println("Expresiones Regulares Problema 4");
        System.out.println(" ");
        System.out.println(" ");
        for (String email : corrreo) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " Correo Válido");
            } else {
                System.out.println(email + " Correo no Válido");
            }
        }
    }
}





