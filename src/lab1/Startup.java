/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author jryder
 */
public class Startup {
    
    public static void main(String[] args) {    

        ProgrammingCourse java1 = new AdvancedJavaCourse("ADVJAVA 101","85574");
        java1.setPrerequisites("This course requires that you are the best, and only the best.");
        java1.setCredits(5);
        
        System.out.println(java1.getPrerequisites());
        System.out.println(java1.getCapitalizedCourseName());
        System.out.println(java1.getCredits());
        System.out.println(java1.getCourseNumber());
        
        
        ProgrammingCourse prog1 = new IntroJavaCourse("INTJAVA 101","85574");
        prog1.setPrerequisites("This course requires that you not bad.");
        prog1.setCredits(5);       
        
        System.out.println(prog1.getPrerequisites());
        System.out.println(prog1.getCapitalizedCourseName());
        System.out.println(prog1.getCredits());
        System.out.println(prog1.getCourseNumber());        
        
        
        ProgrammingCourse intro1 = new IntroToProgrammingCourse("INTPROG 101","85574");
        intro1.setPrerequisites("This class recommends that you have a pulse.  If you don't, it's okay, we'll still accept you.");
        intro1.setCredits(5);   
        
        System.out.println("This class has no requirements");
        System.out.println(intro1.getCapitalizedCourseName());
        System.out.println(intro1.getCredits());
        System.out.println(intro1.getCourseNumber());          
        
    }
}
