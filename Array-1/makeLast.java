public int[] makeLast(int[] nums) {
  int a = 2* (nums.length);
  int [] nev = new int [a];
  int last = nums[nums.length-1];
  nev[a-1] = last;
  return nev;
}
