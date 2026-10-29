class Solution {
public int thirdMax(int[] nums) {
int max = Integer.MIN_VALUE;
int secmax = Integer.MIN_VALUE;
int thrmax = Integer.MIN_VALUE;


    boolean first = false;
    boolean second = false;
    boolean third = false;

    for (int i = 0; i < nums.length; i++) {
        if (!first || nums[i] > max) {
            max = nums[i];
            first = true;
        }
    }

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != max && (!second || nums[i] > secmax)) {
            secmax = nums[i];
            second = true;
        }
    }

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != max && nums[i] != secmax
                && (!third || nums[i] > thrmax)) {
            thrmax = nums[i];
            third = true;
        }
    }

    if (third) {
        return thrmax;
    } else {
        return max;
    }
}


}
