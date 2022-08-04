public String frontBack(String str) {
  if(str.length() <= 1 ){
    return str;
  }
  else{
    String firstchar = str.substring(0,1);
    String lastchar = str.substring(str.length()-1);
    
    return lastchar + str.substring(1,str.length()-1) + firstchar;
  }
}
