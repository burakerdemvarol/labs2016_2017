class FileAlreadyFoundException extends Exception{
  
  public FileAlreadyFoundException(){
    
  }     
  
  
  public String getMessage(){
    return "File already here";
    
  }
  
}