import java.util.*;
class Main{
    public static int power(int a , int b){
        if(b==0){
            return 1;
        }
        if(b %2 ==0){
            int halfPower = power(a,b/2);
            return halfPower*halfPower;
        }else{
            int halfPower = power(a,(b-1)/2);
            return halfPower * halfPower* a;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(power(a,b));
    }
}
