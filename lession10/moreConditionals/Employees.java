package lession10.moreConditionals;

public class Employees {

    //public String name1 = "Fred Smith";
    // public String name2 = "Fred Smith";
    public String name1 = new String("Fred Smith");
    public String name2 = new String("Fred Smith");

    public void areNamesEqual() {
        if (name1 == name2) { //name1.equalsIgnoreCase(name2)   name1 == name2

            System.out.println("Same name.");
        } else {
            System.out.println("Different name.");
        }
    }

    public static void main(String[] args) {
        new Employees().areNamesEqual();
    }
}
