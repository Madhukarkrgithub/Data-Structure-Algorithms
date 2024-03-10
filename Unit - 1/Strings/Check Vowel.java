  public static void checkVowel(int n, String str){
      boolean vowel = false;
      for(int i=0;i<n;i++){
          char ch = str.charAt(i);
          if(ch == 'a' || ch=='e' || ch=='i' || ch=='u'|| ch=='o'){
              vowel = true;
              break;
          }
      }
      System.out.println(vowel);
  }
