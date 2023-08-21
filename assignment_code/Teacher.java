package assignment_code;
import java.util.Objects;

public class Teacher extends Person{
    private String subject;
    
    public Teacher(String name, int age, String gender,String subject){
        super(name,age,gender);
        this.subject=subject;
    }

    @Override
    public void introduce(){
        System.out.println("Hello, my name is " + getName() +"and i will be teaching you"+subject);
    }
    //The super keyword in Java is used to access and call methods, constructors, and members of a superclass (parent class) from within a subclass (child class). It's often used to perform actions related to the superclass before or after additional actions specific to the subclass.


    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}
