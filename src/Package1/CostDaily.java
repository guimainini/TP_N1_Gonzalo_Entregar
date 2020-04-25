package Package1;

public enum CostDaily
{
    ARCHITECT(2000),WORKER(1500),CONSTRUCTIONMASTER(1800);

    private final float desc;
    //constructor
    private CostDaily(float desc){
        this.desc = desc;
    }

    //para devolver el valor que tiene adentro
    public float getDesc(){
        return desc;
    }


}






