import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number to count down from (in odds/evens): ");
        int n = kb.nextInt();
        countDown(n);
    }

    // count down method
    public static void countDown(int n){
        if(n==0 || n==-1){
            System.out.print("BlastOff!");
        }
        if(n>0){
            System.out.print(n+"\t");
            countDown(n-2);
        }
    }
}
