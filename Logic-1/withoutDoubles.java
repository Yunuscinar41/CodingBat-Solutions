public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  int sum = die1+die2;
  if(noDoubles){
    if(die1 == 6 && die2 == 6){
      return 7;
    }
    if(die1 == die2){
      return sum+1;
    }
    else{
      return sum;
    }
  }
  return sum;
}
