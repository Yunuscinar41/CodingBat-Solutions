public String withoutX2(String str) {
  if(str.length() < 2){
    if(str.length() == 0){
      return str;
    }
    else{
      if(str.charAt(0) == 'x'){
        return "";
      }
      return str;
    }
  }
  if(str.charAt(0) == 'x' && str.charAt(1) == 'x'){
    return str.substring(2);
  }
  if(str.charAt(0) == 'x'){
    return str.substring(1);
  }
  if(str.charAt(1) == 'x'){
    return str.substring(0,1) + str.substring(2);
  }
  return str;
}
