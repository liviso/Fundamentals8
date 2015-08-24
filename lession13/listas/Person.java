
package lession13.listas;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable{
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
    public int compareTo(Object t) {
        return this.nombre.compareTo(((Person)t).getNombre());
    }
   
}

class TestPerson{
    public static void main(String[] args) {
        
        Person person1= new Person("Olivia", "3234");
        Person person2= new Person("Zuriel", "1235");
        Person person3= new Person("Bonifacio", "2235");
        Person person4= new Person("Azucena", "3535");
        
        List <Person>person= new ArrayList<>();
        
        
        person.add(person1);
        person.add(person2);
        person.add(person3);
        person.add(person4);
        
        
        Collections.sort(person);
      //  Collections.sort(person, (Person p1, Person p2)->p1.getNombre().compareTo(p2.getNombre()));
        for(Person personas:person){
            System.out.println(personas);
        }
    }
}