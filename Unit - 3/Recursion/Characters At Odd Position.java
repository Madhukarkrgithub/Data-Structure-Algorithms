import java.util.*;
class Main{
    public static void printOddPos(String str,int index){
        if(index>=str.length()){
            return;
        }
        if(index %2 != 0){
            System.out.println(str.charAt(index));
        }
        printOddPos(str,index+1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        printOddPos(str,0);
    }
}
