import java.util.*;
class Main{
    public static void printString(String str, int index){
        if(index>=str.length()){
            return;
        }
        printString(str,index+1);
        System.out.println(str.charAt(index));
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        printString(str,0);
    }
}
