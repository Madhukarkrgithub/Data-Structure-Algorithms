import java.util.*;
class Main {
    public static String compare(int[] boysHeights, int[] girlsHeights){
        Arrays.sort(boysHeights);
        Arrays.sort(girlsHeights);

        for (int i = 0; i < boysHeights.length; i++) {
            if ( boysHeights[i] <= girlsHeights[i]){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int[] boysHeights = new int[M];
            int[] girlsHeights = new int[N];

            for (int i = 0; i < M; i++) {
                boysHeights[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                girlsHeights[i] = sc.nextInt();
            }

            String result = compare(boysHeights, girlsHeights);
            System.out.println(result);
        }
    }
}
