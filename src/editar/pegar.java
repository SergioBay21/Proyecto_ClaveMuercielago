/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editar;


import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Toolkit;

/**
 *
 * @author sergi
 */
public class pegar {

    public static String pegar_txt() throws UnsupportedFlavorException{
        String resultado = "";
        Clipboard cb = (Clipboard) Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contenido = cb.getContents(null);
        if (contenido.isDataFlavorSupported(DataFlavor.stringFlavor)){
            try {
                resultado = (String) contenido.getTransferData(DataFlavor.stringFlavor);
            } catch (IOException ex) {
                Logger.getLogger(pegar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultado;
    }
}
