package HISTORIAL_CLIENTE;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class HISTORIAL_VENTAS {
    
    public void GuardarVenta (File FicheroHistorial,ArrayList <Nodo_Historial> Nhistorial){
    
        try {
             try (PrintWriter pw = new PrintWriter(FicheroHistorial);
                BufferedWriter bw = new BufferedWriter(pw);) {
            for (int i = 0; i < Nhistorial.size(); i++) {
                pw.println(
                        Nhistorial.get(i).getCodigo_venta() + ", " + Nhistorial.get(i).getDni()+ ", "
                        + Nhistorial.get(i).getDireccion()+ ", " + Nhistorial.get(i).getEnvio()+ ", "
                        + Nhistorial.get(i).getFEcha()+ ", " + Nhistorial.get(i).getPtotal());
            }
          
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        } catch (Exception e) {
        }
    
    }
    
}
