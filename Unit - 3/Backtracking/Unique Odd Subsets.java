import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int K = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(oddSubset(arr, 0, list, K) ? "True" : "False");
    }

    public static boolean oddSubset(int[] arr, int index, ArrayList<Integer> list, int K) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
            sum += list.get(i);
        }
        if(K ==set.size() && sum % 2==1){
            return true;
        }
        if (index == arr.length) {
            return false;
        }
        list.add(arr[index]);
        boolean includeCurr = oddSubset(arr, index + 1, list, K);
        list.remove(list.size() - 1);
        boolean excludeCurr = oddSubset(arr, index + 1, list, K);
        return (includeCurr || excludeCurr);
    }
}
