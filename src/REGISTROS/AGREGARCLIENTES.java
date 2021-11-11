package REGISTROS;

public class AGREGARCLIENTES {
   public String codigo;
   public String dni;
   public String nombre;
   public String telefono;
   public String direccion;

    public AGREGARCLIENTES() {
    }
   
    public AGREGARCLIENTES(String codigo, String dni, String nombre, String telefono, String direccion) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
   
}
