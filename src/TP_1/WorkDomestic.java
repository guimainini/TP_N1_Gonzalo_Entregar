package TP_1;

import java.util.ArrayList;

public class WorkDomestic extends Work {
    //atributos
    private int numberRooms;


    //contrustores
    public WorkDomestic(String address, float squareMeter, int estimatedConstructionTime, float costPerSquareMeter, ArrayList<Employee> listEmployee, int numberRooms) {
        super(address, squareMeter, estimatedConstructionTime, costPerSquareMeter, listEmployee);
        this.numberRooms = numberRooms;
    }


    @Override
    public String toString() {
        return "WorkDomestic ->-> numberRooms = " + numberRooms+super.toString();
    }


}
