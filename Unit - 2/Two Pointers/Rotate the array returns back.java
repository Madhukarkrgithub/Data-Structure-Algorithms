import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] narr = new int[n];
            k = k % n;
            for (int i = 0; i < n; i++) {
                narr[k] = arr[i];
                k = (k + 1) % n;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(narr[i] + " ");
            }
            System.out.println();
        }
    }
}
