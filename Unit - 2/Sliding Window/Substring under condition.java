import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        int n = str.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
