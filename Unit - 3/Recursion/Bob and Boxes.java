import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ways = findWays(n);
        System.out.println(ways);
    }
    public static int findWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ways1 = findWays(n-1);
        int ways3 = (n>=3) ? findWays(n-3) :0;
        int ways5 = (n>=5) ? findWays(n-5) :0;
        return ways1 + ways3 + ways5;
    }
}
