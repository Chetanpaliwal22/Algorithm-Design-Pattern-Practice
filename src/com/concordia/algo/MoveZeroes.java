package com.concordia.algo;

class MoveZeroes {
 public void moveZeroes(int[] nums) {

  int i = 0, j = 0;

  while (i < nums.length && j < nums.length) {
   if (nums[j] == 0) {
    j++;
   } else {
    nums[i] = nums[j];
    i++;
    j++;
   }
  }

  while (i < nums.length) {
   nums[i] = 0;
   i++;
  }
  // return nums;
 }
}
