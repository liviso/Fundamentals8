package tarea3;

public class Ejercicio5 {

    public void primer() {
        boolean isHappy = true;
        String mood = "";

        mood = (isHappy == true) ? "I`m Happy" : "I`m Sad";
        System.out.println(mood);
    }

    int median2(int a, int b, int c) {
        if (a < b) {
            return (b < c) ? b : (a < c) ? c : a;
        }
        return (a < c) ? a : (b < c) ? c : b;
    }

}
