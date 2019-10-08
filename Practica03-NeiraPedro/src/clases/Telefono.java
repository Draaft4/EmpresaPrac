package clases;

public class Telefono {
    
    private String numTelef;
    private String tipTelef;

    public String getNumTelef() {
        return numTelef;
    }

    public void setNumTelef(String numTelef) {
        this.numTelef = numTelef;
    }

    public String getTipTelef() {
        return tipTelef;
    }

    public void setTipTelef(String tipTelef) {
        this.tipTelef = tipTelef;
    }

    @Override
    public String toString() {
        return "Telefono{" + "Numero= " + numTelef + ", Tipo de Numero=" + tipTelef + '}';
    }

    public Telefono(String numTelef, String tipTelef) {
        this.numTelef = numTelef;
        this.tipTelef = tipTelef;
    }
    
}
