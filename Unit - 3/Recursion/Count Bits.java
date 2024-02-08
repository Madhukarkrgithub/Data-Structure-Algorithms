import java.util.*;
class Main{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int []ans = countOnes(n);
            for(int j=0;j<=n;j++){
                System.out.print(ans[j]+" ");
            }
            System.out.println();
        }
    }
    public static int[] countOnes(int n){
        int []result = new int [n+1];
        for(int i=0;i<=n;i++){
            result[i] = counts(i);
        }
        return result;
    }
    public static int counts(int n){
        int count = 0;
        while(n>0){
            count += n%2;;
            n /=2;
        }
        return count;
    }
}
