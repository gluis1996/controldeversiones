package REGISTRO_VENTAS;


public class REGITRAS_VENTA_NODO {
    String dni, nombres, direccion,codigoProducto,producto,color,envio;
    int cantidad;
    double precio_unit;
    REGITRAS_VENTA_NODO siguiente;
    
    public REGITRAS_VENTA_NODO(String dni, String nombres, String direccion,String codigoProducto, String producto, String color, String envio, int cantidad, double precio_unit) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
        this.codigoProducto = codigoProducto;
        this.producto = producto;
        this.color = color;
        this.envio = envio;
        this.cantidad = cantidad;
        this.precio_unit = precio_unit;
    }
    
        
    public double sub_total(){
        return  precio_unit*cantidad;
    }
    
}
