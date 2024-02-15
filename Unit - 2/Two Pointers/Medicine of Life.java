import java.util.*;
class Main{
    public static boolean find(int []arr,int k){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int sum = arr[low] + arr[high];
            if(sum == k){
                return true;
            }else if(sum<k){
                low++;
            }else{
                high--;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int []arr = new int [n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean ans = find(arr,k);
            if(ans){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }
        }
    }
}
