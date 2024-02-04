import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        int cost = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int curr = arr[i];
            cost = Math.min(cost,curr);
            sum += cost;
        }
        System.out.println(sum);
    }
}
