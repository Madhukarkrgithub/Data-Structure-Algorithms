public static void solve(int N, String str){
       for(int i=0;i<N;i++){
           for(int j=i+1;j<=N;j++){
               System.out.println(str.substring(i,j));
           }
       }
  }
