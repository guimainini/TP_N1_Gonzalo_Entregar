package TP_1;

public class Architect extends Employee{
    //Atributos
    private String registrationNumber;

    //constructor
    public Architect(String name, String dni, String tel,CostDaily costDaily,String registrationNumber) {
        super(name, dni, tel,costDaily);
        this.registrationNumber = registrationNumber;
    }


    //metodos set y get no necesite


    @Override
    public String toString() {
        return " ->-> Architect -> registrationNumber = "+ registrationNumber+super.toString();
    }

    public String createPlanes(){
        return "Create Plans";
    }

}
