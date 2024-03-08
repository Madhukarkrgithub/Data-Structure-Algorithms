  public static void maximumInArray(int n, int arr[]){
      int max = arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    System.out.println(max);
  }
