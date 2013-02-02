/*
 * I personally like the abstract class structure.  I think there is value in 
 * having reusable code, especially when there is only a few levels of superclasses.
 * 
 * One thing that I can see could be an issue with this structure, is that it is 
 * very easy to start second guessing whether or not the superclass methods should
 * be able to be overwritten.  Once they are in production it would be much more 
 * difficult to start changing things, so this has to be well planned.  
 * 
 * regarding the Liskov Substitution principle, I didn't notice much of a difference
 * between the two ways to create classes, other than the fact that if I use the 
 * superclass as the data type, I can't call the methods from the sub-class.  This 
 * makes me wonder what the actual benefit is.  I'm going to do some research
 * and comment on this further...
 *      [researching...]
 * ...Well I didn't figure it out completely, but it looks like the intent is that
 * if you had an array of objects, it could store all different types of subclasses 
 * without negatively impacting the program.  In other words, it would be possible 
 * to replace the object types without breaking the program.  I have to do more 
 * testing in order to find when this would be utilized.  
 * 
 * I could have had more of the methods at the super class level, but thought to 
 * leave this with some flexibility.  Generally though, I would think that the same 
 * methods could be used for validation within the programming type course scope.
 * 
 */
package lab1;

/**
 *
 * @author jryder
 */
public class Startup {
    
    public static void main(String[] args) {    

        //Advanced Java
        ProgrammingCourse java1 = new AdvancedJavaCourse("ADVJAVA 101","85574");
        java1.setPrerequisites("This course requires that you are the best, and only the best.");
        java1.setCredits(1);
        
        System.out.println(java1.getPrerequisites());
        System.out.println(java1.getCapitalizedCourseName());
        System.out.println(java1.getCredits());
        System.out.println(java1.getCourseNumber());
        
        //Intro to Java
        ProgrammingCourse prog1 = new IntroJavaCourse("INTJAVA 101","85574");
        prog1.setPrerequisites("This course requires that you not bad.");
        prog1.setCredits(2);       
        
        System.out.println(prog1.getPrerequisites());
        System.out.println(prog1.getCapitalizedCourseName());
        System.out.println(prog1.getCredits());
        System.out.println(prog1.getCourseNumber());        
        
        //Intro to Programming
        ProgrammingCourse intro1 = new IntroToProgrammingCourse("INTPROG 101","85574");
        intro1.setPrerequisites("This class recommends that you have a pulse.  If you don't, it's okay, we'll still accept you.");
        intro1.setCredits(3);   
        
        System.out.println("This class has no requirements");
        System.out.println(intro1.getCapitalizedCourseName());
        System.out.println(intro1.getCredits());
        System.out.println(intro1.getCourseNumber());          
        
    }
}
