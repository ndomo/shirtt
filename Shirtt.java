/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shirtt;

import static javax.swing.text.html.HTML.Attribute.ID;

/**
 *
 * @author proxy giga
 */
public class Shirtt {
public class Shirt {
        private static String prie;
        private static String stock;
public int shirtID = 0;
public String description = "-description-";
//The code are  R=red ,B=Blue ,G=Ggreend,U=Unset
public char colorCode = 'U';
public double price = 0.0;
public int quantityinStock = 0;
//This method displays the values for an item
 
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    // TODO code application logic here
    System.out.println("Shirtt ID:" + ID);
    System.out.println("Shirtt description:" + description);
    System.out.println("color Code:" + colorCode);
    System.out.println("Shirtt price:" + prie);
    System.out.println("Quantity in stock:" + stock);
    
        
        
    }
    
}
