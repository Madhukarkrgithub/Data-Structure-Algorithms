import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[n];
        generatePermutations(nums, result, current, used);
        for (List<Integer> permutation : result) {
            for (int num : permutation) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void generatePermutations(int[] nums, List<List<Integer>> result, List<Integer> current, boolean[] used) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            current.add(nums[i]);
            used[i] = true;
            generatePermutations(nums, result, current, used);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
