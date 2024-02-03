import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        int count =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum<=k){
                count++;
            }
        }
        System.out.println(count);
    }
}
