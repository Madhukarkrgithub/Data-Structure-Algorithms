  public static void vowelAndConsonantCount(int n, String str){
      int vowel = 0;
      int cons = 0;
      for(int i=0;i<n;i++){
          char ch = str.charAt(i);
          if( ch =='a' || ch =='e' || ch =='i' || ch=='o' ||ch =='u'){
              vowel++;
          }else{
              cons++;
          }
      }
      System.out.println(vowel+" "+ cons);
  }
