package Package1;
/*B) Crear una nueva empresa con un nombre y asignarle distintos tipos de empleados. La empresa
tiene: nombre, una lista de empleados y las obras realizadas.
C) Crear al menos una obra por cada tipo distinto que existe, asignando
Laboratorio de Programación III empleados a la obra. También se pide ejecutar algún método para saber el costo estimado de la obra.
D) Se solicita agregar las obras (del punto anterior) a la lista de la
empresa.
 */

import java.util.ArrayList;

public class Business {
    private String name;
    ArrayList<Employee> listEmployee = new ArrayList<Employee>();
    ArrayList<Work> listWork = new ArrayList<>();

    public Business(String name, ArrayList<Employee> listEmployee, ArrayList<Work> listWork) {
        this.name = name;
        this.listEmployee = listEmployee;
        this.listWork = listWork;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    public ArrayList<Work> getListWork() {
        return listWork;
    }

    @Override
    public String toString() {
        return "Business ->-> name = "+name+", listEmployee = "+listEmployee+", listWork = "+listWork;
    }



}
