import java.util.Scanner;
public class digits{

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int number  = sc.nextInt();
        int tempNumber = number;
        int digit;
        int i =0;
        while(number > 0){

        number = number / 10;
        i++;

        }    

        int [] digits = new int [i];
        int j = 0;
        while(tempNumber > 0){
            
        digit = tempNumber % 10;
        tempNumber = tempNumber / 10;
        digits [i-1] = digit;
        i--;

        }
        System.out.println(digits);
        sc.close();
    }

}