package JAVA_DSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        // Termination case
        if (nums.length == 0) {
            permutations.add(new ArrayList<>());
            return permutations;
        }
        // Get the first element
        int firstNum = nums[0];
        // Generate permutations for the remaining elements
        List<List<Integer>> result = permute(Arrays.copyOfRange(nums, 1, nums.length));

        // Traverse the result
        for (List<Integer> perm : result) {
            for (int i = 0; i <= perm.size(); i++) {
                List<Integer> newPerm = new ArrayList<>(perm);
                newPerm.add(i, firstNum);
                permutations.add(newPerm);
            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }
}
