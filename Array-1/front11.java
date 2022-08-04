public int[] front11(int[] a, int[] b) {
  int [] nev = {};
  if(a.length ==0 && b.length == 0){
    int [] nev1 = {};
    return nev;
  }
  else if(a.length==0){
    int x = b[0];
    int [] nev2 = {x};
    return nev2;
  }
  else if(b.length == 0) {
    int x = a[0];
    int [] nev3 = {x};
    return nev3;
  }else{
    int x = a[0];
    int y = b[0];
    int [] nev4 = {x,y};
    return nev4;
  }
}
