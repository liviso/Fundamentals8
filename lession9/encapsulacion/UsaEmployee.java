package lession9.encapsulacion;

public class UsaEmployee {

    public static void main(String[] args) {
        Employee ramon = new Employee("Ramon Morales", 40_000, "RAMO941110MMC");
        System.out.println("Nombre empleado: " + ramon.getNombre());
        System.out.println("Su salario total es: " + ramon.getSalario());
        System.out.println("Su RFC es: " + ramon.getRfc());

        ramon.calcularSalarioNeto();
        System.out.println("El salario del que usted dispones para gastar es: "
                + ramon.getSalario());

        Employee rosa = new Employee();
        rosa.setNombre("Rosa Castillo");
        rosa.setSalario(1200);
        rosa.setRfc("ROSA941110MMC");

        System.out.println("Nombre empleado: " + rosa.getNombre());
        System.out.println("Su salario es: " + rosa.getSalario());
        rosa.calcularSalarioNeto(rosa.getSalario());
        System.out.println("El salario del que usted dispones para gastar es:"
                + rosa.getSalario());
    }
}
