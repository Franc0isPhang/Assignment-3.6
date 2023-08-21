package assignment_code;
import java.util.Objects;

public class School implements Building{
    private String name;
    private int numberOfFloors;
    private String address;

    public School(String name,int numberOfFloors,String address){
        this.name=name;
        this.address=address;
        this.numberOfFloors=numberOfFloors;
    }

    @Override
    public void addFloor(int floors) {
        numberOfFloors += floors;
    }

    @Override
    public void describe() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
}
}
