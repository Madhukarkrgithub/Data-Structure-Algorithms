import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char []arr = str.toCharArray();
        for(int i=0;i<str.length();i++){
            char ch = arr[i];
            if(ch =='?'){
                if(i==0){
                    if((arr.length==1) || arr[i+1] != 'a')arr[i] = 'a';
                }
                else if(i==arr.length-1){
                    if(arr[i-1] !='a')arr[i] ='a';
                }
                else{
                    if(arr[i-1] != 'a' && arr[i+1] != 'a')arr[i]='a';
                }
                if(arr[i]=='?')arr[i] ='b';
            }
        }
        String s = String.valueOf(arr);
        System.out.println(s);
    }
}
