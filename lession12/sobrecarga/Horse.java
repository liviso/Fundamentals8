package lession12.sobrecarga;

public class Horse extends Animal {
 
//    @Override
//    public void eat() {
//        System.out.println("El caballo come");
//    }

  
   public void eat(String comida) {
      System.out.println("El caballo come " + comida);     
    }
   
   public void eat(int cantidad, String comida){
       System.out.println("El caballo come " + cantidad+" kg de "+comida);
   }
   
   public void eat(int cantidad, String ... var){
       System.out.println("1) "+var[0]);
       System.out.println("2) "+var[1]);
   }
}

class TestHorse {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
//        h.eat("Pastura");
//        h.eat(2, "Pastura");
//        h.eat(2, "Alfalfa", "Maiz");

        Animal horse = new Horse();
        
       
        if (horse instanceof Animal) {
            System.out.println("horse pertenece a la clase Animal");
            
        } else {
            System.out.println("horse no pertenece a la clase Animal");
        }
    }
}
