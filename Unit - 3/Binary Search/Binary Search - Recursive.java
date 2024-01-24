import java.util.*;
class Main{
    public static int binarySearch(int []arr,int k,int low,int high){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==k){
            return mid;
        }else if(k>arr[mid]){
            return binarySearch(arr,k,mid+1,high);
        }else{
            return binarySearch(arr,k,low,mid-1);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = binarySearch(arr,k,0,n-1);
        if(ans == -1){
            System.out.println("-1");
        }else{
            System.out.println("1");
        }
    }
}
