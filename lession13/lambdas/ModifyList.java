package lession13.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ModifyList {
    public static void main(String[] args) {
        String[] names = {"Ned", "Fred", "Jessie", "Alice", "Rick"};
        List<String> myList = new ArrayList(Arrays.asList(names));

       // System.out.println("Before replaceAll " + myList);

       // myList.replaceAll(s -> s.toUpperCase());
      //  System.out.println("List. replaceAll lambda: " + myList);
         
        myList.removeIf(s -> s.equals("Alice"));
        System.out.println("myList: " + myList+ " \nsize: "+myList.size());
         
        myList.removeIf(s ->s.length()>5);
        System.out.println("myList: " + myList);
    }
}
