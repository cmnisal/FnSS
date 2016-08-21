/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fnss;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import pos.gui.POS_MainFrame;

/**
 *
 * @author Nisal
 */
public class FnSS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
            pos.gui.POS_MainFrame pos = new POS_MainFrame();
            pos.setVisible(true);
            
            // TODO code application logic here
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FnSS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
