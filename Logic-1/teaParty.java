public int teaParty(int tea, int candy) {
  if(candy < 5 || tea <5) {
    return 0;
  }
  else if(tea >= 2*candy || candy >= tea*2){
    return 2;
  }
  else{
    return 1;
  }
}
