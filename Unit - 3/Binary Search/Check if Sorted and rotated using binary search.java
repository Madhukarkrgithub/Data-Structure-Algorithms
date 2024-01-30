import java.util.*;
class Main{
    public static boolean check(int []arr,int pivot,int n){
        for(int i=1;i<pivot;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        for(int i=pivot+1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static int pivot(int n,int []arr){
        int left = 0;
        int right = n-1;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid]>arr[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(arr[0]<arr[n-1]){
            System.out.println("NO");
            return;
        }
        int pivot = pivot(n,arr);
        if(check(arr,pivot,n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
