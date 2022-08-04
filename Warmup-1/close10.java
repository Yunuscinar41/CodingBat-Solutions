public int close10(int a, int b) {
  int gap1 = 10 - a;
  int gap2 = 10 - b;
  
  if(Math.abs(gap1) < Math.abs(gap2)){
    return a;
  }
  else if( Math.abs(gap2) < Math.abs(gap1)){
    return b;
  }
  else return 0;
}
