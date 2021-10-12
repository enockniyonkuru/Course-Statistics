import java.io.*;
import java.util.*;

/*
* This class tests CourseStatistics
* @author Enock Niyonkuru
* @version 1.0 May 1,2021
*/


public class CourseStatisticsTester {
  
  public static void main(String[] args){
    CourseStatistics course = new CourseStatistics(); //creating a course object
    Map<String,Course> hmp = new HashMap<>(); //creating a new map
    List<Course> lst = new ArrayList<>();  //creating a new list

    if(args.length !=1){
      System.out.println("Error: You need to provide a file name.");
      System.exit(1);
    }

    try {
      String name = null;
      String title = null;
      int votes= 0;
      int students=0;
      String key;
      FileReader inFile = new FileReader(args [0]);
      BufferedReader in = new BufferedReader(inFile);
      String line = in.readLine();
      //reading each line of the file and add it to the map in a loop of four lines
      while(line != null){
        for(int count = 1; count < 5; count ++){
          if (count == 1){
           name = line;
          }
          else if (count == 2){
           title = line;
          }
          else if  (count == 3){
            students = Integer.parseInt(line);
          }
          else if (count == 4){
            votes = Integer.parseInt(line);
          }
        line = in.readLine();
      }
    Course cs = new Course(name, title ,students, votes);
    course.addCourse(cs);//adding a course cs to the map
    lst.add(cs);  //adding a course cs to the list lst
  }

    }
    catch(FileNotFoundException e){
      System.out.println("Error: File " + args[0] + "not found.");
      System.exit(1);
    }
    catch(IOException e){
      System.out.println(e);
      System.exit(1);
    }
    //displaying all courses and description
    System.out.println("*** Displaying courses and their full description...");
    System.out.println("Displaying 19 courses. ");
    course.displayAll();
    System.out.print("");

    //displaying all courses and recommendation
    System.out.println("*** Displaying courses sorted by their recommendation...");
    course.displayStats();
    System.out.print("");

    //looking up courses
     System.out.println("*** looking up courses ...");
     System.out.println("Enter a course ID to look up statistics. Enter 's' to stop.");
     Scanner sc = new Scanner (System.in);
     String i;
     // checking in the map whether the course being searched is in the map or not and then print its description
     do{
       System.out.print("Course ID: ");
       i = sc.nextLine();
       if(course.getCourse(i) != null){
         System.out.println(course.getCourse(i).description());
       }else if(!i.equals("s")){
         System.out.println("No such course! Try again.");
       }
     }while (!i.equals("s"));

     System.out.print("");

      //commparing courses
     System.out.println("*** comparing courses ...");
     System.out.println("Enter a course ID to compare. Enter 's' to stop.");
     ArrayList<Course> list = new ArrayList<>();
     String x;
     //checking whether the course to becompared exist or not or to terminate the comparision
     do{
       System.out.print("Course ID: ");
       x = sc.nextLine();
       if(course.getCourse(x) != null){
         list.add(course.getCourse(x));
       }else if(!x.equals("s")){
         System.out.println("No such course! Try again.");
       }
     }while (!x.equals("s"));
     System.out.print("Best course to take: ");
     course.findBest(list);
   }
}
