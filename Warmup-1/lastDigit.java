public boolean lastDigit(int a, int b) {
  int temp1 = a%10;
  int temp2 = b%10;
  
  if(temp1 == temp2){
    return true;
  }
  else{
    return false;
  }
}
