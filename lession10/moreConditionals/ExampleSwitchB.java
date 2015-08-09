package lession10.moreConditionals;

public class ExampleSwitchB {

    public static void main(String[] args) {

        int x = 1;
        switch (x) {
            case 1:
                System.out.println("x is one");
                defautl:
                System.out.println("Soy default");

            case 2:
                System.out.println("x is two");

            case 3:
                System.out.println("x is three");
                break;

        }
        System.out.println("out of the switch");

    }
}
