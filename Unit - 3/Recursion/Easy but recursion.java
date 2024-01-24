import java.util.*;
class Main{
    public static int sumEle(int []arr,int index){
        if(index>=arr.length){
            return 0;
        }
        int ans = arr[index] + sumEle(arr,index+1);
        return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int ans = sumEle(arr,0);
            System.out.println(ans);
        }
    }
}
