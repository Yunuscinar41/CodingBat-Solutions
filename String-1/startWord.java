public String startWord(String str, String word) {
  int a = word.length();
  if(str.equals("")){
    return "";
  }
  if(word.length() > str.length()){
    return "";
  }
  if(word.equals(str.substring(0,a))){
    return word;
  }
  if(word.substring(1,a).equals(str.substring(1,a))){
    return str.charAt(0) + word.substring(1,a);
  }
return "";
}
