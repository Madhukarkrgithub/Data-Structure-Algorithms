import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            Arrays.sort(arr);
            int i = 0;
            int j = n-1;
            int num = -1;
            while(i<j){
                int sum = arr[i] + arr[j];
                if(sum<k){
                    num = Math.max(num,sum);
                    i++;
                }else{
                    j--;
                }
            }
            System.out.println(num);
        }
    }
}
