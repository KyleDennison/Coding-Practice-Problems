public class TwoSum {

    public TwoSum(){}
    //Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.

    public int[] twoSum(int[] nums, int target) {
        boolean stop = true;
        int[] answer = new int[2];
        int len = nums.length;
        for(int i = 0; i < len; i++  ){
            for(int j = 0; j < len; j++){
                if(stop){
                    if( (i != j) && (nums[i] + nums[j]) == target){
                        answer[0] = i;
                        answer[1] = j;
                        stop = false;
                    }
                }
            }
        }
        return answer;
    }
}
