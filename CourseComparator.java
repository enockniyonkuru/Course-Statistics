import java.util.Comparator;

/*
* This class implements compare() to compare the objects based on their recommendation score as provided by getScore()
* @author Enock Niyonkuru
* @version 1.0 May 1,2021
*/

public class CourseComparator implements Comparator <Course>{
  /**
  * parameterized constructor
  * @param a a course to be compared to course b
  * @param votes and int  holding the number of votes of each  course
  * @return int  after comparing two courses
  * Time Complexity: O(1)
  **/
    public int compare(Course a, Course b)  {

      if((a.getScore()) < (b.getScore())){ return 1;}
      else if((a.getScore()) > (b.getScore())){ return -1;}
       return 0;

    }
  }
