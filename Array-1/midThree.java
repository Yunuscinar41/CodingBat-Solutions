public int[] midThree(int[] nums) {
  int n1 = nums[nums.length/2 -1];
  int n2 = nums[nums.length/2];
  int n3 = nums[nums.length/2 +1];
  int [] array = {n1,n2,n3};
  return array;
}
