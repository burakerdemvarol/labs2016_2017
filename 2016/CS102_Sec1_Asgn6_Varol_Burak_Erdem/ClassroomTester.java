import java.util.*;
public class ClassroomTester {
  public static void main (String [] agrs) throws Exception
  {
    // Fill this main method so that all exceptions you added
    // can be seen when we run the code. Note that you should
    // write the code segment based and each segment should
    // corresponds to a specific exception. You cannot run the
    // code and it shows all exception.
    Scanner scan = new Scanner(System.in);
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    int classNumber;
    System.out.println("Please give positive integer:");
    classNumber = scan.nextInt();
    while(classNumber < 0){
      System.out.println("Please give positive integer: ");
      classNumber = scan.nextInt();
    }
    Classroom classRoom1 = new Classroom(classNumber, "CS102");
    
    try{
      for(int i = 0; i < 50; i++){
        
        classRoom1.addStudent(new Student((int)(Math.random()*1000)+1,"Zibarian"+i,"Zalahon"+i,"CS"));
    }
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("We have too many students I can not add student!!");
      }
    
    try{
    classRoom1.addStudent(null);
  
    
    }catch(NullPointerException e){
      System.out.println("Null pointer exception");
    }
    System.out.println(classRoom1);
    Student student1 = new Student(21293091, "Haluk", "Kanarya", "IR");
    try{
      classRoom1.addStudent(student1);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("We have too many student I can not add student!!");
    }
    try{
      classRoom1.addStudent(student1);
    }catch(StudentAlreadyFoundException e){
      System.out.println(e.getMessage());
    }
    System.out.println(classRoom1);
    try{
    classRoom1.removeStudent(null);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("You can not remove because boundary is not correct");
    }
    System.out.println(classRoom1);
    System.out.println("Please give Student number: ");
    
    try{
      System.out.println(classRoom1.searchStudent(scan.nextInt()));
    }catch(InputMismatchException e){
      System.out.println("Please enter Integer Joker!!!");
    }
    
    System.out.println("Enter file name: ");
    
    try{
      classRoom1.printIntoFile(scan1.nextLine());
    }catch(InputMismatchException e){
      System.out.println("Please enter String Joker!!!");
    }catch(FileAlreadyFoundException e){
      System.out.println(e.getMessage());
    }
    System.out.println("Enter file name: ");
     try{
      classRoom1.appendToFile(scan2.nextLine());
    }catch(InputMismatchException e){
      System.out.println("Please enter String Joker!!!");
    }
    
  }
  
}
