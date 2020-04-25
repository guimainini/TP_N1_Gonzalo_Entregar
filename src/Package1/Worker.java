package Package1;

public class Worker extends Employee implements Build{
    //atributos
    private int age;

    //constructores
    public Worker(String name, String dni, String tel,CostDaily costDaily ,int age) {
        super(name, dni, tel,costDaily);
        this.age = age;
    }
    public Worker() {
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
        return " ->-> Worker -> age = "+age+super.toString();
    }


    @Override
    public String build() {
        return "Soy obrero y construyo";
    }

}




