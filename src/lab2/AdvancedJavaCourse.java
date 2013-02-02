package lab2;

import javax.swing.JOptionPane;

/**
 *
 *
 * @author      Jordan Ryder
 * @version     1.00
 */
public class AdvancedJavaCourse implements ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    
    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null or empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    @Override    
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null or empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }        
    
    //programming courses always need to be between 0.5 and 4 credits
    public void setCredits(double credits) {
    if(credits < 0.5 || credits > 4.0) {
        JOptionPane.showMessageDialog(null,
                "Error: credits must be in the range 0.5 to 4.0");
        System.exit(0);
    }
    this.credits = credits;
    }   
    
    
    //getters do not need any special rules
    public final double getCredits() {
        return credits;
    }
    public final String getCourseName() {
        return this.courseName;
    }   
    public final String getCourseNumber() {
        return courseNumber;
    }
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }   
    
    //prereqs
    public String getPrerequisites() {
        return prerequisites;
    }      
    
    

    
}
