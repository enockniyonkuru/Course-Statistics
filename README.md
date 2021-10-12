**Brief Description:**

This project, I  designed and implemented a simple program to calculate course statistics based on a text file containing course information. 
The program will read in a text file and use a Map implemented using a hash table to store course information such that for any given course you will store its name, title, the total number of students who have taken the course, and the total number of student who have recommended the course. Further, it will calculate and use a recommendation score for a course: the percentage of all students who recommended the course. Because the file may contain multiple entries for a specific course, the program maintain the overall totals for all courses. That is, if a course appears multiple times in the text file, the program should have a single entry for that course but the associated totals should be a sum of the numbers provided in each entry. 

The program will support: 

- Looking up a course description by using the course name. 
- Choosing the best course to take given several options. 
- Displaying a list of courses and their full descriptions. 
- Displaying a list of courses sorted by their overall recommendation rate. 

## Class Course
- This class represents an individual Course object. 
- Instance variables:
   - String name to store course name (e.g., CPSC215). 
   - String title to store course title (e.g., Data Structures and Algorithms).
   - int students to store the total number of students who have taken the course. 
   - int votes to store the total number of positive recommendation votes. 
- Default as well as a parametrized constructor to set the instance variables. 
- Necessary setters and getters for instance variables. 
- double getScore() to calculate and return the recommendation score, the percentage of students who recommend the course. 
- String description() to return a String representation of a full course description. 
- String toString() to return a String representation consisting of the course name and the recommendation score. 
- You may add private helper methods as needed.

## Class CourseStatistics 
- This class maintains the course statistics. 
- It uses a Map implemented with a hash table for storage. 
- It uses a PriorityQueue for recommending the best course to take. This queue uses a custom Comparator object (CourseComparator) to compare courses. 
- It keeps track of the total number of courses added. 
- It has a default constructor to initialize the instance variables as needed. • void addCourse(Course c) to add a course c if it not yet stored or to update its totals it if is. 
- Course getCourse(String name) to return a stored course given its name (e.g., CPSC215). 
- void findBest(List courses) to find and display the best course to take based on its recommendation score.
 This method uses a PriorityQueue to pick one of the courses provided in the list courses. 
- void displayStats() to display all course names and their recommendation scores sorted by the scores. 
- void displayAll() to display all courses and their descriptions provided by description(). 
- You may add private helper methods as needed. 

## Class CourseStatisticsTester
- This is a tester class for CourseStatistics. 
- This class should produce the output. 
- Notice that a user can look up and compare any number of courses. 
- You may add private helper methods as needed. 

## Class CourseComparator 
- This class implements compare() to compare the objects based on their recommendation score as provided by getScore().


