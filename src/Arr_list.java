import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arr_list {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
         /*
         Integer is the datatype which is to be stored, here you can only pass wrapper classes, not primitives.
           Even if you include the initial size, you can store the values beyond that.
          */

        //adding elements to list.
        list.add(34);
        list.add(23);
        list.add(34);
        System.out.println(list);
        System.out.println(list.contains(234));
        System.out.println(list.contains(34));
        list.set(0,100);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        //input
        for (int i=0;i<5;i++){
            l.add(in.nextInt());
        }
        //output
        for (int i=0;i<5;i++){
            System.out.println(l.get(i));
        }

    }
}
/*
-------------Internal Working of ArrayLists
->Internally size is fixes.
->If arrayList fills by some amount, a new empty list of more size is created and the elements of old list
are copied into new list and old list is then deleted.

 */
