import java.util.Arrays;

public class Tester {

 public static void main(String[] args){

     TwoSum ts = new TwoSum();
     int[] nums = new int[]{2,1,4,3,6};
     int target = 5;
     System.out.println("Given the array " + Arrays.toString(nums) + " and the target " + target );
     System.out.println("The answer is " + Arrays.toString(ts.twoSum(nums, target)));
 }


}
