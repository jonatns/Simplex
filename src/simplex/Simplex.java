/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplex;

/**
 *
 * @author jonatns
 */
public class Simplex {
     private static MainForm form = new MainForm();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       form.setTitle("Simplex");
       form.setSize(200, 200);
       form.setVisible(true);
    }
    
    public static void closeFrame() {
        form.dispose();
    }

    
}
