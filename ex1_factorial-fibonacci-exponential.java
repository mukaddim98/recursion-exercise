public class Exercise1 {
    public static void main(String[] args){
        System.out.println("Factorial of 9 is "+factorial(9));
        System.out.println("The 10th fibonacci number is "+fib(10));
        System.out.println("2 to the power of 5 is "+power(2,5));
    }

    // factorial method
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        if(n > 0){
            return (n*factorial(n-1));
        }
        else{
            return -1;
        }
    }

    // fibonacci method
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n>1){
            return fib(n-1) + fib(n-2);
        }
        else {
            return -1;
        }
    }

    // exponential series
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(n>0){
            return power(x, n-1)*x;
        }
        else{
            return -1;
        }
    }

}
