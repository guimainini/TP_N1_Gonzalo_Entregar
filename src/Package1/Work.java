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


    //get y set

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    @Override
    public String toString() {
        return " Work ->-> address = "+address+", squareMeter = "+squareMeter+", estimatedConstructionTime = "+estimatedConstructionTime+", costPerSquareMeter = "+costPerSquareMeter+", listEmployee = "+listEmployee;
    }

/*Para todas las obras se le calcula un precio estimado del total de la obra.
Este cálculo se realiza de la siguiente manera:
     (costo_por_metro * mt2)+(costo_de_empleados * cantidad_dias)*/

    //suma el costo del dia de art master y obrero y hace la cuenta del costo estimado de la obra
  public float estimatedTotalCost(){
      float salary = 0;
      for (int i=0; i < listEmployee.size(); i++){
          salary += listEmployee.get(i).getCostDaily().getDesc();
      }
      float total = (squareMeter * costPerSquareMeter) + (salary * estimatedConstructionTime);
      return total;
  }

  //nuestra la lista de empleados q trabajan
    public static String showEmployee(Work employee){
        String showEmployeeListOfAWork = "";
        for (int i = 0;i<employee.getListEmployee().size();i++){
            showEmployeeListOfAWork += employee.getListEmployee().get(i);

        }
        return showEmployeeListOfAWork;
    }




}
