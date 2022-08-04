public int[] make2(int[] a, int[] b) {
  int [] nev = {0,0};
  if(a.length >= 2){
    nev[0] = a[0];
    nev[1] = a[1];
  }
  else if(a.length == 1){
    nev[0] = a[0];
    nev[1] = b[0];
  }
  else{
    nev[0] = b[0];
    nev[1] = b[1];
  }
  return nev;
}
