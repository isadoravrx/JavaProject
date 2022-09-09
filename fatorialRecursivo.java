import java.util.Scanner;
public class fatorialRecursivo {
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int fatorialValue = factorial(n);
        System.out.println(fatorialValue);
    }
    public static int factorial(int n ){
        if(n ==0){
            return 1;
        }else{
            return (n * factorial(n -1));
        }
    }
}
