public int[] reverse3(int[] nums) {
  int a = nums[0];
  int b = nums[2];
  nums[2] = a;
  nums[0] = b;
  return nums;
}
