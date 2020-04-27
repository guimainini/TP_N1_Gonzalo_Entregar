package TP_1;

import java.util.ArrayList;

public class Shop extends WorkCommercial{
    //atributo
    private String sector;
    //constructor
    public Shop(String address, float squareMeter, int estimatedConstructionTime, float costPerSquareMeter, ArrayList<Employee> listEmployee, String nameWork, String sector) {
        super(address, squareMeter, estimatedConstructionTime, costPerSquareMeter, listEmployee, nameWork);
        this.sector = sector;
    }

    //set y get no necesite

    @Override
    public String toString() {
        return "Shop ->-> sector = " + sector +super.toString();
    }
}
