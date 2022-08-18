/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editar;

import java.awt.Color;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

/**
 *
 * @author sergi
 */
public class buscar {
    public void BuscarTexto(){
        Color colorfondodefault;
        colorfondodefault = Vista.frm_buscar.txt_buscar.getBackground();
        Highlighter hilit;
        Highlighter.HighlightPainter painter;
        hilit = new DefaultHighlighter();
        painter = new DefaultHighlighter.DefaultHighlightPainter(Color.CYAN);
        Vista.frm_interfaz.txt_area.setHighlighter(hilit);
        hilit.removeAllHighlights();
        String s = Vista.frm_buscar.txt_buscar.getText();
        if (s.length() > 0) {
         String contenido = Vista.frm_interfaz.txt_area.getText();
            int index = contenido.indexOf(s, 0);
            if (index >= 0) {
                try {
                    int end = index + s.length();
                    hilit.addHighlight(index, end, painter);
                    Vista.frm_interfaz.txt_area.setCaretPosition(end);
                    Vista.frm_buscar.txt_buscar.setBackground(colorfondodefault);
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
            } else {
                Vista.frm_buscar.txt_buscar.setBackground(Color.ORANGE);
            }
        }else{
        }
    }
    
}
