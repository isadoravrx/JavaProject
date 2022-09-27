import java.util.Scanner;
public class hanoiRecursivo{


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minimumOfPlays = minimumOfPlays(n);
        System.out.println(minimumOfPlays);
    }

    public static int minimumOfPlays(int n ){
        if(n == 1 ){
            return 1;
        }

        return ((2 * minimumOfPlays( n-1)) + 1); 
    }

}