package com.poleszak;

public class Solution {
    private static final int MAX_VAL = 200_000;
    private static final long MOD = 1_000_000_007L;

    public static void main(String[] args) {
        var cos = countSpecialTriplets(new int[] {8,4,2,8,4});

        System.out.println(cos);
    }

    public static int countSpecialTriplets(int[] nums) {
        int n = nums.length;
        int[] right = new int[MAX_VAL + 1];
        for (int v : nums) {
            right[v]++;
        }
        int[] left = new int[MAX_VAL + 1];
        long ans = 0;
        for (int j = 0; j < n; j++) {
            int mid = nums[j];
            right[mid]--;
            int target = mid * 2;
            if (target <= MAX_VAL) {
                long countLeft = left[target];
                long countRight = right[target];

                long add = (countLeft * countRight) % MOD;
                ans += add;
                if (ans >= MOD) ans -= MOD;
            }
            left[mid]++;
        }

        return (int) ans;
    }

}
