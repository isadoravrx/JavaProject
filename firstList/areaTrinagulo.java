package firstList;
import java.util.Scanner;
public class areaTrinagulo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double sizeA = sc.nextDouble(); double sizeB = sc.nextDouble(); double sizeC = sc.nextDouble();
        double t = valueOfT(sizeA, sizeB,sizeC);
        double squareRoot = valueOfSquareRoot(t,sizeA,sizeB,sizeC);
        System.out.printf("Área do triâmgulo = %f",squareRoot);
    }
    
    public static double valueOfT(double A, double B, double C){
        double t = (A + B + C)/ 2;
        return t;
    }public static double valueOfSquareRoot(double t, double A, double B, double C){
        double subtractionOne = t - A;
        double subtractionTwo = t - B;
        double subtractionThree = t - C;
        double multiplication = t * subtractionOne * subtractionTwo * subtractionThree;
        double squareRoot = Math.sqrt(multiplication);
        return squareRoot;
    }
}
