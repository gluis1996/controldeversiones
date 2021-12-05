package REGISTRO_VENTAS;

public class REGITRAS_VENTA_NODO {

    String dni, nombres, direccion, codigoProducto, producto, color, envio;
    int cantidad;
    double precio_unit;

    public REGITRAS_VENTA_NODO(String dni, String nombres, String direccion, String codigoProducto, String producto, String color, String envio, int cantidad, double precio_unit) {
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

    public double sub_total() {
        return precio_unit * cantidad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnvio() {
        return envio;
    }

    public void setEnvio(String envio) {
        this.envio = envio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unit() {
        return precio_unit;
    }

    public void setPrecio_unit(double precio_unit) {
        this.precio_unit = precio_unit;
    }


    public String toString() {
        return dni + ", " + nombres + ", " + direccion + ", " + codigoProducto + ", "
                + producto + ", " + color + ", " + envio + ", " + cantidad + ", "
                + precio_unit + ", " + sub_total();

    }
}
