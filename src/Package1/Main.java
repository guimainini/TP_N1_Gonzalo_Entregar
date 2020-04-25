package Package1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        ArrayList<Work> listWork = new ArrayList<Work>();
        ArrayList<Business> listBusiness = new ArrayList<Business>();


        //A)  Crear instancias de cada tipo de empleado y mostrar el comportamiento de “construir” (para los obreros y maestros) y como es el comportamiento de un arquitecto.
        Architect art = new Architect("Guillermo", "28468194", "154226951",CostDaily.ARCHITECT,"333333");
        Worker wor = new Worker("Renzo","54132123","154333333",CostDaily.WORKER,55);
        ConstructionMaster mas = new ConstructionMaster("Pedro","58456123","154123123",CostDaily.CONSTRUCTIONMASTER,35);
        listEmployee.add(art);
        listEmployee.add(wor);
        listEmployee.add(mas);


        System.out.println(art.toString());
        System.out.println(wor.toString());
        System.out.println(mas.toString());
        System.out.println(wor.build());
        System.out.println(mas.build());
        System.out.println(art.createPlanes());



        //B) Crear una nueva empresa con un nombre y asignarle distintos tipos de empleados. La empresa tiene: nombre, una lista de empleados y las obras realizadas.


        Business busineesOne = new Business("Te construimos hasta la vida",Utility.ArmedTeam(),listWork);

        //System.out.println(businees.getListEmployee());
        /*for(Employee e: businees.getListEmployee()){
            System.out.println(e);
        }*/
        //System.out.println(businees);

        //C) Crear al menos una obra por cada tipo distinto que existe, asignando empleados a la obra.
        // También se pide ejecutar algún método para saber el costo estimado de la obra.


        Work work1 = new Shop("Alberti 2500",500,50,150,Utility.ArmedTeam(),"aldrey","Locales");
        Work work2 = new Hotel("Bulevar y Quintana",1500,365,350,Utility.ArmedTeam(),"Costa Galana modificacion de baños",15);
        Work work3 = new WorkDomestic("Almafuerte 2204",3,90,150,Utility.ArmedTeam(),2);
       /* listWork.add(work1);
        listWork.add(work2);
        listWork.add(work3);


        System.out.println("La primera obra del Local del shopping costara : "+work1.estimatedTotalCost()+" pesos");
        System.out.println("La obra del hotel costara : "+work2.estimatedTotalCost()+" pesos");
        System.out.println("La obra de mi casa costara : "+work3.estimatedTotalCost()+" pesos");

        //D) Se solicita agregar las obras (del punto anterior) a la lista de la empresa.

        listBusiness.add(busineesOne);*/

        /*E) Crear un método para recorrer los empleados que trabajan en una obra. Mostrando por pantalla
        los distintos datos particulares de cada empleado.*/
        System.out.println("\n\n");
        System.out.println(Work.showEmployee(work1));

        /*Juan Manochon: juanaManso.getEmpleadosDeObraX(miCasa);
          [Juan Manochon: por eso digo yo entendi que tenes que traer el listado de empleados de cada obra para poder manipularlos,
          bueno mostrarlos porque no pide mas nada*/

        /*for(int i = 0;i<listBusiness.size();i++){
            for(int j = 0;j<listEmployee.size();j++){
                if(work1 instanceof Work){
                      System.out.println("");
                  }
            }
        }*/


    //F) Crear un método para listar todas las obras por pantalla con el costo de la obra.
     /*   for(int g = 0;g<listWork.size();g++){
            System.out.println(listWork.get(g));
            System.out.println("Esta obra cuesta = "+listWork.get(g).estimatedTotalCost());
        }*/









    }







}
