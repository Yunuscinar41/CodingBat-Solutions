public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isAsleep){
    return false;
  }
  else if(isMom){
    return true;
  }
  else if(isMorning){
    return false;
  }
  else{
    return true;
  }
    
  
}
