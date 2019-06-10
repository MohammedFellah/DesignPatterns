package bot.adapter;

import bot.EN;
import bot.FR;
import bot.IBot;

public class BotAdapter implements BotTalker{
    IBot iBot;

    //créer un bot de la langue en fonction du premier mot reçu par le client
    public BotAdapter(String premierMot) {
        if(premierMot.equals("Bonjour")){
            iBot = new FR();
        }else if (premierMot.equals("Hello")){
            iBot = new EN();
        }

    }

    // appel aux méthodes des bot FR ou EN en fonction du premier mot
    @Override
    public void parler(String premierMot, String text) {
            if(premierMot.equals("Bonjour")){
                iBot.parlerFR(text);
            }else if(premierMot.equals("Hello")){
                iBot.parlerEN(text);
            }
    }
}
