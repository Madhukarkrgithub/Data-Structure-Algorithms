import java.util.*;

class Main {
    public static int platforms(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 1;
        int i = 1;
        int j = 0;
        int ans = 1;
        while (i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        int[] arr = new int[n];
        int[] dep = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = timeToMinutes(sc.next()); 
        }
        for (int i = 0; i < n; i++) {
            dep[i] = timeToMinutes(sc.next()); 
        }

        int result = platforms(arr, dep);
        System.out.println(result); 
    }

    public static int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int result = Integer.parseInt(parts[0]) * 100 + Integer.parseInt(parts[1]);
        return result;
    }
}
