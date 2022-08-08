public int round10(int num){
  int x = num%10;
  if(x >= 5){
    int y = 10 - x;
    num += y;
    return num;
  }
  else{
    num -= x;
    return num;
  }
  
}
public int roundSum(int a, int b, int c) {
  return round10(a)+round10(b)+round10(c);
}
