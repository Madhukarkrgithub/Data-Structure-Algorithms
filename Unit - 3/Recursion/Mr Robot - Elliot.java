import java.util.*;
class Main{
    public static String solve(String str,int i,int j,String ans){
        if(i>j){
            return ans;
        }
        int mid = (i+j)/2;
        ans = ans + str.charAt(mid) + solve(str,i,mid-1,ans)+ solve(str,mid+1,j,ans);
        return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            System.out.println(solve(str,0,str.length()-1,""));
        }
    }
}
