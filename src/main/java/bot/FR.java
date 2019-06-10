package bot;

//class bot fr
public class FR implements IBot {


    @Override
    public void parlerFR(String text) {

        System.out.println(text+"\n Bienvenue au Bot Français");

    }

    @Override
    public void parlerEN(String text) {
        //nothing
    }
}
