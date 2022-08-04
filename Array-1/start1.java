public int start1(int[] a, int[] b) {
  int result = 0;
  for(Integer first : a){
    if(first == 1){
      result++;
    }
  }
  for(Integer second : b){
    if(second == 1){
      result++;
    }
  }
  return result;
}
