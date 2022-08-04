public String seeColor(String str) {
  String result = "";
  for(int i =0;i <str.length();i++){
    result += str.charAt(i);
    if(result.equals("red")){
      return "red";
    }
    if(result.equals("blue")){
      return "blue";
    }
  }
  return "";
}
