public boolean nearTen(int num) {
  int x = num % 10;
  if(x == 1 || x == 2 || x == 8 || x == 9 || x == 0) {
    return true;
  }else{
    return false;
  }
}
