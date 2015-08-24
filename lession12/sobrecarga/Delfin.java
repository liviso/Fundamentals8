
package lession12.sobrecarga;

public class Delfin{
    public void nombre() {
        System.out.println(new Animal().nombre);
    }
    public static void main(String[] args) {
        new Delfin().nombre();
    }
}
