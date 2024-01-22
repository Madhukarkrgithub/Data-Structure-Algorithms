import java.util.*;
class Main{
    public static int binarySearch(int []arr ,int k){
        int n = arr.length;
        int low = 0 , high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                return mid;
            }else if(k>arr[mid]){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = binarySearch(arr,k);
        if(ans == -1){
            System.out.println("-1");
        }else{
            System.out.println("1");
        }
    }
}
