int countXX(String str) {
  int count = 0;
  if(str.length() < 2 ){
    return 0;
  }
  else{

    for(int i = 0; (i< str.length() -1);i++){
      if(str.substring(i,i+2).equals("xx")){
        count++;
      }
    }
    return count;
  }
}
