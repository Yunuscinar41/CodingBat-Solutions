public boolean closeFar(int a, int b, int c) {
  if(Math.abs(a-b) == 1 || (a-b ==0)){
    if(Math.abs(c-a) >= 2 && Math.abs(c-b) >= 2){
      return true;
    }
    return false;
  }
  else{
    if(Math.abs(a-c) == 1 || a== c){
      if(Math.abs(b-a) >= 2 && Math.abs(c-b) >= 2){
        return true;
      }
    }
    return false;
  }
}
