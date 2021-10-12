
/*
* This class represents an individual Course object
* @author Enock Niyonkuru
* @version 1.0 May 1,2021
*/


public class Course{
  // fields
  String name;
  String title;
  int students;
  int votes;
 //defualt contrsuctor
  public Course(){
  }
  /**
  * parameterized constructor
  * @param name a string holding the name of the course
  * @param title an string holding the title of the course
  * @param students a int holding the number of students who took the course
  * @param votes and int  holding the number of votes of each  course
  *
  **/
  public Course(String name, String title, int students, int votes){
    this.name = name;
    this.title = title;
    this.students = students;
    this.votes = votes;
  }
  /**
  * get method for product name
  * @return name String the course's Name
  * Time Complexity: O(1)
  **/
  public String getName(){
    return name;
  }
  /**
  * get method for course title
  * @return title String the course's title
  * Time Complexity: O(1)
  **/
  public String getTitle(){
    return title;
  }
  /**
  * get method for course number of students
  * @return students int the course's number of students
  * Time Complexity: O(1)
  **/
  public int getStudents(){
    return students;
  }
  /**
  * get method for course number of votes
  * @return int votes the course's votes
  * Time Complexity: O(1)
  **/
  public int getVotes(){
    return votes;
  }

  /**
  * set method for course name
  * @param name String the course's Name
  * Time Complexity: O(1)
  **/

  public void setName(String name){
    this.name = name;
  }
  /**
  * set method for course title
  * @param title String the course's title
  * Time Complexity: O(1)
  **/
  public void setTitle(String title){
    this.title = title;
  }
  /**
  * set method for course number of students
  * @param students int the course's number of students
  * Time Complexity: O(1)
  **/
  public void setStudents(int students){
    this.students = students;
  }
  /**
  * set method for course number of votes
  * @param votes int the course's number of votes
  * Time Complexity: O(1)
  **/
  public void setVotes(int votes){
    this.votes = votes;
  }
/**
* calculate and return the recommendation score, the percentage of students who recommended the Course
* @return double recommendation score
* Time Complexity: O(1)
**/
  public double getScore(){
    return((votes *100)/students);
  }

  /**
  * String representation of a full course description
  * @return String description of the whole course
  * Time Complexity: O(1)
  **/
  public String description(){
    return (name + ": " + title + " has  been taken by " + students + " students and has a " + getScore() + "% recommendation score. ");
  }
  /**
  * string representation toString of the course name and the recommendation score
  * @return String representaiton of course's name and recommendation of a course
  * Time Complexity: O(1)
  **/
  public String toString(){
    return(name + ": " + getScore() + "%");
  }


}
