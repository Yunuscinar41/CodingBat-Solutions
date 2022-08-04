public String twoChar(String str, int index) {
  String result = "";  
  if(index <= 0 || index+2 > str.length()){
    return str.substring(0,2);
  }
  else{
    for(int i = 0;i<2; i++){
      result += str.charAt(index+i);
    }
    return result;
  }
}
