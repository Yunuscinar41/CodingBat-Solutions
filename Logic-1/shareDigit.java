public boolean shareDigit(int a, int b) {
  int x = a/10;
  int y = b/10;
  int x1 = a%10;
  int y1 = b%10;
  if(x == y || x == y1 || x1 == y || x1 == y1){
    return true;
  }
  else
  return false;
}
