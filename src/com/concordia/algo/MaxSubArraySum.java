package com.concordia.algo;

class MaxSubArraySum {
 public int maxSubArray(int[] nums) {
  if (nums.length == 0) {
   return 0;
  }

  int maxhere = nums[0], maxcont = 0;

  for (int i = 0; i < nums.length; i++) {

   maxcont += nums[i];
   if (nums[i] > maxcont) {
    maxcont = nums[i];
   }

   if (maxhere < maxcont) {
    maxhere = maxcont;
   }

   // System.out.println(maxcont);
  }

  return maxhere;
 }
}
