import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and
loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.
Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]
 */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 3, 4, 2, 6, 7})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
        System.out.println("---");
        System.out.println(Arrays.toString(findErrorNums2(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums2(new int[]{1, 2, 3, 4, 2, 6, 7})));
        System.out.println(Arrays.toString(findErrorNums2(new int[]{1, 1})));
        System.out.println("---");
        System.out.println(Arrays.toString(findErrorNums3(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(findErrorNums3(new int[]{1, 2, 3, 4, 2, 6, 7})));
        System.out.println(Arrays.toString(findErrorNums3(new int[]{1, 1})));
    }
// Метод грубой силы (brute force)
        private static int[] findErrorNums(int[] nums) {
            int dup = -1, missing = -1;
            for (int i = 1; i <= nums.length; i++) {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == i) {
                        count++;
                    }
                }
                if (count == 2) {
                    dup = i;
                } else if (count == 0) {
                    missing = i;
                }
                if (dup > 0 && missing > 0) {
                    break;
                }
            }
            return new int[] {dup, missing};
        }
//  Используя map

    // Используя map
    private static int[] findErrorNums2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int dup = -1, missing = -1;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        // 1, 2, 3, 4
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    dup = i;
                }
            } else {
                missing = i;
            }
        }

        return new int[] {dup, missing};
    }
    // решение со сложностью 0(n)
    private static int[] findErrorNums3(int[] nums) {
        int dup = -1, missing = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1)) {
                dup = nums[i];
                missing = i + 1;
                break;
            }
        }
        return new int[]{dup, missing};
    }

}