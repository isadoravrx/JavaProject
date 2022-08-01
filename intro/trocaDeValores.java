package intro;
import java.util.Scanner;
public class trocaDeValores {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a = sc. nextInt();
        double b = sc.nextInt();
        double tempB = b;
        b = a;
        a = tempB;
        System.out.printf("o novo valor de A é %.0f e o novo valor de B é %.0f", a , b);
        sc.close();
    }
}
