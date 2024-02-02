import java.util.*;

class Main {
    public static int search(int[] arr, int M) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (arr[mid] < M) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int M = sc.nextInt();
            int result = search(arr, M);
            int index;

            if (result == -1) {
                index = 0;
            } else {
               index = result + 1;
            }

            System.out.println(index);

        }
    }
}
