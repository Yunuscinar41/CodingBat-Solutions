public int stringMatch(String a, String b) {
  int result = 0;
  if(a.length() < 2 || b.length() < 2 ){
    return 0;
  }
  else{
    for(int i = 0 ; (i <a.length() -1) && (i < b.length() - 1);i++){
      if(a.substring(i,i+2).equals(b.substring(i,i+2))){
        result++;
      }
    }
    return result;
  }
}
