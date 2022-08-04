public int[] makeEnds(int[] nums) {
  int [] nev = {0,0};
  if(nums.length == 1){
    nev[0]= nums[0];
    nev[1]= nums[0];
    return nev;
  }
  if(nums.length == 2){
    return nums;
  }else{
    nev[0] = nums[0];
    nev[1] = nums[nums.length-1];
    return nev;
  }
}
