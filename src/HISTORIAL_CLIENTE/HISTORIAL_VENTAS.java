package HISTORIAL_CLIENTE;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class HISTORIAL_VENTAS {

    protected Nodo_Historial inicio, fin;

    public HISTORIAL_VENTAS() {
        inicio = null;
        fin = null;
    }

   /* public void agregarnodo(String codigo_venta, String dni, String Direccion, String Envio, String FEcha, Double Ptotal) {
        inicio = new Nodo_Historial(codigo_venta, dni, Direccion, Envio, FEcha, Ptotal, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }*/

         public Nodo_Historial insertarAlInicio(String codigo_venta, String dni, String Direccion, String Envio, String FEcha, Double Ptotal) {
        Nodo_Historial nuevo = new Nodo_Historial(codigo_venta, dni, Direccion, Envio, FEcha, Ptotal);
        nuevo.siguiente = inicio;
        inicio = nuevo;
        return inicio;
    }
        
    public String mostrarDatos() {
        Nodo_Historial recorrer = inicio;
        String fila = "";
        while (recorrer != null) {
            fila = recorrer.getCodigo_venta() + " " + recorrer.getDni() + " " + recorrer.getDireccion()
                    + " " + recorrer.getEnvio() + " " + recorrer.getFEcha() + " " + recorrer.getPtotal();
            recorrer = recorrer.siguiente;
        }
        return fila;
    }

    
    public void GuardarVenta(File FicheroHistorial, ArrayList<Nodo_Historial> Nhistorial) {

        try {
            try (PrintWriter pw = new PrintWriter(FicheroHistorial);
                    BufferedWriter bw = new BufferedWriter(pw);) {
                for (int i = 0; i < Nhistorial.size(); i++) {
                    pw.println(
                            Nhistorial.get(i).getCodigo_venta() + ", " + Nhistorial.get(i).getDni() + ", "
                            + Nhistorial.get(i).getDireccion() + ", " + Nhistorial.get(i).getEnvio() + ", "
                            + Nhistorial.get(i).getFEcha() + ", " + Nhistorial.get(i).getPtotal());
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
        }

    }

}
