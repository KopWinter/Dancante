import java.util.Scanner;
import java.util.Arrays;
/**
 * @author lavinia.winter@edu.pucrs.br
 * @author helio.strappazzon@edu.pucrs.br
 * @author schwartz.lucas@edu.pucrs.br
 */

public class Main {
    public static String dance(String frase) {
        int i = 0;
        char c;
        String f = "";
        String f1 = frase.toLowerCase();
        String f2 = frase.toUpperCase();
        while(i < frase.length()){
            c = frase.charAt(i);
            if(i%2==0 && !(" ".equals(c)))
            {
                c = f2.charAt(i);
                f += c;
            }
            else
            {
                f += f1.charAt(i);
            }
            i++;
        }
        return f;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String frase = sc.nextLine();
        String frased = "";
        frased = dance(frase);
        sc.close();

        System.out.println(frased);
    }
}