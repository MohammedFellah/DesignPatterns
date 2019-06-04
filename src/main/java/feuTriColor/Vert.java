package feuTriColor;

public class Vert extends Timer implements FeuTriColor {

    private String c2="vert";
    Timer timer;


    public String getCouleur() {
        System.out.println(c2);
        return c2;
    }

    public String changeCouleur() {
        //timer.top();
        c2="orange";
        System.out.println("aprés 5 secondes: "+c2);
        return c2;
    }
}
//