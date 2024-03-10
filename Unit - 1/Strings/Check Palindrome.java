  public static void checkPalindrome(int n, String str){
      boolean palindrome = true;
     for(int i=0;i<n;i++){
         if(str.charAt(i) != str.charAt(n-i-1)){
             palindrome = false;
         }
     }
     if(palindrome){
         System.out.println("Yes");
     }else{
         System.out.println("No");
     }
  }
