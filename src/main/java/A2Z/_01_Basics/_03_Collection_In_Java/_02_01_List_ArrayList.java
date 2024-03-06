package A2Z._01_Basics._03_Collection_In_Java;

import java.util.ArrayList;
import java.util.Iterator;

public class _02_01_List_ArrayList {

/*
    The Important Points About ArrayList are :
        * ArrayList class are resizeable array or growable array
        * ArrayList class can contain duplicate elements.
        * ArrayList class maintains insertion order.
        * ArrayList class is "not" synchronized.
        * ArrayList class allows random access as it works on index basis.
        * ArrayList class allows heterogeneous object.
        * Null Insertion is Possible.
 */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango"); // adding in list
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);

        // using iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // using for loop
        for(String fruit:list){
            System.out.println(fruit);
        }


    }
}
