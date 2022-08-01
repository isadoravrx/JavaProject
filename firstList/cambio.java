package firstList;
import java.util.Scanner;
public class cambio {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         double economias= sc.nextDouble(); // valor em reais 
         double cotDolar= sc.nextDouble();
         double cotLibra= sc.nextDouble();
         double cotEuro= sc.nextDouble();
         double dolarValue = economias / cotDolar;
         double libraValue = economias / cotLibra;
         double euroValue = economias / cotEuro;
         System.out.printf("Economias em dolar: %f\nEconomias em libras: %f\nEconomias em euro: %f\n",dolarValue, libraValue,euroValue);
    
         sc.close();
    }
}
