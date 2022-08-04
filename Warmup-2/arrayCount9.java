public int arrayCount9(int[] nums) {
  int count = 0;
  for(Integer x : nums){
    if(x.intValue() == 9){
      count++;
    }
  }
  return count;
}