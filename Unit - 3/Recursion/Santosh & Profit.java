import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int ways = findWays(n);
            System.out.println(ways);
        }
    }
    public static int findWays(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int ways1 = findWays(n-4);
        int ways2 = findWays(n-8);
        return ways1 + ways2;
    }
}
