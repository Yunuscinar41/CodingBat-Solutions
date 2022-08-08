public int makeChocolate(int small, int big, int goal) {
  int x = goal%5;
  int sum = big*5 + small*1;
  if(sum >= goal){
    if(small >= x){
      if(goal >= big*5 ){
        return goal - (big*5);
      }
      else{
        return x;
      }
    }
    return -1;
  }
  return -1;
}
