import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    //Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
    // Find all unique triplets in the array which gives the sum of zero.
    //The solution set must not contain duplicate triplets.

    ThreeSum(){

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        int size = nums.length;
        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;
        for(int i = pos1; i <= size-3; i++){
            pos2 = pos1 + 1;
            for(int j = pos2; j <= size-2; j++){
                pos3 = pos2+1;
                for(int k =pos3; k <= size-1; k++){
                    if(i != j && j != k && i != k){
                        int total = nums[i] + nums[j] + nums[k];

                        if(total == 0){
                            boolean dub = true;
                            for(List<Integer> x : solution){
                                if(x.contains(nums[i]) && x.contains(nums[j]) && x.contains(nums[k])){
                                    dub = false;
                                }
                            }
                            if(dub){
                                List<Integer> found = new ArrayList<Integer>();
                                found.add(nums[i]);
                                found.add(nums[j]);
                                found.add(nums[k]);
                                solution.add(found);
                            }
                        }
                    }
                }
            }


        }
        return solution;

    }
}
