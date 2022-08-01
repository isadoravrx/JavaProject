package intro;
import java.util.Scanner;
public class areaDoCirculo{
   
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextInt();
        double comprimento, area, volume;
        comprimento = 2 * Math.PI * raio;
        area = Math.PI * (Math.pow(raio,2));
        volume = ((3 * Math.PI * (Math.pow(raio, 3)))/4);
        System.out.printf("%f %f %f",comprimento,area,volume);

        sc.close();
    }
}