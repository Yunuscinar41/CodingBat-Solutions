public boolean loneTeen(int a, int b) {
   if(a<=19 && a>=13 && b<=19 && b>=13){
   return false;
   }
   else if(a<=19 && a>=13){
     return true;
   }
   else if(b<=19 && b>=13){
     return true;
   }
   return false;
}
