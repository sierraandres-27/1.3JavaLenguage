package Exercise_2_Nivel1;

import java.util.*;

public class IntegerArraylist {

    public static void start    () {


    ArrayList<Integer>numero1=new ArrayList<Integer>();

    numero1.add(1);
    numero1.add(2);
    numero1.add(3);
    numero1.add(4);
    numero1.add(5);
    numero1.add(6);
    numero1.add(7);
    numero1.add(8);
    numero1.add(9);
    numero1.add(10);

    for(Integer list1:numero1){

        System.out.println(list1);
    }


        System.out.println("Now we will fill se second list and print it");

    ArrayList<Integer>numero2=new ArrayList<Integer>();

    ListIterator<Integer>it=numero1.listIterator(numero1.size());

    while (it.hasPrevious()){

        numero2.add(it.previous());

    }

    for (Integer list2:numero2){

        System.out.println(list2);
    }


}

}
