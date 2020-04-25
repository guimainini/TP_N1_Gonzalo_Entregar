package Package1;

public class Architect extends Employee{
    //Atributos
    private String registrationNumber;
    private CostDaily costDaily;

    //constructor
    public Architect(String name, String dni, String tel,CostDaily costDaily,String registrationNumber) {
        super(name, dni, tel,costDaily);
        this.registrationNumber = registrationNumber;
    }
    public Architect(){
        super();
    }


    //metodos set y get
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return " ->-> Architect -> registrationNumber = "+ registrationNumber+super.toString();
    }

    public String createPlanes(){
        return "Crear Planos";
    }

}
