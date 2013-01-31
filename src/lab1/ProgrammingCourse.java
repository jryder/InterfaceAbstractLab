/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
   
    public abstract void setCourseName(String courseName);
    public abstract void setCourseNumber(String courseName);


}
