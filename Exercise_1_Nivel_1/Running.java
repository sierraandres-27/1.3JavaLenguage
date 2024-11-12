package Exercise_1_Nivel_1;

import java.util.*;

import Exercise_1_Nivel_1.Models.Month;

public class Running {

    public static void start () {

        ArrayList<Month>Months=new ArrayList<Month>();

        Months.add(new Month("January"));
        Months.add(new Month("Fabruary"));
        Months.add(new Month("March"));
        Months.add(new Month("April"));
        Months.add(new Month("May"));
        Months.add(new Month("June"));
        Months.add(new Month("July"));
        Months.add(new Month("Empty month"));
        Months.add(new Month("September"));
        Months.add(new Month("October"));
        Months.add(new Month("November"));
        Months.add(new Month("December"));
        Months.add(new Month("December"));

        Months.set(7,new Month("August"));



        for (Month m:Months){

            System.out.println(m.Dame_nombre());
        }

        //converting the arraylist to hashset and proving that not admit two equals

        //first add a second month called december

        Set<Month> noduplicates =new HashSet<>(Months);



        System.out.println("Now you can see the hashset wihout duplicates");

        //proof that does not admit duplicates items

        for (Month m2 : noduplicates){

            System.out.println(m2.Dame_nombre());
        }

        System.out.println("now we will see the list through an itarator");

        Iterator<Month> it=noduplicates.iterator();

        while (it.hasNext()){

            System.out.println(it.next().Dame_nombre());

        }





    }
}
