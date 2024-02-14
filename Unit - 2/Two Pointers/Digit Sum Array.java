import java.util.Scanner;

class Main {
    public static void sumOfDigit(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int rem = 0;
            int sum = 0;
            int num = arr[i];
            while (num > 0) {
                rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
            ans[i] = sum;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sumOfDigit(arr);
        }
    }
}
