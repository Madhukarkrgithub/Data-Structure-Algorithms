import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int Q = sc.nextInt();
        int []arr2 = new int[Q];
        for(int i=0;i<Q;i++){
            arr2[i] = sc.nextInt();
        }
        for(int i=0;i<Q;i++){
            int power = arr2[i];
            int count = 0;
            int totalPower = 0;
            
            for(int j=0;j<n;j++){
                if(arr[j]<=power){
                    count++;
                    totalPower += arr[j];
                }
            }
            System.out.println(count+" "+totalPower);
        }
    }
}
