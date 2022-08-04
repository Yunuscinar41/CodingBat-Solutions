public String comboString(String a, String b) {
  int first = a.length();
  int second = b.length();
  if(first > second){
    return b+a+b;
  }
  if(first < second){
    return a+b+a;
  }
  if(a.length() == 0){
    return b;
  }
  if(b.length() == 0){
    return a;
  }
  return "";
}
