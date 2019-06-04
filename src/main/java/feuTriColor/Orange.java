package feuTriColor;

public class Orange extends Timer implements FeuTriColor {


    private String c3="orange";
     Timer timer;

    public String getCouleur() {
        System.out.println(c3);
        return c3;
    }

    public String changeCouleur() {
        //timer.top();
        c3="rouge";
        System.out.println("aprés 5 secondes: "+c3);
        return c3;    }
}
//