package Vendedores;

public class NodoV {
    
    String codigo,nombre,fnaci,dni,contra,usuario;
    NodoV siguiente;

    public NodoV(String codigo, String nombre, String fnaci, String dni, String contra, String usuario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fnaci = fnaci;
        this.dni = dni;
        this.contra = contra;
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFnaci() {
        return fnaci;
    }

    public void setFnaci(String fnaci) {
        this.fnaci = fnaci;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
    
    
}
