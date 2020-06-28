import java.util.Scanner;

public class Exercise7 {
    static long moves = 0; // used to track the number of moves
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the value of 'n' to solve for towers of hanoi:");
        int n = kb.nextInt();
        long startTime, endTime, executionTime;
        startTime = System.currentTimeMillis();
        System.out.println("Number of moves: "+solve(n));
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("The execution time: "+executionTime);
    }

    // solve towers of hanoi method 1
    public static long solve(int n){
        if(n==1){
            return 1;
        }
        else{
            long movesSub1 = solve(n-1);
            long movesSub2 = solve(n-1);
            moves = movesSub1+movesSub2+1;
            return moves;
        }
    }

    // solve towers of hanoi method 2
    // implemented and modified the method used in stackoverflow: https://stackoverflow.com/questions/37867230/recursively-assert-number-of-moves-in-tower-of-hanoi
    public static long solve(int n, int start, int end, int tmp){
        if(n==1){ // base case
            System.out.println("Move disk "+n+" from peg "+start+" to peg "+end);
            return 1;
        }
        else{ // general case
            long movesSub1 = solve(n-1,start,tmp,end);
            System.out.println("Move disk "+n+" from peg "+start+" to peg "+end);
            long movesSub2 = solve(n-1,tmp,end,start);
            moves = movesSub1+movesSub2+1;
            return moves;
        }
    }
}
