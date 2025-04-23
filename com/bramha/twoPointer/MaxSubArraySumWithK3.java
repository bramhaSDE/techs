package com.bramha.twoPointer;

public class MaxSubArraySumWithK3 {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6};

        int l = 0, r = 0, n = a.length;
        int ans = 0;
        int temp = 0;
        int k = 3;

        for (r = 0; r < n; r++) {
            temp += a[r];
            if (r - l == k) {
                temp -= a[l];
                l++;
            }
            if(r-l+1==k)
                ans = Math.max(ans, temp);
        }
        System.out.println(ans);
    }



}
