package Oracle.course;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewMain {
    public static void main(String[] args){
        System.out.printf("The value of PI is: %.2f",Math.PI);
        float weight = 180;
        int x=0;  // Line 4

        do{       // Line 3
            System.out.println(++x);  // Line 5
        }while(x<=5);   // Line 6
        String animal = new String("tiger");
        short i=0;
        switch (i){
            case 0:
                System.out.println("Of African origin");
            default:
                System.out.println("Unsure of origin");
            case 1:
                System.out.println("Of South American Origin");
            case 3:
                System.out.println("Of Australian Origin");
        }

        float f = 99.39f;
        float g = -99.39f;
        float h = 3;

        String famousFive[] = new String [] {"Timmy","Julian", "Dick","George","Ann", null};
        System.out.println("There are " + famousFive.length + " members of the gang.");
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("Duke"));
        list.add(new String("Labby"));
        list.add("Podge");

        for(Object o:list){
            System.out.print(o + " ");
        }
    }
}

class Cat{
    String name = "Tabby";

    public String toString(){
        return name;
    }
}

class Dog{
    String name = "Pup";

    public String toString(){
        return name;
    }


}// class



