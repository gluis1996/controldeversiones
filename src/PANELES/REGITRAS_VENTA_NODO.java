package PANELES;

public class REGITRAS_VENTA_NODO {
    String dni, nombres, direccion,producto,color,envio;
    int cantidad;
    REGISTRO_VENTAS siguiente;

    public REGITRAS_VENTA_NODO(String dni, String nombres, String direccion, String producto, String color, String envio, int cantidad, REGISTRO_VENTAS siguiente) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
        this.producto = producto;
        this.color = color;
        this.envio = envio;
        this.cantidad = cantidad;
        this.siguiente = siguiente;
    }
    
    public double sub_total(){
        
        return 0;
    }
    
    
}
