import java.util.*;
class Main{
    public static void runningSum(int []arr){
        int n = arr.length;
        int []ans = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            ans[i] = sum;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int []arr = new int [n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            runningSum(arr);
        }
    }
}
