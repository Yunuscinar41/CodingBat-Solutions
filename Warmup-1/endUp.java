public String endUp(String str) {
  if(str.length() <= 3){
    return str.toUpperCase();
  }
  else{
    int cut = str.length() - 3;
    
    String front = str.substring(0,cut);
    String back = str.substring(cut);
    
    return front + back.toUpperCase();
  }
}
