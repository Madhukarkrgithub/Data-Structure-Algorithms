import java.util.*;
class Main{
    public static boolean canFulfill(int[]arr ,int k, int capacity){
        int need = 1;
        int currCapacity = 0;
        for(int size : arr){
            if(size>capacity){
                return false;
            }
            if(currCapacity +size >capacity){
                need++;
                currCapacity = 0;
            }
            currCapacity += size;
        }
        return need <= k;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int []arr = new int[n];
            int capacity = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                capacity = Math.max(capacity,arr[i]);
            }
            int low = capacity, high = Integer.MAX_VALUE;
            while(low<high){
                int mid = low +(high-low)/2;
                if(canFulfill(arr,k,mid)){
                    high = mid;
                }else{
                    low = mid+1;
                }
            }
            System.out.println(low);
        }
    }
}
