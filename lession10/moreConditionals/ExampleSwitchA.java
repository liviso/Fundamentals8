package lession10.moreConditionals;

public class ExampleSwitchA {

    public static void main(String[] args) {
        int x = 1000;
        switch (x) {
            case 1:
                System.out.println("x is one");
            case 2:
                System.out.println("x is two");
                break;
            case 3:
                System.out.println("x is three");
                break;
            default:
                System.out.println("Valor incorrecto");

        }
        System.out.println("out of the switch");
    }
}
