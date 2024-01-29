import java.util.*;
class Main{
    public static int minimum(int []arr){
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[mid]){
                ans = Math.min(ans,arr[low]);
                low = mid+1;
            }else{
                ans = Math.min(ans,arr[mid]);
                high = mid -1;
            }
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = minimum(arr);
        System.out.println(result);
    }
}
