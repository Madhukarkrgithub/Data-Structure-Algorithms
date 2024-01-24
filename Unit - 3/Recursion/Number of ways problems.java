import java.util.*;
class Main{
    public static int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else if (n == 2) {
            return 2; 
        } else {
            return countWays(n - 1) + countWays(n - 2) + countWays(n - 3); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ways = countWays(n);
        System.out.println(ways);
    }
}
