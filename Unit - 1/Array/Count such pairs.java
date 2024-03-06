public static void countSuchPairs(int n,int target, int[] arr){
  
    int count = 0;
    
    for(int i=0; i<n; i++)
    {
        for(int j=i+1; j<n; j++)
        {
            if(arr[i]+arr[j]==target)
            {
                count++;
            }
        }
    }
    System.out.println(count);
  }
