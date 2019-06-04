package feuTriColor;

public class Rouge extends Timer implements FeuTriColor {

    private String c1="rouge";
    Timer timer;


    public String getCouleur() {
        System.out.println(c1);
        return c1;
    }

    public String changeCouleur() {
        //timer.top();
        c1="vert";
        System.out.println(c1);
        return c1;
    }
}
//