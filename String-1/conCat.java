public String conCat(String a, String b) {
  if(a.equals("") || b.equals("")){
    return a+b;
  }
  if(a.substring(a.length()-1,a.length()).equals(b.substring(0,1))){
    return a.substring(0,a.length()-1) + b;
  }
  else{
    return a+b;
  }
}
