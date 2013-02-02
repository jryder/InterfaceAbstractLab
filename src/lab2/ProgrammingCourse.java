package lab2;

/**
 *
 * @author Jordan Ryder
 * 
 * Same as the abstract lab, all of the courses could potentially have prerequisites.
 * However, for the sake of testing and learning, the prerequisite method is not part
 * of the interface.
 * 
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
