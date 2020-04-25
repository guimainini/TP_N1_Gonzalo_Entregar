package Package1;

import java.util.ArrayList;

public class Hotel extends WorkCommercial{
    //atributos
    private int numberFloor;

    //constructor
    public Hotel(String address, float squareMeter, int estimatedConstructionTime, float costPerSquareMeter, ArrayList<Employee> listEmployee, String nameWork, int numberFloor) {
        super(address, squareMeter, estimatedConstructionTime, costPerSquareMeter, listEmployee, nameWork);
        this.numberFloor = numberFloor;
    }
    public Hotel() {
    }

    //set y get
    public int getNumberFloor() {
        return numberFloor;
    }
    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Hotel ->-> numberFloor = "+numberFloor+super.toString();
    }
}
