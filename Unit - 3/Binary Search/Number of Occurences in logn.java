import java.util.*;
class Main{
    public static int lowerBond(int []arr, int k){
        int left = 0;
        int right = arr.length-1;
        int lowerBond = -1;
        while(left<=right){
            int mid = left+ (right-left)/2;
            if(arr[mid]==k){
                lowerBond = mid;
                right = mid -1;
                
            }else if(arr[mid]<k){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return lowerBond;
    }
    public static int upperBond(int []arr, int k){
        int left = 0;
        int right = arr.length-1;
        int lowerBond = -1;
        while(left<=right){
            int mid = left+ (right-left)/2;
            if(arr[mid]<=k){
                left = mid + 1;
            }else{
                lowerBond = mid;
                right = mid - 1;
            }
        }
        return lowerBond;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int lower = lowerBond(arr,k);
        int upper = upperBond(arr,k);
        int ans = upper - lower ;
        if(upper == -1){
            ans = n - lower ;
        }
        System.out.println(ans);
    }
}
