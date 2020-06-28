import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number n and the program will print it vertically:");
        int n = kb.nextInt();
        System.out.println("Vertical:");
        writeVertical(n);
    }

    // write vertical method
    public static void writeVertical(int n){
        String nStr = Integer.toString(n);

        if(nStr.length()==0){ // base case
            return;
        }
        if(nStr.length()>0){ // general case
            System.out.println(nStr.charAt(0));
            nStr = nStr.substring(1);
            if(nStr.equals("")){ // if no more digits
                return;
            }
            n = Integer.parseInt(nStr);
            writeVertical(n);
        }
    }
}
