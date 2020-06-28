import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("The program will print the first m multiples of a positive integer n.");
        System.out.println("Enter value for m: ");
        int m = kb.nextInt();
        System.out.println("Enter value for n: ");
        int n = kb.nextInt();
        multiples(n,m);
    }

    // multiples method
    public static void multiples(int n, int m){
        if(n==0){ // base case
            return;
        }
        if(n>0){ // general case
            multiples(n-1,m);
            System.out.print(n*m+", ");
        }
    }
}
