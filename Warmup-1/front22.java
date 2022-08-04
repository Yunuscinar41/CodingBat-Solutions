public String front22(String str) {
  if(str.length() <= 2){
    String front = str;
    String back = str;
    return front + str + back;
  }
  else{
    String cut = str.substring(0,2);
    
    return cut + str +cut;
    
    
    
  }
}
