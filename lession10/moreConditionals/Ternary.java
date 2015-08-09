package lession10.moreConditionals;

public class Ternary {

    public static void main(String[] args) {
        int x = 4;
        int y = 9;
        int z;

        z = ((y / x) < 3) ? (x += y) : (x *= y);
        System.out.println(z);

    }
}
