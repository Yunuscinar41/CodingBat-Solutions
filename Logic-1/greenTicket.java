public int greenTicket(int a, int b, int c) {
  if(a != b && a != c && b != c){
    return 0;
  }
  else if(a == b && a == c && b == c){
    return 20;
  }
  else{
    return 10;
  }
}
