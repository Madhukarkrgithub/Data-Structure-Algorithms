import java.util.*;
class Main{
    public static void printOdd(int []arr,int index){
        if(index>=arr.length){
            return;
        }
        if(arr[index]%2 != 0){
            System.out.println(arr[index]);
        }
        printOdd(arr,index+1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printOdd(arr,0);
    }
}
