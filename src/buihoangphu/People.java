package buihoangphu;


public class People {
    private String iD;
    private String pass;
    private int point;
    People(){}
    People(String iD,String pass,int point){
        this.iD=iD;
        this.pass=pass;
        this.point=point;
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
    
};
