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
            int ans = numberOfStep(arr,0,0);
            System.out.println(ans);
        }
    }
    public static int numberOfStep(int []arr ,int ind ,int steps){
        if(ind ==arr.length){
            return steps;
        }
        if(steps == arr.length || ind<0|| ind>arr.length){
            return arr.length;
        }
        int option1 = numberOfStep(arr,ind+1,steps+1);
        int option2 = numberOfStep(arr,ind+arr[ind],steps+1);
        return Math.min(option1,option2);
    }
}
