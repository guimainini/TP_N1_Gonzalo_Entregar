package TP_1;

public class Worker extends Employee implements Build{
    //atributos
    private int age;

    //constructores
    public Worker(String name, String dni, String tel,CostDaily costDaily ,int age) {
        super(name, dni, tel,costDaily);
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




