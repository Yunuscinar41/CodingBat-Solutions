public String withoutX(String str) {
  int a = str.length() -1;
  if(str.length() == 0){
    return "";
  }
  if(str.equals("x")){
    return "";
  }
  if(str.charAt(0) == 'x' && str.charAt(a) == 'x'){
    return str.substring(1,a);
  }
  if(str.charAt(0) == 'x'){
    return str.substring(1);
  }
  if(str.charAt(a) == 'x'){
    return str.substring(0,a);
  }
  return str;
}