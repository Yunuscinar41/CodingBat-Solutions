public boolean mixStart(String str) {
  if(str.length()<3){
    return false;
  }
  String ixword = str.substring(1,3);
  return(ixword.equals("ix"));
}
