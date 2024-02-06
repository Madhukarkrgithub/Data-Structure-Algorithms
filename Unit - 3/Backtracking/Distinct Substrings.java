import java.util.*;
class Main{
    public static int countSubstrings(String s) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                substrings.add(s.substring(i, j));
            }
        }
        return substrings.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            int result = countSubstrings(s);
            System.out.println(result);
        }
    }
}
