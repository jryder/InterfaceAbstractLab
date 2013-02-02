
package lab2;


/**
 *
 * @author jryder
 * 
 * 
 * At first I had made the prerequisites method not part of the ProgrammingCourse 
 * interface.  However, I realized by using Liskov Substitution, I then could not 
 * use the method in the objects, so I added it back in.  I guess that makes sense 
 * now.  By having the interface, when I'm creating objects, I know that I can 
 * use the interface as the data type, and be guaranteed that certain methods will
 * be there for me to use.  
 * 
 * 
 * 
 */
public class Startup {
    
    public static void main(String[] args) {    

        //Advanced Java
        ProgrammingCourse java1 = new AdvancedJavaCourse("ADVJAVA 101","85574");
        java1.setPrerequisites("This course requires that you are the best, and only the best.");
        java1.setCredits(1);
        
        System.out.println(java1.getCredits());
        System.out.println(java1.getCourseNumber());
        
        //Intro to Java
        ProgrammingCourse prog1 = new IntroJavaCourse("INTJAVA 101","85574");
        prog1.setPrerequisites("This course requires that you not bad.");
        prog1.setCredits(2);       
        
        System.out.println(prog1.getPrerequisites());
        System.out.println(prog1.getCredits());
        System.out.println(prog1.getCourseNumber());        
        
        //Intro to Programming
        ProgrammingCourse intro1 = new IntroToProgrammingCourse("INTPROG 101","85574");
        intro1.setPrerequisites("This class recommends that you have a pulse.  If you don't, it's okay, we'll still accept you.");
        intro1.setCredits(3);   
        
        System.out.println("This class has no requirements");
        System.out.println(intro1.getCredits());
        System.out.println(intro1.getCourseNumber());          
        
    }
}
