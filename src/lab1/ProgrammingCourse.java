



package lab1;

import javax.swing.JOptionPane;


/**
 *
 * @author jryder
 */
public abstract class ProgrammingCourse {
    protected String courseName;
    protected String courseNumber;
    protected double credits;
    
 
    //constructor
    public abstract void ProgrammingCourse(String courseName, String courseNumber) ;
    
    //allow the subclass to choose validation method
    public abstract void setCourseName(String courseName);
    public abstract void setCourseNumber(String courseName);
    
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
}
