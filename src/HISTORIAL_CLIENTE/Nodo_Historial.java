package HISTORIAL_CLIENTE;

public class Nodo_Historial {
    String codigo_venta;
    String dni;
    String Direccion;
    String Envio;
    String FEcha;
    Double Ptotal;
    Nodo_Historial siguiente;
    
    public Nodo_Historial(String codigo_venta, String dni, String Direccion, String Envio, String FEcha, Double Ptotal) {
        this.codigo_venta = codigo_venta;
        this.dni = dni;
        this.Direccion = Direccion;
        this.Envio = Envio;
        this.FEcha = FEcha;
        this.Ptotal = Ptotal;
    }

    public String getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(String codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEnvio() {
        return Envio;
    }

    public void setEnvio(String Envio) {
        this.Envio = Envio;
    }

    public String getFEcha() {
        return FEcha;
    }

    public void setFEcha(String FEcha) {
        this.FEcha = FEcha;
    }

    public Double getPtotal() {
        return Ptotal;
    }

    public void setPtotal(Double Ptotal) {
        this.Ptotal = Ptotal;
    }

    public Nodo_Historial getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Historial siguiente) {
        this.siguiente = siguiente;
    }

    
    
    public String toString() {
        return codigo_venta + ", " + dni + ", " + Direccion + ", " + Envio + ", "
                + FEcha + ", " + Ptotal;

    }
}
