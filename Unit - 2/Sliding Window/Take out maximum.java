import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = 0;
        int currentSum = 0;
        for(int i=0;i<k;i++){
            currentSum += arr[i];
        }
        maxSum = currentSum;
        for(int i=k;i<n;i++){
            currentSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum ,currentSum);
        }
        System.out.println(maxSum);
    }
}
