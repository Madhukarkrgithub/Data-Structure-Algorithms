import java.util.*;
class Main{
    public static String binaryRep(int n){
        if (n == 0 || n == 1) {
            return Integer.toString(n); 
        }

        int rem = n % 2;
        String binary = binaryRep(n / 2); 
        return binary + Integer.toString(rem);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(binaryRep(n));
        }
    }
}
