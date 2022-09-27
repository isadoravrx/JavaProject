public class hanoiRecursivoComPassos {
    
    public static void main(String[]args){
        int [] A = {3,1,2,3};
        int n = valueOfn(A);
        int o = valueOfo(A);
        int d = valueOfd(A);
        int a = valueOfa(A);
        steps(n, o, d, a);
    }

    public static void steps(int n, int o, int d , int a){
         if(n == 1){
            System.out.printf(" %d <- %d\n", d, o );
            return;
         }

         steps(n - 1, o, a, d);
         steps( 1 , o , d ,a );
         steps(n - 1, a, d, o);
        
    }

    public static int valueOfn(int []A){
        int n  = A[0];
        return n;
    }

    public static int valueOfo(int []A){
        int o  = A[1];
        return o;
    }

    public static int valueOfd(int []A){
        int d  = A[2];
        return d;
    }

    public static int valueOfa(int []A){
        int a  = A[3];
        return a;
    }
}
