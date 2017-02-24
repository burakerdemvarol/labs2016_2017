class StudentAlreadyFoundException extends Exception{
  
  public StudentAlreadyFoundException(){
    
  }     

  public String getMessage(){
    return "Student already here";
    
  }
  
}