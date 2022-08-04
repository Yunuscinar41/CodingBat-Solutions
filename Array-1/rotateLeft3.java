public int[] rotateLeft3(int[] nums) {
   int a = nums[0];
   int b = nums[1];
   int c = nums[2];
   nums[0] = b;
   nums[1] = c;
   nums[2] = a;
   return nums;
}
