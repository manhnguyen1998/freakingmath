/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freaking.math;


public class People {
    private String iD;
    private String pass;
    private int point;
    
    People(String iD,String pass,int point){
        this.iD=iD;
        this.pass=pass;
        this.point=point;
    }

    People() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getNewPoint()
    {
       
           setPoint(5);  
           return point;
    }
}
