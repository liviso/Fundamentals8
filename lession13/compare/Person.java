
package lession13.compare;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparator<Person>{
    private String nombre;
    private String dni;

    public Person(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+" Dni: "+this.dni;
    }

    @Override
    public int compare(Person per1, Person per2) {
   if( per1.toString().length() < per2.toString().length()){
       return 1;
   }else if(per1.toString().length()> per2.toString().length()){
       return -1;
   }else
       return 0;
    }
   
}

class TestPerson{
    public static void main(String[] args) {
        
        Person person1= new Person("Oli", "3234");
        Person person2= new Person("Zuri", "1235");
        Person person3= new Person("Bonifacio", "2235");
        Person person4= new Person("Azucena", "3535");
        
        List <Person>person= new ArrayList<>();
        
        
        person.add(person1);
        person.add(person2);
        person.add(person3);
        person.add(person4);
        
        
        Collections.sort(person, person1);
        for(Person personas:person){
            System.out.println(personas);
        }
    }
}