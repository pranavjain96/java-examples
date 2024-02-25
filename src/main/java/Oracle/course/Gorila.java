package Oracle.course;

public class Gorila{
    private float height;
    private float weight;
    private static float sumHeight;
    private static float sumWeight;
    private static int noOfGorillas;

    public Gorila(float height, float weight){
        this.height=height;
        this.weight=weight;
        Gorila.sumHeight+=height;
        Gorila.sumWeight+=weight;
        Gorila.noOfGorillas++;
    }

    public static float getAverageHeight(){
        return (Gorila.sumHeight / Gorila.noOfGorillas);
    }

    public static float getAverageWeight(){
        return (Gorila.sumWeight / Gorila.noOfGorillas);
    }

    public String toString(){
        return "Height: " + this.height + "\n" + "Weight: " + this.weight;
    }

    public static void main(String[] args){
        Gorila gorilla1 = new Gorila(1.8F,180);
        Gorila gorilla2 = new Gorila(1.6F,220);
        System.out.println(gorilla1.getAverageHeight());
        System.out.println(gorilla2.getAverageWeight());
    }
}