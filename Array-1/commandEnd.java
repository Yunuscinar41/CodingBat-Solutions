public boolean commonEnd(int[] a, int[] b) {
  int f = a.length-1;
  int s = b.length-1;
  if(a[0] ==b[0]){
    return true;
  }
  else if(a[f] == b[s]){
    return true;
  }
  else {
  return false;
  }
}