public boolean evenlySpaced(int a, int b, int c) {
  if(b>a && b>c){
    if(a>c){
    int x = Math.abs(b-a);
    int y = Math.abs(c-a);
    return x==y;
  }
  else{
    int x = Math.abs(b-c);
    int y = Math.abs(c-a);
    return x==y;
  }
}
  else if(c>b && c>a){
    if(b>a){
    int x = Math.abs(b-a);
    int y = Math.abs(c-b);
    return x==y;
  }
  else{
    int x = Math.abs(b-a);
    int y = Math.abs(c-a);
    return x==y;
  }
}
  else if(a>b && a>c){
    if(b>c){
    int x = Math.abs(b-a);
    int y = Math.abs(c-b);
    return x==y;
  }
  else{
    int x = Math.abs(a-c);
    int y = Math.abs(c-b);
    return x==y;
  }
}
  else{
    if(a==b && b == c){
      return true;
    }
    return false;
  }

}
