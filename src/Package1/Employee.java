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
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public CostDaily getCostDaily() {
        return costDaily;
    }
    public void setCostDaily(CostDaily costDaily) {
        this.costDaily = costDaily;
    }



    @Override
    public String toString() {
        return " ///// Employee -> name = "+name+", dni = "+dni+", tel = "+tel+", costDaily = "+costDaily.getDesc();
    }


}
