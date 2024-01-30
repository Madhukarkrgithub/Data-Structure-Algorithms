import java.util.*;
class Main{
    public static void findPath(int [][]arr,int row,int col,int n,String path,ArrayList<String>list){
        if(col<0 || col >=n || row<0 || row>=n){
            return;
        }
        if(arr[row][col]==0){
            return;
        }
        if(row==n-1 && col==n-1){
            list.add(path);
            return;
        }
        int temp = arr[row][col];
        arr[row][col] = 0;
        findPath(arr,row+1,col,n,path+"D",list);
        findPath(arr,row,col-1,n,path+"L",list);
        findPath(arr,row,col+1,n,path+"R",list);
        findPath(arr,row-1,col,n,path+"U",list);
        arr[row][col] = temp;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<String>list = new ArrayList<>();
        findPath(arr,0,0,n,"",list);
        if(list.isEmpty()){
            System.out.println("-1");
        }else{
            for(String path : list){
                System.out.print(path+" ");
            }
        }
    }
}
 
