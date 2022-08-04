boolean doubleX(String str) {
  int firstx = str.indexOf("x");
 if(firstx == -1 ){
   return false;
 } 
 if(firstx + 1 >= str.length()){
  return false;   
 }
 return (str.substring(firstx + 1, firstx + 2).equals("x"));
}