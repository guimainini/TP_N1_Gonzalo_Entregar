package Package1;

import java.util.ArrayList;

//hice workcomercial abstract porque no voy a crear ningun objeto de esta clase , solo comercios o hoteles
public abstract class WorkCommercial extends Work{
    //atributos
    private String nameWork;


    //constructores
    public WorkCommercial(String address, float squareMeter, int estimatedConstructionTime, float costPerSquareMeter, ArrayList<Employee> listEmployee, String nameWork) {
        super(address, squareMeter, estimatedConstructionTime, costPerSquareMeter, listEmployee);
        this.nameWork = nameWork;
    }
    public WorkCommercial() {
    }

    //set y get
    public String getNameWork() {
        return nameWork;
    }
    public void setNameWork(String nameWork) {
        this.nameWork = nameWork;
    }

    @Override
    public String toString() {
        return "WorkCommercial ->-> nameWork = "+nameWork+super.toString();
    }
}
