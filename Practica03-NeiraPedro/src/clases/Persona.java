package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    
    private int numId;
    private String tipId;
    private String nombPer;
    private String apePer;
    
    private ArrayList<Telefono> listTelef = new ArrayList();
    private Scanner l = new Scanner(System.in);

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getTipId() {
        return tipId;
    }

    public void setTipId(String tipId) {
        this.tipId = tipId;
    }

    public String getNombPer() {
        return nombPer;
    }

    public void setNombPer(String nombPer) {
        this.nombPer = nombPer;
    }

    public String getApePer() {
        return apePer;
    }

    public void setApePer(String apePer) {
        this.apePer = apePer;
    }
    
    public void setTelf(){
        System.out.println("Ingrese el numero de telefono");
        String num = l.nextLine();
        System.out.println("Ingrese el tipo de numero ingresado");
        String tip = l.nextLine();
        listTelef.add(new Telefono(num,tip));
    }
    
    public void showTelef(){
        System.out.println("Numero/s de Telefono/s:");
        for (int i = 0; i < listTelef.size(); i++) {
            System.out.println("Numero: "+listTelef.get(i).getNumTelef()+
                    "\tTipo de Numero: "+listTelef.get(i).getTipTelef());
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "Numero de identificaion=" + numId + ", Tipo de doc. de Identidad=" 
                + tipId + ", Nombre=" + nombPer + ", Apellido=" + apePer + '}';
    }    
        
}
