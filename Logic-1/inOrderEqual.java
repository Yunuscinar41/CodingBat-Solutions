public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(equalOk){
    if(b >= a && c >= b){
      return true;
    }
    else{
      return false;
    }
  }
  else{
    if(c>b && b>a){
      return true;
    }
    else{
      return false;
    }
  }
}
