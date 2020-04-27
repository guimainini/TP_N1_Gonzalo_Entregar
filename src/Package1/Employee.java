package Package1;

public class Employee {
    //atributos
    private String name;
    private String dni;
    private String tel;
    private CostDaily costDaily;


    //constructor
    public Employee (String name,String dni,String tel,CostDaily costDaily){
        this.name = name;
        this.dni = dni;
        this.tel = tel;
        this.costDaily = costDaily;
    }
    public Employee (){
    }

    //metodos set y get
    public CostDaily getCostDaily() {
        return costDaily;
    }


    @Override
    public String toString() {
        return " ///// Employee -> name = "+name+", dni = "+dni+", tel = "+tel+", costDaily = "+costDaily.getDesc();
    }


}
