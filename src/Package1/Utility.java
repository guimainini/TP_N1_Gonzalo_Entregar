package Package1;

import java.util.ArrayList;
import java.util.Random;

public class Utility {
    static Random rand = new Random(System.nanoTime());
    /*static int genereteRandom(int minimo,int maximo){
        int num = (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }*/



    /* • Solo puede haber UN arquitecto por obra.
       • Mínimo UN maestro mayor y un máximo de tres por obra.
       • No hay límite para los obreros pero al menos debe haber 2.
    */





    public static ArrayList<Employee> ArmedTeam() {
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();

        //Arquitectos
        //genero un numero aleatorio 0 a 2
        int numero = rand.nextInt(3);
        switch (numero){
            case 0: Architect art = new Architect("Guillermo ", "28468194", "154226951", CostDaily.ARCHITECT, "333333");
                    listEmployee.add(art);break;
            case 1: Architect art1 = new Architect("Pedro ", "11111111", "154111111", CostDaily.ARCHITECT, "111111");
                    listEmployee.add(art1);break;
            case 2: Architect art2 = new Architect("Renzo ", "22222222", "154222222", CostDaily.ARCHITECT, "222222");
                listEmployee.add(art2);break;
        }

        //Maestro Mayores de Obra
        //genero un numero aleatorio entre 1 y 3
        int num = (int)Math.floor(Math.random()*(1-(3+1))+(3+1));
        switch (num){
            case 1: ConstructionMaster mas = new ConstructionMaster("Ana ", "444444444", "154444444", CostDaily.CONSTRUCTIONMASTER, 44);
                    listEmployee.add(mas);break;
            case 2: ConstructionMaster mas1 = new ConstructionMaster("Natalia ", "55555555", "154555555", CostDaily.CONSTRUCTIONMASTER, 55);
                    ConstructionMaster mas2 = new ConstructionMaster("Clotilde ", "66666666", "154666666", CostDaily.CONSTRUCTIONMASTER, 66);
                    listEmployee.add(mas1);listEmployee.add(mas2);break;
            case 3: ConstructionMaster mas3 = new ConstructionMaster("Natalia ", "55555555", "154555555", CostDaily.CONSTRUCTIONMASTER, 55);
                    ConstructionMaster mas4 = new ConstructionMaster("Clotilde ", "66666666", "154666666", CostDaily.CONSTRUCTIONMASTER, 66);
                    ConstructionMaster mas5 = new ConstructionMaster("Ana ", "444444444", "154444444", CostDaily.CONSTRUCTIONMASTER, 44);
                    listEmployee.add(mas3);listEmployee.add(mas4);listEmployee.add(mas5);break;
        }

        //Obreros
        //genero un numero aleatorio entre 2 y 5 supe ese maximo
        int num2 = (int)Math.floor(Math.random()*(2-(5+1))+(5+1));
        switch (num2){
            case 2: Worker wor = new Worker("Facu ", "54777777", "154777777", CostDaily.WORKER, 55);
                    Worker wor22 = new Worker("Nicolas ", "54121212", "154121212", CostDaily.WORKER, 55);
                listEmployee.add(wor);listEmployee.add(wor22);break;
            case 3:Worker wor2 = new Worker("Facu ", "54777777", "154777777", CostDaily.WORKER, 55);
                Worker wor3 = new Worker("Mano ", "54888888", "154888888", CostDaily.WORKER, 55);
                Worker wor333 = new Worker("Nicolas ", "54121212", "154121212", CostDaily.WORKER, 55);
                listEmployee.add(wor2);listEmployee.add(wor3);listEmployee.add(wor333);break;
            case 4:Worker wor4 = new Worker("Facu ", "54777777", "154777777", CostDaily.WORKER, 55);
                Worker wor5 = new Worker("Mano ", "54888888", "154888888", CostDaily.WORKER, 55);
                Worker wor6 = new Worker("Juan ", "54999999", "154999999", CostDaily.WORKER, 55);
                Worker wor6666 = new Worker("Nicolas ", "54121212", "154121212", CostDaily.WORKER, 55);
                listEmployee.add(wor4);listEmployee.add(wor5);listEmployee.add(wor6);listEmployee.add(wor6666);break;
            case 5:Worker wor7 = new Worker("Facu ", "54777777", "154777777", CostDaily.WORKER, 55);
                Worker wor8 = new Worker("Mano ", "54888888", "154888888", CostDaily.WORKER, 55);
                Worker wor9 = new Worker("Juan ", "54999999", "154999999", CostDaily.WORKER, 55);
                Worker wor10 = new Worker("Maxi ", "54000000", "154000000", CostDaily.WORKER, 55);
                Worker wor1010 = new Worker("Nicolas ", "54121212", "154121212", CostDaily.WORKER, 55);
                listEmployee.add(wor7);listEmployee.add(wor8);listEmployee.add(wor9);listEmployee.add(wor10);listEmployee.add(wor1010);break;
        }


return listEmployee;
}

}
