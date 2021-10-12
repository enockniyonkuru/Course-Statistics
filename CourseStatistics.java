import java.util.AbstractMap;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;

/*
* This class maintains the course statistics
* @author Enock Niyonkuru
* @version 1.0 May 1,2021
*/
public class CourseStatistics {
  //fields
  int total;                          // total number of course entries in
  PriorityQueue<Course> pq;
  Map <String,Course> map = new HashMap<>();;



// default constructor that initialize the instance variables as needed
  public CourseStatistics(){
   total = 0;
   map =  new HashMap <String,Course> ();
   PriorityQueue<Course> pq = new PriorityQueue<Course> (10, new CourseComparator());

  }

    /**
    * Keep track of the total number of courses added
    * @return total int the total number of courses
    * Time Complexity: O(1)
    **/
  public int size() {
    return total;
  }


/**
* to add a course c if it not yet sotred or to update its total if it is.
* @param c cource c to be added to the map of courses
* Time Complexity: O(1)
**/
  public void addCourse(Course c){
     if(!map.containsKey(c.getName()))
        map.put(c.getName(), c);
      else{
        int newVotes = (c.getVotes() + map.get(c.getName()).getVotes());
        int newStudents = (c.getStudents() + map.get(c.getName()).getStudents());
        c.setVotes(newVotes);
        c.setStudents(newStudents);
        map.replace(c.getName(), c);
      }
  }
  /**
  * to return a stored course given its getName
  * @param name String name as a key of the course to be found
  * Time Complexity: O(1)
  **/
  public Course getCourse(String name){
    return map.get(name);
  }
/**
* to find and display the best course to take based on its recommendation score
* @param courses List of courses to use to find the best recommendation among the courses in that list
* Time Complexity: O(n)
**/
  public void findBest(List<Course> courses){
    //this method uses a PriorityQueue to pick one of the courses provided in the list courses.
     PriorityQueue<Course> pQueue = new PriorityQueue<Course>(10, new CourseComparator()); // creatiing a new PriorityQueue
    //fill the PriorityQueue with elements in courses List
    for(int i = 0; i< courses.size(); i++){
       pQueue.add(courses.get(i));
    }
    System.out.println(pQueue.poll().description());
  }

  /**
  * to display all course names and their recommendation scores stored by the scores
  * Time Complexity: O(n)
  **/
  public void displayStats(){
   PriorityQueue<Course> pq = new PriorityQueue<Course> (20, new CourseComparator());
     for(String key:map.keySet()){
      pq.add(map.get(key));
      }
   while(!pq.isEmpty()){
      System.out.println(pq.poll().toString());
      }
  }
  /**
  * to display all courses and their description provided by description()
  * Time Complexity: O(n)
  **/
  public void displayAll(){
  for(String key: map.keySet()){
    System.out.println(map.get(key).description());
  }


  }

}
