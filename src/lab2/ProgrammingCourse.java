package lab2;

import javax.swing.JOptionPane;


/**
 *
 * @author Jordan Ryder
 */
public interface ProgrammingCourse  {
 
    //allow the subclass to choose validation method
    public void setCourseName(String courseName);
    public void setCourseNumber(String courseName);
    public void setPrerequisites(String prerequisites);
    
    public void setCredits(double credits) ;
    
    
    //getters do not need any special rules
    public double getCredits() ;
    public String getCourseName();
    public String getCourseNumber() ;
    
    //prereqs
    public String getPrerequisites() ;
    
    
    
}
