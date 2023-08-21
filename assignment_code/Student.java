package assignment_code;

public class Student extends Person{
    String yrlevel;

    public Student( String name, int age, String gender,String yrlevel){
        super(name,age,gender);
        this.yrlevel=yrlevel;
    }
    public void introduce(){
        System.out.println("hello,my name is"+getName()+"and i am a"+yrlevel+"student");
    }       

    public String getYrlevel() {
        return this.yrlevel;
    }

    public void setYrlevel(String yrlevel) {
        this.yrlevel = yrlevel;
    }

}
