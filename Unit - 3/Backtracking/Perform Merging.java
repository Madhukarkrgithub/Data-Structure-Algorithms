import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArr = mergeArrays(arr1, arr2, n);

        for (int num : mergedArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2, int n) {
        int[] mergedArr = new int[2*n];
        int i = 0, j = 0, k = 0;

        while (i < n && j < n) {
            if (arr1[i] <= arr2[j]) {
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            mergedArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            mergedArr[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArr;
    }
}
