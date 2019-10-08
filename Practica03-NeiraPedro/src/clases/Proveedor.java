package clases;

import java.util.Scanner;

public class Proveedor {
    
    private Persona datos2;
    private String linProd;
    
    private Scanner l = new Scanner(System.in);

    public String getLinProd() {
        return linProd;
    }

    public void setLinProd(String linProd) {
        this.linProd = linProd;
    }
    
    public void setDatos(){
        System.out.println("Ingrese el numero de identificacion");
        datos2.setNumId(l.nextInt());
        l.nextLine();
        System.out.println("Ingrese el tipo de identificacion");
        datos2.setTipId(l.nextLine());
        System.out.println("Ingrese el nombre del Empleado");
        datos2.setNombPer(l.nextLine());
        System.out.println("Ingrese el apellido del Empleado");
        datos2.setApePer(l.nextLine());
        String op;
        do{
            datos2.setTelf();
            System.out.println("Desea seguir ingresando numeros? Si/No");
            op = l.nextLine();
        }while(op.equalsIgnoreCase("Si"));
    }
    
    public void showDatos(){
        System.out.println(datos2.toString());
        datos2.showTelef();
    }

    @Override
    public String toString() {
        return "Proveedor{" + "Linea de Productos=" + linProd + '}';
    }

    public Proveedor(String linProd) {
        this.linProd = linProd;
        setDatos();
    }
    
    
}
