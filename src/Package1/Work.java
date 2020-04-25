package Package1;

import java.util.ArrayList;


//hice work abstract porque todas las obra tienen q tener una asignacion , domestica , comercios o hoteles
public abstract class Work {

    //atributos
    private String address;
    private float squareMeter;
    private int estimatedConstructionTime;
    private float costPerSquareMeter;
    private ArrayList<Employee> listEmployee;

    //constructores
    public Work(String address, float squareMeter, int estimatedConstructionTime, float costPerSquareMeter, ArrayList<Employee> listEmployee) {
        this.address = address;
        this.squareMeter = squareMeter;
        this.estimatedConstructionTime = estimatedConstructionTime;
        this.costPerSquareMeter = costPerSquareMeter;
        this.listEmployee = listEmployee;
    }
    public Work(){
    }


    //get y sete
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public float getSquareMeter() {
        return squareMeter;
    }
    public void setSquareMeter(float squareMeter) {
        this.squareMeter = squareMeter;
    }
    public int getEstimatedConstructionTime() {
        return estimatedConstructionTime;
    }
    public void setEstimatedConstructionTime(int estimatedConstructionTime) {
        this.estimatedConstructionTime = estimatedConstructionTime;
    }
    public float getCostPerSquareMeter() {
        return costPerSquareMeter;
    }
    public void setCostPerSquareMeter(float costPerSquareMeter) {
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }
    public void setListEmployee(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    /*public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }
    public void setListEmployee(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }*/

    @Override
    public String toString() {
        return " Work ->-> address = "+address+", squareMeter = "+squareMeter+", estimatedConstructionTime = "+estimatedConstructionTime+", costPerSquareMeter = "+costPerSquareMeter+", listEmployee = "+listEmployee;
    }

/*Para todas las obras se le calcula un precio estimado del total de la obra.
Este cálculo se realiza de la siguiente manera:
     (costo_por_metro * mt2)+(costo_de_empleados * cantidad_dias)
*/

  public float estimatedTotalCost(){
      float salary = 0;
      for (int i=0; i < listEmployee.size(); i++){
          salary += listEmployee.get(i).getCostDaily().getDesc();
      }
      float total = (squareMeter * costPerSquareMeter) + (salary * estimatedConstructionTime);
      return total;
  }

    public static String showEmployee(Work employee){
        String showEmployeeListOfAWork = "";
        for (int i = 0;i<employee.getListEmployee().size();i++){
            showEmployeeListOfAWork += employee.getListEmployee().get(i);
        }
        return showEmployeeListOfAWork;
    }




}
