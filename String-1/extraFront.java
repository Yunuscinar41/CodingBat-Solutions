public String extraFront(String str) {
  if(str.length() == 0){
    return "";
  }
  if(str.length() == 1){
    return str+str+str;
  }
  if(str.length() >= 2){
    String copy = str.substring(0,2);
    return copy+copy+copy;
  }
  return "";
}
