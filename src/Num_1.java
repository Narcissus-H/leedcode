import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class Num_1 {
    public static void main(String[] args) {
        int[] nums = {10, 110, -90, 10, 25, 19};
        int target = 20;
        System.out.println(Arrays.toString(new Num_1().new Solution2().twoSum(nums,target)));

//        for (int i:new Num_1().new Solution1().twoSum(nums,target)
//             ) {
//            System.out.println(i);;
//        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(new Num_1().new Solution1().twoSum(nums,target)));
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(0,20);
        hashMap.put(2,15);
        hashMap.put(2,29);
        hashMap.put(3,20);
        System.out.println(hashMap.toString());
//
//        System.out.println(hashMap.toString() + hashMap.containsValue(20));
    }
    class Solution2{
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if(hashMap.containsKey(target - nums[i])){
                    return new int[]{hashMap.get(target - nums[i]),i};
                }
                hashMap.put(nums[i], i);
            }
            return null;
        }
    }
    class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            int length = nums.length;
            int[] arr = new int[2];
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (nums[i] + nums[j] == target) {
                        arr[0] = i;
                        arr[1] = j;
                        return arr;
                    }
                }
            }
            return null;
        }
    }


}

