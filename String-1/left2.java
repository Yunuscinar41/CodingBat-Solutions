public String left2(String str) {
  String a = str.substring(0,2);
  return str.substring(2,str.length()) + a;
}
