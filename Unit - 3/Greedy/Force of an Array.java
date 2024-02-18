import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while(t-->0) {
            int A0 = sc.nextInt(); 
            int A1 = sc.nextInt(); 
            int N = sc.nextInt(); 
            int MOD = sc.nextInt(); 

            int[] A = new int[N];
            A[0] = A0;
            A[1] = A1;
            for (int i = 2; i < N; i++) {
                A[i] = (A[i - 1] + A[i - 2]) % MOD;
            }

            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : A) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            long maxForce = 0;
            for (int frequency : frequencyMap.values()) {
                maxForce += (long) frequency * frequency;
            }

            System.out.println(maxForce);
        }
    }
}
