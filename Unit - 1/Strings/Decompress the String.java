  public static void solve(String S){
      StringBuilder result = new StringBuilder();
      for(int i=0;i<S.length();i++){
          char ch = S.charAt(i);
          
        // Check if the current character is a digit
          if(Character.isDigit(ch)){
              
            // Get the integer value of the digit
              int count = Character.getNumericValue(ch);
              
    // Append the previous character to the result count times
              for(int j=0;j<count;j++){
                  result.append(S.charAt(i-1));
              }
          }
      }
      System.out.println(result.toString());
  }
