package com.bramha.recurrsion;

public class SumOfNusingRecursion {

    public static void main(String[] args) {
        int[] nums = {1,2,-3,6};
        int n = nums.length;
        int i = 0;
        int sum  = getSum(i,n,nums);
        System.out.println(sum);
    }

    public static int getSum(int i,int n,int[] nums){
        if(i>=n){
            return 0;
        }
        return nums[i]+getSum(i+1,n,nums);
    }

}
