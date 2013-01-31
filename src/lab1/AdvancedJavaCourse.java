package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {
    
    //course name
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
     public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
 
    
    
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }   
     
     //prereqs
    public String getPrerequisites() {
        return prerequisites;
    }
       
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }


}
