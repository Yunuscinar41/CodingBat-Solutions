public String lastChars(String a, String b) {
  int x = a.length();
  int y = b.length();
  if(a.equals("") && b.equals("")){
    return "@@";
  }
  if(a.equals("")){
    return "@" + b.substring(y-1,y);
  }
  if(b.equals("")){
    return a.charAt(0) + "@";
  }
  else{
    return a.substring(0,1) + b.substring(y-1,y);
  }
}
