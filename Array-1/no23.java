public boolean no23(int[] nums) {
  for(Integer a : nums){
    if(a == 2 || a == 3){
      return false;
    }
  }
  return true;
}
