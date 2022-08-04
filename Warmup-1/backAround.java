public String backAround(String str) {
  String lastletter = str.substring(str.length() - 1);
  return lastletter + str + lastletter;
}
