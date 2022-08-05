public int sumLimit(int a, int b) {
  int sum = a+b;
  String x = String.valueOf(sum);
  int y = x.length();
  String z = String.valueOf(a);
  int f = z.length();
  if(y > f){
    return a;
  }
  else{
    return sum;
  }
}
