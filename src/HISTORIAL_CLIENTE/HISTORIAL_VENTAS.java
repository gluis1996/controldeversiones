package HISTORIAL_CLIENTE;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class HISTORIAL_VENTAS {
    
    
    public void GuardarVenta(File FicheroHistorial, ArrayList<Nodo_Historial> Nhistorial) {

        try (FileWriter fw = new FileWriter(FicheroHistorial,true);
                PrintWriter pw = new PrintWriter(fw);) {
               
            for (int i = 0; i < Nhistorial.size(); i++) {
                pw.println(
                        Nhistorial.get(i).getCodigo_venta() + ", " + Nhistorial.get(i).getDni() + ", "
                        + Nhistorial.get(i).getDireccion() + ", " + Nhistorial.get(i).getEnvio() + ", "
                        + Nhistorial.get(i).getFEcha() + ", " + Nhistorial.get(i).getPtotal());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Guarar " + e.getMessage());
        }

    }

}
