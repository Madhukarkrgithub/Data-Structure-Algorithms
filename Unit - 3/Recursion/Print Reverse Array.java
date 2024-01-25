import java.util.*;
class Main{
    public static void printArray(int[]arr ,int index){
        if(index>=arr.length){
            return;
        }
        printArray(arr,index+1);
        System.out.println(arr[index]);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr,0);
    }
}
