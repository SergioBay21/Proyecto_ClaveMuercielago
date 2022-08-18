/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editar;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 *
 * @author sergi
 */
public class cortar {
    public static void cortar_txt(String copiar){
        StringSelection ss = new StringSelection(copiar);
        Clipboard cb = (Clipboard) Toolkit.getDefaultToolkit().getSystemClipboard();
        cb.setContents(ss, null);
    }
}
