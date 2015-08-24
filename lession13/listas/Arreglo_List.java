package lession13.listas;

import java.util.Arrays;
import java.util.List;

public class Arreglo_List {

    public static void main(String[] args) {
        String[] nums = {"one", "two", "three"};
        List<String> myList = Arrays.asList(nums);

        for (String numero : myList) {
            System.out.println(numero);
        }

    }
}
