public String nTwice(String str, int n) {
 String head = "";
 String tail = "";
  head += str.substring(0,n);
  tail += str.substring(str.length()-n,str.length());
  return head + tail;
}
