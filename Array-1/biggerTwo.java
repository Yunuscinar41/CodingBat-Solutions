public int[] biggerTwo(int[] a, int[] b) {
  int sum = a[0] + a[1];
  int sum1 = b[0] + b[1];
  if(sum >= sum1) {
    return a;
  }else{
    return b;
  }
}
