import java.util.*;
class Main{
    public static int count(String str,int index){
        if(index>=str.length()){
            return 0;
        }
        int ans = 1+count(str,index+1);
        return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int ans = count(st,0);
        System.out.println(ans);
    }
}
