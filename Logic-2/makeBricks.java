public boolean makeBricks(int small, int big, int goal) {
  int reminder = goal%5;
  int sum = (small *1)+ (big*5);
  if(sum >= goal){
    if(small >= reminder){
      return true;
    }
    else
    return false;
  }
  else{
    return false;
  }
  
}
