package sextaLista;
import java.util.Scanner;
public class hipotenusa {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double catetoOne = sc.nextDouble(); double catetoTwo = sc. nextDouble();
        double hipotenusa= ValueOfHipotenusa(catetoOne,catetoTwo);
        System.out.println(hipotenusa);
    }
    public static double ValueOfHipotenusa(double catetoOne, double catetoTwo){
        double soma = Math.pow(catetoOne, 2) + Math.pow(catetoTwo, 2);
        double hipotenusa = Math.sqrt(soma);
        return hipotenusa;
    }
    
}
