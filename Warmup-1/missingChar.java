public String missingChar(String str, int n) {
  if(n == 0 ){
    return str.substring(1);
  }
  else{
  String nword = str.substring(0,n) + str.substring(n+1);
  return nword;
}
}
