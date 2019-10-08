package principal;

import clases.Empresa;
import java.util.Scanner;

public class Principal {
    
    private static Scanner l = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingrese el RUC de la Empresa");
        String ruc = l.nextLine();
        System.out.println("Ingrese la razon social de la Empresa");
        String raz = l.nextLine();
        System.out.println("Ingrese la direccion de la Empresa");
        String dir = l.nextLine();
        
        Empresa emp = new Empresa(ruc,raz,dir);
        
        System.out.println(emp.toString());
        emp.showCliente();
        emp.showEmpl();
        emp.showProveedor();
    }
    
}
