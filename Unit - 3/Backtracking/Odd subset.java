import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int result = countSubsets(arr, 0, 0, false);
        System.out.println(result);
    }

    public static int countSubsets(int[] arr, int index, int currentSum, boolean isSumOdd) {
        if (index == arr.length) {
            return isSumOdd ? 1 : 0;
        }

        // Include the current element in the subset and move to the next index.
        int countWithCurrent = countSubsets(arr, index + 1, currentSum + arr[index], !isSumOdd);

        // Exclude the current element from the subset and move to the next index.
        int countWithoutCurrent = countSubsets(arr, index + 1, currentSum, isSumOdd);

        // Return the sum of subsets that include the current element and those that exclude it.
        return countWithCurrent + countWithoutCurrent;
    }
}
