package JAVA_DSA;

public class targetsum {
    int count = 0;

    public  int findTargetSumWays(int[] nums, int target) {
        compute(nums, 0,0, target);
        return count;
    }
    public  void compute(int[] nums , int sum , int index, int target ){
        // Termination Case
        if(index == nums.length){
            if(sum == target){
                count++;
            }
        }
        else{
            // Include
            compute(nums, sum + nums[index], index + 1, target);
            // Not Include
            compute(nums, sum - nums[index], index + 1, target);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;

        targetsum solution = new targetsum();
        int result = solution.findTargetSumWays(nums, target);

        System.out.println("Number of ways to achieve target sum: " + result);
    }

}
