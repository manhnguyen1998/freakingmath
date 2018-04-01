/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freaking.math;

/**
 *i
 * @author Root
 */

public class NewClass {
    
    public static void main(String arg[])
    {
        int highest;
   
       People p= new People("","",0);
        
         p.getNewPoint();
        highest= p.getPoint();
       System.out.print(""+highest);
      
}

    private int getPoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}