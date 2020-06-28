import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number n and the program will calculate the sum of the squares of all digits 1 through n:");
        int n = kb.nextInt();
        System.out.println("The answer is "+squares(n));
    }

    // squares method
    public static int squares(int n){
        if(n==1){ // base case
            return 1;
        }
        if(n>1){ // general case
            return (n*n)+squares(n-1);
        }
        else{ // error case
            return -1;
        }
    }
}
