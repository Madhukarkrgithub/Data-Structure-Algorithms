import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            int ans=findCandidates(arr,k);
            System.out.println(ans);
        }
    }
    
    public static int findCandidates(int[] scores,int k){
        int n=scores.length;
        int[] rank=new int[n];
        rank[n-1]=1;
        int temp=0;
        for(int i=n-2;i>=0;i--){
            if(scores[i]==scores[i+1]){
                rank[i]=rank[i+1];
                temp++;
            }else{
                rank[i]=rank[i+1]+1+temp;
                temp=0;
            }
        }
        int cutOfRank=0;
        for(int i=0;i<n;i++){
            if(rank[i]<=k){
                cutOfRank++;
            }
        }
        return cutOfRank;
    }
    
}
