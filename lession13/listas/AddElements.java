package lession13.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddElements {

    public static void main(String[] args) {
        List listA = new ArrayList();

        listA.add("element 0");
        listA.add("element 1");
        listA.add("element 2");
        
        System.out.println("Accesando por el indice\n");
        //access via index
        System.out.println(listA.get(0));
        System.out.println(listA.get(1));
        System.out.println(listA.get(2));

        //access via Iterator
        System.out.println("\nUsando Iterator\n");
        Iterator iterator = listA.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }

        System.out.println("\nUsando for-each\n");
        //access via new for-loop
        for (Object object : listA) {
            String element = (String) object;
            System.out.println(element);
        }
        
        for(int i=0; i < listA.size(); i++) {
        Object obj = listA.get(i);
        }
        
        System.out.println("tamaño: "+listA.size());
       // listA.clear();
        
        listA.remove(0);
        System.out.println("tamaño: "+listA.size());
    }
}
