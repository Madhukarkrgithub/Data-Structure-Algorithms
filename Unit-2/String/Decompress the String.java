public static void decompressTheString(String a){
    
     String res="";
     for(int i=0;i<a.length();i++){
         if(i%2!=0){
             String bag="";
             int n=a.charAt(i)-'0';
             for(int j=0;j<n;j++){
                 bag+=a.charAt(i-1);
             }
             res+=bag;
         }
     }
     
     System.out.println(res);
    
    
  }
