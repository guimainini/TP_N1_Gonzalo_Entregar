package Package1;

public class ConstructionMaster extends Employee implements Build{
    //atributos
    private int age;
    private int costDaily;

    //constructores
    public ConstructionMaster(String name, String dni, String tel,CostDaily costDaily, int age) {
        super(name, dni, tel,costDaily);
        this.age = age;
        this.costDaily = 1800;
    }
    public ConstructionMaster() {
        super();
    }
    //set y get
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " ->-> ConstructionMaster -> age = " +age+super.toString();
    }


    @Override
    public String build() {
        return "Soy maestro y superviso las construcciones";
    }
}
