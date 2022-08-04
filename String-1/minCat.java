public String minCat(String a, String b) {
  if(a.length() == 0 || b.length() == 0){
    return "";
  }
  if(a.length() > b.length()){
    int diff = a.length() - b.length();
    return a.substring(diff)+b;
  }
  if(a.length() < b.length()){
    int diff2 = b.length() - a.length();
    return a+b.substring(diff2);
  }
  return "";
}
