package REGISTRO_VENTAS;

import java.io.*;
import java.util.ArrayList;

public class GuardarVentas {
    
    String NombreArchivo ;
    
    
    void EscribirVenta(File FicheroVenta,ArrayList<REGITRAS_VENTA_NODO> listaVenta) {
        try (PrintWriter pw = new PrintWriter(FicheroVenta);
                BufferedWriter bw = new BufferedWriter(pw);) {
            for (int i = 0; i < listaVenta.size(); i++) {
                pw.println(
                        listaVenta.get(i).getDni() + ", " + listaVenta.get(i).getNombres() + ", "
                        + listaVenta.get(i).getDireccion() + ", " + listaVenta.get(i).getCodigoProducto() + ", "
                        + listaVenta.get(i).getProducto() + ", " + listaVenta.get(i).getColor() + ", "
                        + listaVenta.get(i).getEnvio() + ", " + listaVenta.get(i).getCantidad() + ", "
                        + listaVenta.get(i).getPrecio_unit() + ", " + listaVenta.get(i).sub_total());
                    
            }
          
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
