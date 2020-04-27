package TP_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        ArrayList<Work> listWork = new ArrayList<Work>();
        ArrayList<Business> listBusiness = new ArrayList<Business>();


        //A)  Crear instancias de cada tipo de empleado y mostrar el comportamiento de “construir” (para los obreros y maestros) y como es el comportamiento de un arquitecto.

        Architect art = new Architect("Guillermo", "28468194", "154226951", CostDaily.ARCHITECT, "333333");
        Worker wor = new Worker("Renzo", "54132123", "154333333", CostDaily.WORKER, 55);
        ConstructionMaster mas = new ConstructionMaster("Pedro", "58456123", "154123123", CostDaily.CONSTRUCTIONMASTER, 35);

        listEmployee.add(art);
        listEmployee.add(wor);
        listEmployee.add(mas);

        System.out.println(art.toString());
        System.out.println(wor.toString());
        System.out.println(mas.toString());
        System.out.println(wor.build());
        System.out.println(mas.build());
        System.out.println(art.createPlanes());
        System.out.println();
        //B) Crear una nueva empresa con un nombre y asignarle distintos tipos de empleados. La empresa tiene: nombre, una lista de empleados y las obras realizadas.

        //Utility es una clase aux q me genera arquitectos obreros y Masterwork con las restricciones, Arq 1 , work minimo 2, Master entre 1 a 3

        Business busineesOne = new Business("Te construimos hasta la dentadura de la abuela", Utility.armedTeam(), listWork);

        for (Employee e : busineesOne.getListEmployee()) {
            System.out.println(e);
        }

        //C) Crear al menos una obra por cada tipo distinto que existe, asignando empleados a la obra.
        //   También se pide ejecutar algún método para saber el costo estimado de la obra.

        Work work1 = new Shop("Alberti 2500", 500, 50, 150, Utility.armedTeam(), "aldrey", "Locales");
        Work work2 = new Hotel("Bulevar y Quintana", 1500, 365, 350, Utility.armedTeam(), "Costa Galana modificacion de baños", 15);
        Work work3 = new WorkDomestic("Almafuerte 2204", 3, 90, 150, Utility.armedTeam(), 2);
        listWork.add(work1);
        listWork.add(work2);
        listWork.add(work3);

        System.out.println("\nLa primera obra del Local del shopping costara : " + work1.estimatedTotalCost() + " pesos");
        System.out.println("La obra del hotel costara : " + work2.estimatedTotalCost() + " pesos");
        System.out.println("La obra de mi casa costara : " + work3.estimatedTotalCost() + " pesos");
        System.out.println();

        //D) Se solicita agregar las obras (del punto anterior) a la lista de la empresa.

        //agrego la lista de obras a mi empresa y las muestro
        busineesOne.setListWork(listWork);
        for (Work w : busineesOne.getListWork()) {
            System.out.println(w);
        }
        System.out.println("\n");


       //E) Crear un método para recorrer los empleados que trabajan en una obra. Mostrando por pantalla
       // los distintos datos particulares de cada empleado.

        //estoy mandando una obra para q me los datos de los empleados , hice una funcion estatica en work
        System.out.print(Work.showEmployee(work1));
        System.out.println("\n");

       //F) Crear un método para listar todas las obras por pantalla con el costo de la obra.
        for(int g = 0;g<listWork.size();g++){
            System.out.println(listWork.get(g));
            System.out.println("Esta obra cuesta = "+listWork.get(g).estimatedTotalCost());
        }









    }







}
