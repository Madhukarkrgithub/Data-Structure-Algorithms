  public static void charAtOddPos(int n, String str){
    for(int i=0;i<n;i++){
        if(i%2 != 0){
            System.out.println(str.charAt(i));
        }
    }
  }
