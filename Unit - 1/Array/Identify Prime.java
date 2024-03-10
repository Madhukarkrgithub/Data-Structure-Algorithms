  public static void identifyPrime(int num){
      boolean prime = true;
       if(num<=1){
           prime = false;
       }
       for(int i=2;i*i<=num;i++){
           if(num%i == 0){
               prime = false;
           }
       }
       if(prime){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
  }
