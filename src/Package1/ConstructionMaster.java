package Package1;

public class ConstructionMaster extends Employee implements Build{
    //atributos
    private int age;


    //constructores
    public ConstructionMaster(String name, String dni, String tel,CostDaily costDaily, int age) {
        super(name, dni, tel,costDaily);
        this.age = age;
    }

    //set y get no necesite


    @Override
    public String toString() {
        return " ->-> ConstructionMaster -> age = " +age+super.toString();
    }


    @Override
    public String build() {
        return "Soy maestro y superviso las construcciones";
    }
}
