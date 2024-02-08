import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int result = numberOfWay(n);
            System.out.println(result);
        }
    }
    public static int numberOfWay(int n){
        if(n<0){
            return 0;
        }else if(n==0){
            return 1;
        }else{
            return numberOfWay(n-1) +numberOfWay(n-2) +numberOfWay(n-5);
        }
    }
}
