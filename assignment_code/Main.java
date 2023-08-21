package assignment_code;

public class Main {
    public static void main (String args[]){
        School school = new School("ABC School",5, "123 Main St.");
        Teacher teacher = new Teacher("Ms. Smith", 30, "Female", "Math");
        Student student1 = new Student("John", 15, "Male", "Sophomore");
        Student student2 = new Student("Emily", 16, "Female", "Junior");

        school.addFloor(5);
        System.out.println(school.getNumberOfFloors());
        school.describe();
        teacher.introduce();
        student1.introduce();
        student2.introduce();
    }
}
