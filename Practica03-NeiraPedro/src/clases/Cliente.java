package clases;

import java.util.Scanner;

public class Cliente {
    
    private Persona datos = new Persona();
    private double cupCred;
    private boolean afiliado;
    
    Scanner l = new Scanner(System.in);

    public double getCupCred() {
        return cupCred;
    }

    public void setCupCred(double cupCred) {
        this.cupCred = cupCred;
    }

    public boolean isAfiliado() {
        return afiliado;
    }

    public void setAfiliado(boolean afiliado) {
        this.afiliado = afiliado;
    }
    
    public void setDatos(){
        System.out.println("Ingrese el numero de identificacion");
        datos.setNumId(l.nextInt());
        l.nextLine();
        System.out.println("Ingrese el tipo de identificacion");
        datos.setTipId(l.nextLine());
        System.out.println("Ingrese el nombre del Cliente");
        datos.setNombPer(l.nextLine());
        System.out.println("Ingrese el apellido del Cliente");
        datos.setApePer(l.nextLine());
        String op;
        do{
            datos.setTelf();
            System.out.println("Desea seguir ingresando numeros? Si/No");
            op = l.nextLine();
        }while(op.equalsIgnoreCase("Si"));
    }
    
    public void showDatos(){
        System.out.println(datos.toString());
        datos.showTelef();
    }

    @Override
    public String toString() {
        return "Cliente{" + "Cupo de Credito=" + cupCred + ", Afiliado=" + afiliado + '}';
    }

    public Cliente(double cupCred, boolean afiliado) {
        this.cupCred = cupCred;
        this.afiliado = afiliado;
        setDatos();
    }
            
}
