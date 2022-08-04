public int[] swapEnds(int[] nums) {
  if(nums.length == 1) {
    return nums;
  }else{
    int a = nums[0];
    int b = nums[nums.length-1];
    
    nums[0] = b;
    nums[nums.length-1] = a;
    
    return nums;
  }
}
