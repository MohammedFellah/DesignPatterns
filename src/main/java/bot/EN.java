package bot;

//class bot anglais

public class EN implements IBot {


    @Override
    public void parlerFR(String text) {
    //nothing
    }

    @Override
    public void parlerEN(String text) {
        System.out.println(text+ "\nwelcome to english Bot");

    }
}
