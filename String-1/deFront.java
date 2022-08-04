public String deFront(String str) {    
  if(str.length() <3){
    if(str.equals("ab")){
      return str;
    }
    if(str.charAt(0) == 'a'){
      return "a";
    }
    if(str.charAt(1) == 'b'){
      return "b";
    }
  }
  else{
    if(str.charAt(0) == 'a' && str.charAt(1) == 'b'){
      return str;
    }
    else if(str.charAt(0) == 'a'){
      return "a"+str.substring(2);
    }
    else if(str.charAt(1) == 'b'){
      return str.substring(1);
    }
    else{
      return str.substring(2);
    }
  }
  return "";
}
