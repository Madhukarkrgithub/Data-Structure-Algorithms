  public static void evenCollection(int max,int min){
      int sum = 0;
    for(int i=min;i<=max;i++){
        if(i%2==0){
            sum = i+sum;
        }
    }
    System.out.println(sum);
  }
