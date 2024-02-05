import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            int lift = 1;
            for(int i=1;i<str.length();i++){
                if(str.charAt(i) != str.charAt(i-1)){
                    lift++;
                }
            }
            System.out.println(lift);
        }
    }
}
