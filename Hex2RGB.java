import java.util.Scanner;
import java.util.InputMismatchException;

public class Hex2RGB {
    public static void main(String[] args) {
        String Banner = """
88  88 888888 Yb  dP oP"Yb. 88""Yb  dP""b8 88""Yb 
88  88 88__    YbdP  "' dP' 88__dP dP   `" 88__dP 
888888 88""    dPYb    dP'  88"Yb  Yb  "88 88""Yb 
88  88 888888 dP  Yb .d8888 88  Yb  YboodP 88oodP """;

        String[] quotes = null; // Digo que lo definire mas tarde
        calculator calc = new calculator();
        System.out.println("\n"+Banner);
        System.out.println("\n1. English / 2. Español");
        try(Scanner key = new Scanner(System.in);) {
            int lang = key.nextInt();
            if (lang == 1) {
                quotes = new String[]{"\nGive me the first character of the color",
                    "\nNow, gimme the second", "\nThird one right away", "\nfollowing with the fourth one",
                    "\nDamn, that's a lot of numbers. Just give me the 5th one already.", 
                    "\nFinally...\ngimme the last number to just end up with this\n", "You have written an incorrect character", 
                    "Cannot use negative numbers", "Red: ", "Green: ", "Blue: ",
                };
            }
            else if (lang == 2) {
                quotes = new String[]{"\nDame el primer numero del color", "\nAhora el segundo",
                    "\nEl tercero de inmediato", "\nProsiguiendo con el cuarto", "\nDios, demasiados numeros. Dame el quinto de una vez",
                    "\nFinalmente...\nDame el ultimo numero para acabar ya con esto de una vez por todas\n", "Haz escrito un caracter incorrecto",
                    "No puedes usar numeros negativos", "Rojo: ", "Verde: ", "Azul: "
                };
            }
            else {
                System.out.println("You did not choose the correct languague / No elejiste el idioma correcto");
                System.exit(-1);
            }
            System.out.println(quotes[0]); char prenum1 = key.next().charAt(0);
            System.out.println(quotes[1]); char prenum2 = key.next().charAt(0);
            System.out.println(quotes[2]); char prenum3 = key.next().charAt(0);
            System.out.println(quotes[3]); char prenum4 = key.next().charAt(0);
            System.out.println(quotes[4]); char prenum5 = key.next().charAt(0);
            System.out.println(quotes[5]); char prenum6 = key.next().charAt(0);

            char[] hex = new char[]{prenum1, prenum2, prenum3, prenum4, prenum5, prenum6};
            int[] posthex = new int[]{0, 0, 0, 0, 0, 0};

            for (int i = 0; i != hex.length; i++) {
                posthex[i] = calc.check(hex[i], quotes);
            }

            calc.rgb_calc(posthex, quotes);
        }
        catch (InputMismatchException e) { // ValueErrors
            System.out.println(quotes[6]);
        }
    }
}

class calculator {
    public calculator(){}
    public int check(char prenum, String[] quotes) {
        prenum = Character.toUpperCase(prenum); // Pone la letra del char en mayuscula
        if (prenum == 'A') return 10; // Este tipo de if solo ejecuta 1 orden si se cumplen
        if (prenum == 'B') return 11;
        if (prenum == 'C') return 12;
        if (prenum == 'D') return 13;
        if (prenum == 'E') return 14;
        if (prenum == 'F') return 15;

        if (prenum >= '0' && prenum <= '9') return prenum - '0'; // Debes poner comillas a los numeros para que puedan tratar con chars
        
        System.out.println(quotes[6]);
        System.exit(-1);
        return 0;
    }
    public void rgb_calc(int[] hex, String[] quotes) {
        int r = (hex[0] * 16) + hex[1];
        int g = (hex[2] * 16) + hex[3];
        int b = (hex[4] * 16) + hex[5];
        System.out.println(quotes[8] + r);
        System.out.println(quotes[9] + g);
        System.out.println(quotes[10] + b);
    }
}
