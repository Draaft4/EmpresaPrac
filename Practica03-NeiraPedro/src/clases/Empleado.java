package clases;

import java.util.Scanner;

public class Empleado {
    
    private Persona datos1;
    private String cargEmpl;
    private double salarioEmpl;
    
    private Scanner l = new Scanner(System.in);

    public String getCargEmpl() {
        return cargEmpl;
    }

    public void setCargEmpl(String cargEmpl) {
        this.cargEmpl = cargEmpl;
    }

    public double getSalarioEmpl() {
        return salarioEmpl;
    }

    public void setSalarioEmpl(double salarioEmpl) {
        this.salarioEmpl = salarioEmpl;
    }
    
    public void setDatos(){
        System.out.println("Ingrese el numero de identificacion");
        datos1.setNumId(l.nextInt());
        System.out.println("Ingrese el tipo de identificacion");
        datos1.setTipId(l.nextLine());
        System.out.println("Ingrese el nombre del Empleado");
        datos1.setNombPer(l.nextLine());
        System.out.println("Ingrese el apellido del Empleado");
        datos1.setApePer(l.nextLine());
        String op;
        do{
            datos1.setTelf();
            System.out.println("Desea seguir ingresando numeros? Si/No");
            op = l.nextLine();
        }while(op.equalsIgnoreCase("Si"));
    }
    
    public void showDatos(){
        System.out.println(datos1.toString());
        datos1.showTelef();
    }

    @Override
    public String toString() {
        return "Empleado{" + "Cargo=" + cargEmpl + ", Salario=" + salarioEmpl + '}';
    }

    public Empleado(String cargEmpl, double salarioEmpl) {
        this.cargEmpl = cargEmpl;
        this.salarioEmpl = salarioEmpl;
        setDatos();
    }
    
    
}
