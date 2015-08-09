package lession9.encapsulacion;

public class Employee {

    private String nombre;
    private double salario;
    private String rfc;

    public Employee() {
    }

    public Employee(String nombre, double salario, String rfc) {
        this.nombre = nombre;
        this.salario = salario;
        this.rfc = rfc;
    }

    public void calcularSalarioNeto() {
        salario = salario - (salario * .10);
    }

    public void calcularSalarioNeto(double salario) {
        this.salario = salario - (salario * .10);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

}
