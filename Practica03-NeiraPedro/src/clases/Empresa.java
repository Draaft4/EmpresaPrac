package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

    private ArrayList<Cliente> listClient = new ArrayList();
    private ArrayList<Proveedor> listProv = new ArrayList();
    private ArrayList<Empleado> listEmpl = new ArrayList();
    private String rucEmpr;
    private String razSocial;
    private String dirEmpr;

    private Scanner l = new Scanner(System.in);

    public String getRucEmpr() {
        return rucEmpr;
    }

    public void setRucEmpr(String rucEmpr) {
        this.rucEmpr = rucEmpr;
    }

    public String getRazSocial() {
        return razSocial;
    }

    public void setRazSocial(String razSocial) {
        this.razSocial = razSocial;
    }

    public String getDirEmpr() {
        return dirEmpr;
    }

    public void setDirEmpr(String dirEmpr) {
        this.dirEmpr = dirEmpr;
    }

    public void setCliente() {
        System.out.println("Ingrese el cupo de credito del Cliente");
        double cup = l.nextDouble();
        l.nextLine();
        System.out.println("EL cliente es afiliado? Si/No");
        String var = l.nextLine();
        boolean afl;
        if (var.equalsIgnoreCase("Si")) {
            afl = true;
        } else {
            afl = false;
        }
        listClient.add(new Cliente(cup, afl));
    }

    public void showCliente() {
        System.out.println("Cliente/s:");
        System.out.println("***********************************************");
        for (int i = 0; i < listClient.size(); i++) {
            listClient.get(i).showDatos();
            System.out.println(listClient.get(i).toString());
            System.out.println("***********************************************");
        }
    }

    public void setProveedor() {
        System.out.println("Ingrese la linea de productos del Proveedor");
        String lin = l.nextLine();
        listProv.add(new Proveedor(lin));
    }

    public void showProveedor() {
        System.out.println("Proveedor/es:");
        System.out.println("**********************************************");
        for (int i = 0; i < listProv.size(); i++) {
            listProv.get(i).showDatos();
            System.out.println(listProv.get(i).toString());
            System.out.println("***********************************************");
        }
    }
    
    public void setEmpleado(){
        System.out.println("Ingrese el cargo del empleado");
        String carg = l.nextLine();
        System.out.println("Ingrese el salario del empleado");
        double sal = l.nextDouble();
        l.nextLine();
        listEmpl.add(new Empleado(carg,sal));
    }
    
    public void showEmpl(){
        System.out.println("Empleado/s:");
        System.out.println("***********************************************");
        for (int i = 0; i < listEmpl.size(); i++) {
            listEmpl.get(i).showDatos();
            System.out.println(listEmpl.toString());
            System.out.println("***********************************************");
        }
    }

    @Override
    public String toString() {
        return "Empresa{" + "RUC=" + rucEmpr + ", Razon Social=" + razSocial 
                + ", Direccion=" + dirEmpr + '}';
    }
    

    public Empresa(String rucEmpr, String razSocial, String dirEmpr) {
        this.rucEmpr = rucEmpr;
        this.razSocial = razSocial;
        this.dirEmpr = dirEmpr;
        String op;
        do{
            setCliente();
            System.out.println("Desea seguir ingresando clientes? Si/No");
            op = l.nextLine();
        }while(op.equalsIgnoreCase("Si"));
        op="";
        do{
           setEmpleado();
            System.out.println("Desea seguir ingresando empleados? Si/No");
            op = l.nextLine();
        }while(op.equalsIgnoreCase("Si"));
        op="";
        do{
           setProveedor();
            System.out.println("Desea seguir ingresando proveedores? Si/No");
            op = l.nextLine();
        }while(op.equalsIgnoreCase("Si"));
    }     

    public double totCred() {
        return 0;
    }

    public double nominEmp() {
        return 0;
    }

}
