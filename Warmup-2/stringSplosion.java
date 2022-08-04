public String stringSplosion(String str) {
  String result = "";
  if(str.length() == 0){
    return result;
  }
  else{
    for(int i = 0; i<str.length(); i++){
      result += str.substring(0,i+1);
    }
    return result;
  }
}
