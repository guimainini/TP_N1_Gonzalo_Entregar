package Package1;

import java.util.ArrayList;

public class Shop extends WorkCommercial{
    //atributo
    private String sector;
    //constructor
    public Shop(String address, float squareMeter, int estimatedConstructionTime, float costPerSquareMeter, ArrayList<Employee> listEmployee, String nameWork, String sector) {
        super(address, squareMeter, estimatedConstructionTime, costPerSquareMeter, listEmployee, nameWork);
        this.sector = sector;
    }

    public Shop() {
    }

    //set y get
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Shop ->-> sector = " + sector +super.toString();
    }
}
