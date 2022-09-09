import java.util.Scanner;
public class palindromoRecursivo {

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int quantifyOfNumbers = quantifyOfNumbers(number);
        int []digits = new int[quantifyOfNumbers];
        digits = digits(number,quantifyOfNumbers); 
        int rightNumber = digits[0];
        int leftNUmber = digits[digits.length -1];
        int k = 0;
        int l = -1;
        boolean isPalindrome = isPalindrome(digits,rightNumber,leftNUmber,quantifyOfNumbers,k,l);
        if(isPalindrome == true){
            System.out.println("this is a palindrome");
        
        }else{
            System.out.println("this is not a palindrom");
        } 

   
    
    }public static int quantifyOfNumbers(int number){
        int i = 0;
        while( number > 0){
            number = number / 10;
            i++;
        }
        return i;
    }

    public static int[] digits(int number, int quantifyOfNumbers){
        int [] digits = new int[quantifyOfNumbers];
        int digit;
        for(int i = quantifyOfNumbers -1; i > -1; i--){
            digit = number % 10;
            digits[i] = digit;
            number = number /10;
        }
        return digits;
    }
    
    
    
    
    
    
    
    
    public static boolean isPalindrome(int [] digits, int rightNumber, int leftNumber,int quantifyOfNumbers, int k, int l){

        if(quantifyOfNumbers % 2 ==0){
            
            if((l == quantifyOfNumbers / 2) && (rightNumber == leftNumber) ){//algo pra indicar que é o ultimo && (rightNumber == leftNumber)){
                return true;
            }
            if(leftNumber == rightNumber){
                
                return isPalindrome(digits,digits[0+k],digits[quantifyOfNumbers + l],quantifyOfNumbers,k + 1, l - 1);
            
            }else{
                return false;
            }


        }else{  
            if(k == l){
                return true;
            }
            if(leftNumber == rightNumber){
                return isPalindrome(digits, digits[0+k], digits[quantifyOfNumbers - l], quantifyOfNumbers, k + 1, l + 1 );
            }
            else{
                return false;
            }

        }
    }
}

 