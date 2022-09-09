public class palindromoRecursivo{
    public static void main(String[]args){
        int [] number = {0, 2 , 3 , 2 , 0};
        int rightIndex = 0;
        int leftIndex = number.length - 1;
        boolean isPalindrome = isPalindrome(number,rightIndex,leftIndex);
        if(isPalindrome == true){
            System.out.println("é um palíndromo");
        }else{
            System.out.println("não é um palíndromo");
        }

       
    }

    public static boolean isPalindrome(int [] number, int rightIndex, int leftIndex){
        if(rightIndex >= leftIndex){
            return true;
        }if(number[rightIndex] == number[leftIndex]){
            return isPalindrome(number, rightIndex + 1, leftIndex -1);
        }else{
            return false;
        }
    }
}